package com.bookstore.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Review {
	@Id
	private int review_id;
	private int book_id;
	private int customer_id;
	private int rating;
	private String headline;
	private String comment;
	private Timestamp review_time;
	@Override
	public String toString() {
		return "review [review_id=" + review_id + ", book_id=" + book_id + ", customer_id=" + customer_id + ", rating="
				+ rating + ", headline=" + headline + ", comment=" + comment + ", review_time=" + review_time + "]";
	}
	public int getReview_id() {
		return review_id;
	}
	public void setReview_id(int review_id) {
		this.review_id = review_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Timestamp getReview_time() {
		return review_time;
	}
	public void setReview_time(Timestamp review_time) {
		this.review_time = review_time;
	}
	
	
	

}
