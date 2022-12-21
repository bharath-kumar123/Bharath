package com.bharath.springnew.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TicketDto implements Serializable {
	private Long theatreId;
	private Long movieId;
	private String showTime;
	private Integer numberOfTheatre;
	@Override
	public String toString() {
		return "TheatreDto [theatreId=" + theatreId + ", movieId=" + movieId + ", showTime=" + showTime
				+ ", numberOfTheatre=" + numberOfTheatre + "]";
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
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public Integer getNumberOfTheatre() {
		return numberOfTheatre;
	}
	public void setNumberOfTheatre(Integer numberOfTheatre) {
		this.numberOfTheatre = numberOfTheatre;
	}

}
