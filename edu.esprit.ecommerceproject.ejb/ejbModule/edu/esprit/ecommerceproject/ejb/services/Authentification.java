package edu.esprit.ecommerceproject.ejb.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.ecommerceproject.ejb.entities.Administrator;

/**
 * Session Bean implementation class Authentification
 */
@Stateless
public class Authentification implements AuthentificationRemote, AuthentificationLocal {

    /**
     * Default constructor. 
     */
	
	@PersistenceContext
	EntityManager entityManager;
    public Authentification() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Administrator authentificate(String Login_A, String Password_A) {
		Administrator admin = null;
		javax.persistence.Query query = entityManager
				.createQuery("select a  from Admin a where a.login=:l and a.Password=:p");
		query.setParameter("l", Login_A).setParameter("p", Password_A);
		try {
			admin = (Administrator) query.getSingleResult();

		} catch (Exception e) {
			admin = null;
			// TODO: handle exception
		}
		return admin;

	
	
	}

}
