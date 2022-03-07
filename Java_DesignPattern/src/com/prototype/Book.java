package com.prototype;

public class Book {
private String bookName;
private int bookId;
private String author;
private int price;
public Book(String bookName, int bookId, String author, int price) {
	super();
	this.bookName = bookName;
	this.bookId = bookId;
	this.author = author;
	this.price = price;
}
public Book() {
	// TODO Auto-generated constructor stub
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [bookName=" + bookName + ", bookId=" + bookId + ", author=" + author + ", price=" + price + "]";
}


}
