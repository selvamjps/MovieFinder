package com.verizon.movie.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int insert(Movie movie) {
		return jdbcTemplate.update("INSERT INTO MOVIE_INQUIRY (TITLE, YEAR, REC_IND) " + "values(?,  ?, ?)",
				new Object[] {movie.getTitle(), movie.getYear(), movie.getRecInd() });
	}
}
