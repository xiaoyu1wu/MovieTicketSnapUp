package com.wxy.work.entity;
// Generated 2017-3-27 0:09:43 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Cinema generated by hbm2java
 */
@Entity
@Table(name = "cinema", catalog = "work")
public class Cinema implements java.io.Serializable {

	private Integer cinemaId;
	private String name;
	private String desciption;
	private String city;
	private String area;
	private String address;
	private String traffic;
	private String telephone;
	@JsonIgnore
	private Set<Screen> screens = new HashSet<Screen>(0);
	@JsonIgnore
	private Set<Hall> halls = new HashSet<Hall>(0);
	@JsonIgnore
	private Set<CinemaComment> cinemaComments = new HashSet<CinemaComment>(0);

	public Cinema() {
	}

	public Cinema(String name) {
		this.name = name;
	}

	public Cinema(String name, String desciption, String city, String area, String address, String traffic,
			String telephone, Set<Screen> screens, Set<Hall> halls, Set<CinemaComment> cinemaComments) {
		this.name = name;
		this.desciption = desciption;
		this.city = city;
		this.area = area;
		this.address = address;
		this.traffic = traffic;
		this.telephone = telephone;
		this.screens = screens;
		this.halls = halls;
		this.cinemaComments = cinemaComments;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "cinema_id", unique = true, nullable = false)
	public Integer getCinemaId() {
		return this.cinemaId;
	}

	public void setCinemaId(Integer cinemaId) {
		this.cinemaId = cinemaId;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "desciption")
	public String getDesciption() {
		return this.desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	@Column(name = "city")
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "area")
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "traffic")
	public String getTraffic() {
		return this.traffic;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	@Column(name = "telephone")
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cinema")
	public Set<Screen> getScreens() {
		return this.screens;
	}

	public void setScreens(Set<Screen> screens) {
		this.screens = screens;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cinema")
	public Set<Hall> getHalls() {
		return this.halls;
	}

	public void setHalls(Set<Hall> halls) {
		this.halls = halls;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cinema")
	public Set<CinemaComment> getCinemaComments() {
		return this.cinemaComments;
	}

	public void setCinemaComments(Set<CinemaComment> cinemaComments) {
		this.cinemaComments = cinemaComments;
	}

}
