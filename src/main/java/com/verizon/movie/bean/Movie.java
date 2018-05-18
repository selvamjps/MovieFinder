package com.verizon.movie.bean;

public class Movie {

	private String title;
	private String year;
	private int recInd;
	
	public Movie(String title, String year)
	{
		this.title = title;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getRecInd() {
		return recInd;
	}
	public void setRecInd(int recInd) {
		this.recInd = recInd;
	}
}
