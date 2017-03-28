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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "work")
public class User implements java.io.Serializable {

	private Integer userId;
	private String userEmail;
	private String userPassword;
	private String userUsername;
	private String userNickname;
	private String userSex;
	private String userAge;
	private String userPhone;
	private String userPhoto;
	private Date userBirthday;
	private String userBornCity;
	private String userLivingCity;
	private Set<Invite> invitesForResponseUserId = new HashSet<Invite>(0);
	private Set<MovieComment> movieComments = new HashSet<MovieComment>(0);
	private Set<Invite> invitesForRequestUserId = new HashSet<Invite>(0);
	private Set<Order> orders = new HashSet<Order>(0);
	private Set<CinemaComment> cinemaComments = new HashSet<CinemaComment>(0);

	public User() {
	}

	public User(String userEmail, String userPassword) {
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}

	public User(String userEmail, String userPassword, String userUsername, String userNickname, String userSex,
			String userAge, String userPhone, String userPhoto, Date userBirthday, String userBornCity,
			String userLivingCity, Set<Invite> invitesForResponseUserId, Set<MovieComment> movieComments,
			Set<Invite> invitesForRequestUserId, Set<Order> orders, Set<CinemaComment> cinemaComments) {
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userUsername = userUsername;
		this.userNickname = userNickname;
		this.userSex = userSex;
		this.userAge = userAge;
		this.userPhone = userPhone;
		this.userPhoto = userPhoto;
		this.userBirthday = userBirthday;
		this.userBornCity = userBornCity;
		this.userLivingCity = userLivingCity;
		this.invitesForResponseUserId = invitesForResponseUserId;
		this.movieComments = movieComments;
		this.invitesForRequestUserId = invitesForRequestUserId;
		this.orders = orders;
		this.cinemaComments = cinemaComments;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "user_email", nullable = false)
	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Column(name = "user_password", nullable = false)
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Column(name = "user_username")
	public String getUserUsername() {
		return this.userUsername;
	}

	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}

	@Column(name = "user_nickname")
	public String getUserNickname() {
		return this.userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	@Column(name = "user_sex")
	public String getUserSex() {
		return this.userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	@Column(name = "user_age")
	public String getUserAge() {
		return this.userAge;
	}

	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}

	@Column(name = "user_phone")
	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	@Column(name = "user_photo")
	public String getUserPhoto() {
		return this.userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "user_birthday", length = 19)
	public Date getUserBirthday() {
		return this.userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}

	@Column(name = "user_born_city")
	public String getUserBornCity() {
		return this.userBornCity;
	}

	public void setUserBornCity(String userBornCity) {
		this.userBornCity = userBornCity;
	}

	@Column(name = "user_living_city")
	public String getUserLivingCity() {
		return this.userLivingCity;
	}

	public void setUserLivingCity(String userLivingCity) {
		this.userLivingCity = userLivingCity;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByResponseUserId")
	public Set<Invite> getInvitesForResponseUserId() {
		return this.invitesForResponseUserId;
	}

	public void setInvitesForResponseUserId(Set<Invite> invitesForResponseUserId) {
		this.invitesForResponseUserId = invitesForResponseUserId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<MovieComment> getMovieComments() {
		return this.movieComments;
	}

	public void setMovieComments(Set<MovieComment> movieComments) {
		this.movieComments = movieComments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userByRequestUserId")
	public Set<Invite> getInvitesForRequestUserId() {
		return this.invitesForRequestUserId;
	}

	public void setInvitesForRequestUserId(Set<Invite> invitesForRequestUserId) {
		this.invitesForRequestUserId = invitesForRequestUserId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<CinemaComment> getCinemaComments() {
		return this.cinemaComments;
	}

	public void setCinemaComments(Set<CinemaComment> cinemaComments) {
		this.cinemaComments = cinemaComments;
	}

}
