package com.wxy.work.entity;
// Generated 2017-3-27 10:02:09 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Screen generated by hbm2java
 */
@Entity
@Table(name = "screen", catalog = "work")
public class Screen implements java.io.Serializable {

	private Integer screenId;
	private Cinema cinema;
	private Hall hall;
	private Movie movie;
	private Date openTime;
	private Float discount;
	private Set<Order> orders = new HashSet<Order>(0);

	public Screen() {
	}

	public Screen(Integer screenId, Cinema cinema, Hall hall, Movie movie, Date openTime, Float discount) {
		this.screenId = screenId;
		this.cinema = cinema;
		this.hall = hall;
		this.movie = movie;
		this.openTime = openTime;
		this.discount = discount;
	}
	
	public Screen(Cinema cinema, Hall hall, Movie movie, Date openTime) {
		this.cinema = cinema;
		this.hall = hall;
		this.movie = movie;
		this.openTime = openTime;
	}

	public Screen(Cinema cinema, Hall hall, Movie movie, Date openTime, Float discount, Set<Order> orders) {
		this.cinema = cinema;
		this.hall = hall;
		this.movie = movie;
		this.openTime = openTime;
		this.discount = discount;
		this.orders = orders;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "screen_id", unique = true, nullable = false)
	public Integer getScreenId() {
		return this.screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cinema_id", nullable = false)
	public Cinema getCinema() {
		return this.cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hall_id", nullable = false)
	public Hall getHall() {
		return this.hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "movie_id", nullable = false)
	public Movie getMovie() {
		return this.movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "open_time", nullable = false, length = 19)
	public Date getOpenTime() {
		return this.openTime;
	}

	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}

	@Column(name = "discount", precision = 12, scale = 0)
	public Float getDiscount() {
		return this.discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "screen")
	public Set<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

}