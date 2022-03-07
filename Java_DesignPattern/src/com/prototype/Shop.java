package com.prototype;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Cloneable {
private String shopName;
private String owner;
private List<Book> books = new ArrayList<>();
public Shop(String shopName, String owner, List<Book> books) {
	super();
	this.shopName = shopName;
	this.owner = owner;
	this.books = books;
}
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public List<Book> getBooks() {
	return books;
}
public List<Book> getBooks2() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}

public Shop() {
	super();
}
public void load_Book(){
	
	for(int i=1;i<=10;i++) {
		Book b= new Book();
		b.setBookId(i);
		b.setBookName("Book" +i);
		getBooks().add(b);
	}
	
}
@Override
public String toString() {
	return "Shop [shopName=" + shopName + ", owner=" + owner + ", books=" + books + "]";
}

@Override
protected Shop clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	Shop s1 = new Shop();
	//Deep Cloning
	for(Book b:this.getBooks2()) {
		s1.getBooks().add(b);
	}
	
	return s1;
}



}
