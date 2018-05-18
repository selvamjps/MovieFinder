package com.verizon.movie;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MovieFinderPoller {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public void handleJdbcMessage(List<Map<String, Object>> message) {
		for (Map<String, Object> resultMap: message) 
		{
			String title = (String) resultMap.get("TITLE");
			String year = (String) resultMap.get("YEAR");
			
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> response = restTemplate.getForEntity(
			        "http://localhost:9090/fetch/movie?title="+title+"&"+"year="+year,
			        String.class);

			System.out.println(response); 
		}
	}
}
