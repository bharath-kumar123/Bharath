package com.bharath.springnew.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TicketsBooked implements Serializable {
	private Long id;
	private Long theatreId;
	private Long movieId;
	private String showTime;
	private String createdDate;
	private String status;
	private Double totalPrice;
	private Integer nooftickets;
	@Override
	public String toString() {
		return "TicketsBooked [id=" + id + ", theatreId=" + theatreId + ", movieId=" + movieId + ", showTime="
				+ showTime + ", createdDate=" + createdDate + ", status=" + status + ", totalPrice=" + totalPrice
				+ ", nooftickets=" + nooftickets + "]";
	}
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
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getNooftickets() {
		return nooftickets;
	}
	public void setNooftickets(Integer nooftickets) {
		this.nooftickets = nooftickets;
	}
}
