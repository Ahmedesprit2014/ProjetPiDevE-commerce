package edu.esprit.ecommerceproject.ejb.services;

import javax.ejb.Local;

import edu.esprit.ecommerceproject.ejb.entities.Administrator;

@Local
public interface AuthentificationLocal {
	Administrator authentificate(String Login_A, String Password_A);

}
