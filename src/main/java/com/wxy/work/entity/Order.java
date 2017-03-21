package com.wxy.work.entity;
// Generated 2017-2-24 19:51:24 by Hibernate Tools 4.3.1.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "order", catalog = "work")
public class Order implements java.io.Serializable {

	private Integer id;
	private Integer sum;
	private Float allPrice;
	private String status;
	private Date buyTime;
	private Set<Ticket> tickets = new HashSet<Ticket>(0);

	public Order() {
	}

	public Order(Integer sum, String status) {
		this.sum = sum;
		this.status = status;
	}

	public Order(Integer sum, Float allPrice, String status, Date buyTime, Set<Ticket> tickets) {
		this.sum = sum;
		this.allPrice = allPrice;
		this.status = status;
		this.buyTime = buyTime;
		this.tickets = tickets;
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

	@Column(name = "sum", nullable = false)
	public Integer getSum() {
		return this.sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	@Column(name = "all_price", precision = 12, scale = 0)
	public Float getAllPrice() {
		return this.allPrice;
	}

	public void setAllPrice(Float allPrice) {
		this.allPrice = allPrice;
	}

	@Column(name = "status", nullable = false)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "buy_time", length = 19)
	public Date getBuyTime() {
		return this.buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
	public Set<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

}
