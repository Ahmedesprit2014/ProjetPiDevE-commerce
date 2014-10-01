package edu.esprit.ecommercejee.ejb.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.ecommercejee.ejb.domain.Administrator;


/**
 * Session Bean implementation class AdministratorMg
 */
@Stateless
public class AdministratorMg implements AdministratorMgRemote {
	
	@PersistenceContext
	EntityManager em;
    Administrator admin;
	

    /**
     * Default constructor. 
     */
    public AdministratorMg() {
        // TODO Auto-generated constructor stub
    }

}
