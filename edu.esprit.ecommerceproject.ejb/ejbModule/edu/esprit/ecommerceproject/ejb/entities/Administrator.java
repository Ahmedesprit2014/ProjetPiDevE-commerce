package edu.esprit.ecommerceproject.ejb.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Administrator
 *
 */
@Entity

public class Administrator implements Serializable {

	
	private int Id;
	private String Login_A;
	private String Password_A;
	private String E_mail_A;
	private static final long serialVersionUID = 1L;

	public Administrator() {
		super();
	}   
	@Id    
	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}   
	public String getLogin_A() {
		return this.Login_A;
	}

	public void setLogin_A(String Login_A) {
		this.Login_A = Login_A;
	}   
	public String getPassword_A() {
		return this.Password_A;
	}

	public void setPassword_A(String Password_A) {
		this.Password_A = Password_A;
	}
	public String getE_mail_A() {
		return E_mail_A;
	}
	public void setE_mail_A(String e_mail_A) {
		E_mail_A = e_mail_A;
	}
   
}
