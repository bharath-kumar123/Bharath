package com.bharath.springnew.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MovieSchedule implements Serializable {
	private Long id;
	private Long theatreId;
	private Long movieId;
	private String showTimings;
	private Double totalTicket;
	private Double price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Long theatreId) {
		this.theatreId = theatreId;
	}
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public String getShowTimings() {
		return showTimings;
	}
	public void setShowTimings(String showTimings) {
		this.showTimings = showTimings;
	}
	public Double getTotalTicket() {
		return totalTicket;
	}
	public void setTotalTicket(Double totalTicket) {
		this.totalTicket = totalTicket;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
