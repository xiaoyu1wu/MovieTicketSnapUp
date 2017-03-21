package com.wxy.work.entity;
// Generated 2017-2-24 19:51:24 by Hibernate Tools 4.3.1.Final

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

/**
 * Cinema generated by hbm2java
 */
@Entity
@Table(name = "cinema", catalog = "work")
public class Cinema implements java.io.Serializable {

	private Integer id;
	private String name;
	private String desciption;
	private String city;
	private String area;
	private Set<ScreenSchedule> screenSchedules = new HashSet<ScreenSchedule>(0);
	private Set<Hall> halls = new HashSet<Hall>(0);

	public Cinema() {
	}

	public Cinema(String name) {
		this.name = name;
	}

	public Cinema(String name, String desciption, String city, String area, Set<ScreenSchedule> screenSchedules,
			Set<Hall> halls) {
		this.name = name;
		this.desciption = desciption;
		this.city = city;
		this.area = area;
		this.screenSchedules = screenSchedules;
		this.halls = halls;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cinema")
	public Set<ScreenSchedule> getScreenSchedules() {
		return this.screenSchedules;
	}

	public void setScreenSchedules(Set<ScreenSchedule> screenSchedules) {
		this.screenSchedules = screenSchedules;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cinema")
	public Set<Hall> getHalls() {
		return this.halls;
	}

	public void setHalls(Set<Hall> halls) {
		this.halls = halls;
	}

}
