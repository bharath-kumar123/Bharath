package com.bharath.springnew.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.bharath.springnew.constant.AppConstant;

@SuppressWarnings("serial")
@Entity
@Table(name=AppConstant.MOVIEDETAILS_INFO)
public class MovieDetails implements Serializable {
	@Id
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="id")
	private Long id;
	@Column(name="moviename")
	private String movieName;
	@Column(name="actorname")
	private String actorName;
	@Column(name="actressname")
	private String actressName;
	@Column(name="releasedate")
	private String releaseDate;
	@Column(name="rating")
	private String rating;
	@Column(name="budget")
	private Double budget;
	@Override
	public String toString() {
		return "MovieDetails [id=" + id + ", movieName=" + movieName + ", actorName=" + actorName + ", actressName="
				+ actressName + ", releaseDate=" + releaseDate + ", rating=" + rating + ", budget=" + budget + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getActressName() {
		return actressName;
	}
	public void setActressName(String actressName) {
		this.actressName = actressName;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
}
