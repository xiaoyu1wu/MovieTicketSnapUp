package com.wxy.work.entity;
// Generated 2017-3-27 0:14:30 by Hibernate Tools 4.3.1.Final

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
 * Hall generated by hbm2java
 */
@Entity
@Table(name = "hall", catalog = "work")
public class Hall implements java.io.Serializable {

	private Integer hallId;
	private int number;
	private Integer allCount;
	private Integer leftSeatCount;
	private int cinemaId;
	@JsonIgnore
	private Set<SeatPlan> seatPlans = new HashSet<SeatPlan>(0);

	public Hall() {
	}

	public Hall(int number, int cinemaId) {
		this.number = number;
		this.cinemaId = cinemaId;
	}

	public Hall(int number, Integer allCount, Integer leftSeatCount, int cinemaId, Set<SeatPlan> seatPlans) {
		this.number = number;
		this.allCount = allCount;
		this.leftSeatCount = leftSeatCount;
		this.cinemaId = cinemaId;
		this.seatPlans = seatPlans;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "hall_id", unique = true, nullable = false)
	public Integer getHallId() {
		return this.hallId;
	}

	public void setHallId(Integer hallId) {
		this.hallId = hallId;
	}

	@Column(name = "number", nullable = false)
	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Column(name = "all_count")
	public Integer getAllCount() {
		return this.allCount;
	}

	public void setAllCount(Integer allCount) {
		this.allCount = allCount;
	}

	@Column(name = "left_seat_count")
	public Integer getLeftSeatCount() {
		return this.leftSeatCount;
	}

	public void setLeftSeatCount(Integer leftSeatCount) {
		this.leftSeatCount = leftSeatCount;
	}

	@Column(name = "cinema_id", nullable = false)
	public int getCinemaId() {
		return this.cinemaId;
	}

	public void setCinemaId(int cinemaId) {
		this.cinemaId = cinemaId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hall")
	public Set<SeatPlan> getSeatPlans() {
		return this.seatPlans;
	}

	public void setSeatPlans(Set<SeatPlan> seatPlans) {
		this.seatPlans = seatPlans;
	}

}
