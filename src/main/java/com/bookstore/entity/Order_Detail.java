package com.bookstore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order_Detail {
	@Id
private int order_id;
private int book_id;
private int quantity;
private float subtotal;
@Override
public String toString() {
	return "Order_Detail [order_id=" + order_id + ", book_id=" + book_id + ", quantity=" + quantity + ", subtotal="
			+ subtotal + "]";
}
public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
public int getBook_id() {
	return book_id;
}
public void setBook_id(int book_id) {
	this.book_id = book_id;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public float getSubtotal() {
	return subtotal;
}
public void setSubtotal(float subtotal) {
	this.subtotal = subtotal;
}


}
