package manager;


import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.AdministrateurDAO;
import dao.DAO;
import dao.DAOFactory;
import dao.ProfesseurDAO;
import domaine.Administrateur;
import domaine.Professeur;
import entity.EntityFactory;
import entity.ProfesseurEntity;

public class ProfesseurManager {
	
	private ProfesseurManager(){
		
	}
	private static class ManagerProfesseurHolder {
	        private final static ProfesseurManager instance = new ProfesseurManager();
	    }

	    /**
	     * Methode permettant d'obtenir l'instance unique.
	     * @return L'instance du singleton.
	     */
	    public static ProfesseurManager getInstance() {
	        return ManagerProfesseurHolder.instance;
	    }

	public  void  create(Professeur professeur) {
		//
		ProfesseurEntity professeurEntity = EntityFactory.getProfesseurEntity();
		professeurEntity.setIdentifiant(professeur.getIdentifiant());
		professeurEntity.setMotDePasse(professeur.getMotDePasse());
		professeurEntity.setAdresse(professeur.getAdresse());
		professeurEntity.setDateDeNaissance(professeur.getDateDeNaissance());
		professeurEntity.setDateEmbauche(professeur.getDateEmbauche());
		professeurEntity.setNiveauEtudes(professeur.getNiveauEtudes());
		professeurEntity.setNom(professeur.getNom());
		professeurEntity.setPrenom(professeur.getPrenom());
		professeurEntity.setNumeroTelephone(professeur.getNumeroTelephone());
		professeurEntity.setListeEleves(professeur.getListeEleves());
		professeurEntity.setListeMatieres(professeur.getListeMatieres());
		

		ProfesseurDAO professeurDAO = new ProfesseurDAO();
		professeurDAO.create(professeurEntity);
			
	}
	
	public Professeur readById(String identifiant) {
		 
		ProfesseurDAO professeurDAO = new ProfesseurDAO();
    	return (professeurDAO.readById(identifiant));
	}
	
	public Professeur readByNomPrenom(String nom, String prenom) {
		 
		ProfesseurDAO professeurDAO = new ProfesseurDAO();
    	return (professeurDAO.readByNomPrenom(nom, prenom));
	}
	
	public void delete(Professeur professeur){
		
		ProfesseurEntity professeurEntity = EntityFactory.getProfesseurEntity();
		professeurEntity.setIdentifiant(professeur.getIdentifiant());
		professeurEntity.setMotDePasse(professeur.getMotDePasse());
		professeurEntity.setAdresse(professeur.getAdresse());
		professeurEntity.setDateDeNaissance(professeur.getDateDeNaissance());
		professeurEntity.setDateEmbauche(professeur.getDateEmbauche());
		professeurEntity.setNiveauEtudes(professeur.getNiveauEtudes());
		professeurEntity.setNom(professeur.getNom());
		professeurEntity.setPrenom(professeur.getPrenom());
		professeurEntity.setNumeroTelephone(professeur.getNumeroTelephone());
		professeurEntity.setListeEleves(professeur.getListeEleves());
		professeurEntity.setListeMatieres(professeur.getListeMatieres());
		

		ProfesseurDAO professeurDAO = new ProfesseurDAO();
		professeurDAO.delete(professeurEntity);
		
	}
	
	public ArrayList<Professeur> getAllProfesseurs() {
		ProfesseurDAO professeurDAO = new ProfesseurDAO();
		return professeurDAO.getAllProfesseurs();
	}
	
	public  void  update(Professeur professeur) {
		//
		ProfesseurEntity professeurEntity = EntityFactory.getProfesseurEntity();
		professeurEntity.setIdentifiant(professeur.getIdentifiant());
		professeurEntity.setMotDePasse(professeur.getMotDePasse());
		professeurEntity.setAdresse(professeur.getAdresse());
		professeurEntity.setDateDeNaissance(professeur.getDateDeNaissance());
		professeurEntity.setDateEmbauche(professeur.getDateEmbauche());
		professeurEntity.setNiveauEtudes(professeur.getNiveauEtudes());
		professeurEntity.setNom(professeur.getNom());
		professeurEntity.setPrenom(professeur.getPrenom());
		professeurEntity.setNumeroTelephone(professeur.getNumeroTelephone());
		professeurEntity.setListeEleves(professeur.getListeEleves());
		professeurEntity.setListeMatieres(professeur.getListeMatieres());
		

		ProfesseurDAO professeurDAO = new ProfesseurDAO();
		professeurDAO.update(professeurEntity);
			
	}
}


