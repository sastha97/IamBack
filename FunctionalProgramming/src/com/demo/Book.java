package com.demo;

public class Book implements Comparable<Book>{
	private int isbn;
	private String name;
	private String publication;
	private double price;
	
	public Book() {
		// TODO Auto-generated constructor stub
		isbn = 12;
		name = "Core Java";
		publication = "My Publication";
		price = 45.89;
	}

	public Book(int isbn, String name, String publication, double price) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.publication = publication;
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "isbn=" + isbn + ", name=" + name + ", publication=" + publication + ", price=" + price ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publication == null) ? 0 : publication.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn != other.isbn)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publication == null) {
			if (other.publication != null)
				return false;
		} else if (!publication.equals(other.publication))
			return false;
		return true;
	}
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		//return o.name.compareTo(this.name);
		return this.isbn-o.isbn;
	}
	
	
	
}
