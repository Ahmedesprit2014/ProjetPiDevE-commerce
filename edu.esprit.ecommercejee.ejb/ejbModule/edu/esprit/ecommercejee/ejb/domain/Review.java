package edu.esprit.ecommercejee.ejb.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Review
 *
 */
@Entity

public class Review implements Serializable {

	   
	@Id
	private int IdReview;
	private String Subject;
	private static final long serialVersionUID = 1L;

	public Review() {
		super();
	}   
	public int getIdReview() {
		return this.IdReview;
	}

	public void setIdReview(int IdReview) {
		this.IdReview = IdReview;
	}   
	public String getSubject() {
		return this.Subject;
	}

	public void setSubject(String Subject) {
		this.Subject = Subject;
	}
   
}
