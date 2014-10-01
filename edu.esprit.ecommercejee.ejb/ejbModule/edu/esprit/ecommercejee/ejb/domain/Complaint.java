package edu.esprit.ecommercejee.ejb.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Complaint
 *
 */
@Entity

public class Complaint implements Serializable {

	   
	@Id
	private int idComplaint;
	private String Topic;
	private String mailingAdress;
	private static final long serialVersionUID = 1L;

	public Complaint() {
		super();
	}   
	public int getIdComplaint() {
		return this.idComplaint;
	}

	public void setIdComplaint(int idComplaint) {
		this.idComplaint = idComplaint;
	}   
	public String getTopic() {
		return this.Topic;
	}

	public void setTopic(String Topic) {
		this.Topic = Topic;
	}   
	public String getMailingAdress() {
		return this.mailingAdress;
	}

	public void setMailingAdress(String mailingAdress) {
		this.mailingAdress = mailingAdress;
	}
   
}
