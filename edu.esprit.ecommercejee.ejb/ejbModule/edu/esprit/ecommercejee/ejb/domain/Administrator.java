package edu.esprit.ecommercejee.ejb.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Administrator
 *
 */
@Entity

public class Administrator implements Serializable {

	   
	@Id
	private String loginA;
	private String PasswordA;
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "administrator")
	private List<Category> categories = new ArrayList<Category>();

	public Administrator() {
		super();
	}   
	public String getLoginA() {
		return this.loginA;
	}

	public void setLoginA(String loginA) {
		this.loginA = loginA;
	}   
	public String getPasswordA() {
		return this.PasswordA;
	}

	public void setPasswordA(String PasswordA) {
		this.PasswordA = PasswordA;
	}
   
}
