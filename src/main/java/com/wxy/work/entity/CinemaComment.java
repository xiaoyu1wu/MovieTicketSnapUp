package com.wxy.work.entity;
// Generated 2017-3-27 10:02:09 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CinemaComment generated by hbm2java
 */
@Entity
@Table(name = "cinema_comment", catalog = "work")
public class CinemaComment implements java.io.Serializable {

	private String commentId;
	private Cinema cinema;
	private User user;
	private String commentContent;
	private Date commentTime;

	public CinemaComment() {
	}

	public CinemaComment(String commentId, Cinema cinema, User user) {
		this.commentId = commentId;
		this.cinema = cinema;
		this.user = user;
	}

	public CinemaComment(String commentId, Cinema cinema, User user, String commentContent, Date commentTime) {
		this.commentId = commentId;
		this.cinema = cinema;
		this.user = user;
		this.commentContent = commentContent;
		this.commentTime = commentTime;
	}

	@Id

	@Column(name = "comment_id", unique = true, nullable = false)
	public String getCommentId() {
		return this.commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
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
	@JoinColumn(name = "user_id", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "comment_content")
	public String getCommentContent() {
		return this.commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "comment_time", length = 19)
	public Date getCommentTime() {
		return this.commentTime;
	}

	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}

}
