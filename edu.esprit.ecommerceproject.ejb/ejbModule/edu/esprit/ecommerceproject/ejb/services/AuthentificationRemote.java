package edu.esprit.ecommerceproject.ejb.services;

import javax.ejb.Remote;

import edu.esprit.ecommerceproject.ejb.entities.Administrator;

@Remote
public interface AuthentificationRemote {

	Administrator authentificate(String Login_A, String Password_A);

}
