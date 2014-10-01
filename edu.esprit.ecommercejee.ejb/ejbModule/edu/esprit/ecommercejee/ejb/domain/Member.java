package edu.esprit.ecommercejee.ejb.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Member
 *
 */
@Entity

public class Member implements Serializable {

	   
	@Id
	private int IdMember;
	private String LoginM;
	private String PasswordM;
	private static final long serialVersionUID = 1L;

	public Member() {
		super();
	}   
	public int getIdMember() {
		return this.IdMember;
	}

	public void setIdMember(int IdMember) {
		this.IdMember = IdMember;
	}   
	public String getLoginM() {
		return this.LoginM;
	}

	public void setLoginM(String LoginM) {
		this.LoginM = LoginM;
	}   
	public String getPasswordM() {
		return this.PasswordM;
	}

	public void setPasswordM(String PasswordM) {
		this.PasswordM = PasswordM;
	}
   
}
