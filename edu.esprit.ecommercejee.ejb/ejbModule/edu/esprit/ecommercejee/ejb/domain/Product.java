package edu.esprit.ecommercejee.ejb.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity

public class Product implements Serializable {

	   
	@Id
	private int idProduct;
	private String NameProduct;
	private int Quantity;
	private static final long serialVersionUID = 1L;

	
	@ManyToOne
	private Category category;
	

	public Product() {
		super();
	}   
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}   
	public String getNameProduct() {
		return this.NameProduct;
	}

	public void setNameProduct(String NameProduct) {
		this.NameProduct = NameProduct;
	}   
	public int getQuantity() {
		return this.Quantity;
	}

	public void setQuantity(int Quantity) {
		this.Quantity = Quantity;
	}
   
}
