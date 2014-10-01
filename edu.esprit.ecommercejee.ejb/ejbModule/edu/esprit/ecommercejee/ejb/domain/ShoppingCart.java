package edu.esprit.ecommercejee.ejb.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ShoppingCart
 *
 */
@Entity

public class ShoppingCart implements Serializable {

	   
	@Id
	private int idShCart;
	private int NumberProducts;
	private static final long serialVersionUID = 1L;

	public ShoppingCart() {
		super();
	}   
	public int getIdShCart() {
		return this.idShCart;
	}

	public void setIdShCart(int idShCart) {
		this.idShCart = idShCart;
	}   
	public int getNumberProducts() {
		return this.NumberProducts;
	}

	public void setNumberProducts(int NumberProducts) {
		this.NumberProducts = NumberProducts;
	}
   
}
