package edu.esprit.ecommercejee.ejb.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity

public class Category implements Serializable {

	   
	@Id
	private int idCategory;
	private String NameCategory;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Administrator administrator;
	
	
	
	@OneToMany(mappedBy = "category")
	private List<Product> products = new ArrayList<Product>();



	public Category() {
		super();
	}   
	public int getIdCategory() {
		return this.idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}   
	public String getNameCategory() {
		return this.NameCategory;
	}

	public void setNameCategory(String NameCategory) {
		this.NameCategory = NameCategory;
	}
   
}
