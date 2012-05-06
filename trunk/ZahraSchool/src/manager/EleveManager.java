package manager;

import domaine.Eleve;
import entity.EleveEntity;
import java.util.ArrayList;

import entity.EntityFactory;
import pattern.dao.EleveDAO;

/**
 *
 * @author alexandre
 */
public class EleveManager {
	
	private EleveManager() {}

	private static class ManagerEleveHolder {
	        private final static EleveManager instance = new EleveManager();
	}

	    /**
	     * Methode permettant d'obtenir l'instance unique.
	     * @return L'instance du singleton.
	     */
	 public static EleveManager getInstance() {
	        return ManagerEleveHolder.instance;
	 }

	public  void  create(Eleve eleve) {
		EleveEntity eleveEntity = EntityFactory.getEleveEntity();

		eleveEntity.setListeProfesseurs(eleve.getListeProfesseurs());
		eleveEntity.setListeGroupes(eleve.getListeGroupes());
		eleveEntity.setListeGroupes(eleve.getListeGroupes());
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

		EleveDAO eleveDAO = new EleveDAO();
		eleveDAO.create(EleveEntity);
	}
	
	public Eleve readById(String id) {
		EleveDAO eleveDAO = new EleveDAO();
                return (eleveDAO.readById(id));
	}

        public Eleve readByNomPrenom(String nom, String prenom) {
 		EleveDAO eleveDAO = new EleveDAO();
                return (eleveDAO.readByNomPrenom(nom, prenom));
 	}
	
	public void delete(Eleve eleve){
		EleveEntity eleveEntity = EntityFactory.getEleveEntity();

                eleveEntity.setListeProfesseurs(eleve.getListeProfesseurs());
		
		EleveDAO eleveDAO = new EleveDAO();
		eleveDAO.delete(EleveEntity);
	}
	
	public ArrayList<Eleve> getAllEleves() {
		EleveDAO eleveDAO = new EleveDAO();
		return eleveDAO.getAllEleves();
	}
	
	public  void  update(Eleve eleve) {
		EleveEntity eleveEntity = EntityFactory.getEleveEntity();

		eleveEntity.setListeProfesseurs(eleve.getListeProfesseurs());
		eleveEntity.setListeGroupes(eleve.getListeGroupes());
		eleveEntity.setListeGroupes(eleve.getListeGroupes());
		eleveEntity.setListePaiements(eleve.getListePaiements());
		eleveEntity.setEmploiDuTemps(eleve.getEmploiDuTemps());
                eleveEntity.setIdentifiant(eleve.getIdentifiant());
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
		
		EleveDAO eleveDAO = new EleveDAO();
		eleveDAO.update(EleveEntity);
	}
}


