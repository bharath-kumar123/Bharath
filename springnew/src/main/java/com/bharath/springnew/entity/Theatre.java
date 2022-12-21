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
@Table(name=AppConstant.THEATRE_INFO)
public class Theatre implements Serializable {
	@Id
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="id")
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="city")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="address")
	private String address;
	@Override
	public String toString() {
		return "Theatre [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", address=" + address
				+ "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
