package manager;

import java.sql.Date;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.AbsenceDAO;

import dao.AdministrateurDAO;
import dao.DAO;
import dao.DAOFactory;
import dao.EleveDAO;
import dao.ProfesseurDAO;
import domaine.Absence;
import domaine.Administrateur;
import domaine.Eleve;
import entity.AbsenceEntity;
import entity.AdministrateurEntity;
import entity.EleveEntity;
import entity.EntityFactory;

public class AbsenceManager {
	
	private AbsenceManager(){
		
	}
	private static class ManagerAbsenceHolder {
	        private final static AbsenceManager instance = new AbsenceManager();
	    }

	    /**
	     * Methode permettant d'obtenir l'instance unique.
	     * @return L'instance du singleton.
	     */
	    public static AbsenceManager getInstance() {
	        return ManagerAbsenceHolder.instance;
	    }

	public  void  createAbsenceEleve(Absence absence, Eleve eleve) {
		//
		AbsenceEntity absenceEntity = EntityFactory.getAbsenceEntity();
		EleveEntity eleveEntity = EntityFactory.getEleveEntity();
		absenceEntity.setMotif(absence.getMotif());
		absenceEntity.setIdentifiantEleve(absence.getIdentifiantEleve());
		absenceEntity.setDate(absence.getDate());
		absenceEntity.setIdentifiant(absence.getIdentifiant());
		eleveEntity.setListeProfesseurs(eleve.getListeProfesseurs());
		//eleveEntity.setListeGroupes(eleve.getListeGroupes());
		eleveEntity.setListePaiements(eleve.getListePaiements());
		eleveEntity.setEmploiDuTemps(eleve.getEmploiDuTemps());
		eleveEntity.setNom(eleve.getNom());
        eleveEntity.setPrenom(eleve.getPrenom());
        eleveEntity.setAge(eleve.getAge());
        eleveEntity.setDateDeNaissance(eleve.getDateDeNaissance());
        eleveEntity.setPhoto(eleve.getPhoto());
        eleveEntity.setNumeroTelephoneEleve(eleve.getNumeroTelephoneEleve());
        eleveEntity.setNumeroTelephoneParent(eleve.getNumeroTelephoneParent());
        eleveEntity.setDateInscription(eleve.getDateInscription());
        eleveEntity.setNomPere(eleve.getNomPere());
        eleveEntity.setPrenomPere(eleve.getPrenomPere());
        eleveEntity.setNomMere(eleve.getNomMere());
        eleveEntity.setPrenomMere(eleve.getPrenomMere());
        eleveEntity.setStatus(eleve.getStatus());
        eleveEntity.setNiveauTest(eleve.getNiveauTest());
        eleveEntity.setNiveauEtudes(eleve.getNiveauEtudes());
        eleveEntity.setIdentifiant(eleve.getIdentifiant());
        eleveEntity.setAdresse(eleve.getAdresse());
		
		AbsenceDAO absenceDAO = new AbsenceDAO();
		absenceDAO.createAbsenceEleve(absenceEntity, eleveEntity);
	
	}
	
	public ArrayList<Absence> getAllAbsences() {
		AbsenceDAO absenceDAO = new AbsenceDAO();
		return absenceDAO.getAllAbsences();
	}
	
public ArrayList<Absence> getAllAbsencesFromIdEleve(int identifiantEleve) {
	AbsenceDAO absence = new AbsenceDAO();
	return absence.getAllAbsencesFromIdEleve(identifiantEleve);
		
	}
	}


