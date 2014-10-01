package edu.esprit.ecommercejee.ejb.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Payment
 *
 */
@Entity

public class Payment implements Serializable {

	   
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)			
	private int idPayment;
	private String TypeCard;
	private float amount;
	private int NumberCard;
	private static final long serialVersionUID = 1L;

	public Payment() {
		super();
	}   
	public int getIdPayment() {
		return this.idPayment;
	}

	public void setIdPayment(int idPayment) {
		this.idPayment = idPayment;
	}   
	public String getTypeCard() {
		return this.TypeCard;
	}

	public void setTypeCard(String TypeCard) {
		this.TypeCard = TypeCard;
	}   
	public float getAmount() {
		return this.amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}   
	public int getNumberCard() {
		return this.NumberCard;
	}

	public void setNumberCard(int NumberCard) {
		this.NumberCard = NumberCard;
	}
   
}
