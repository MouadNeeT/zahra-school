package manager;

import java.util.ArrayList;

import dao.GroupeDAO;
import domaine.Eleve;
import domaine.Groupe;
import entity.EntityFactory;
import entity.GroupeEntity;

/**
 *
 * @author alexandre
 */
public class GroupeManager {
	
	private GroupeManager() {}

	private static class ManagerGroupeHolder {
	        private final static GroupeManager instance = new GroupeManager();
	}

	    /**
	     * Methode permettant d'obtenir l'instance unique.
	     * @return L'instance du singleton.
	     */
	 public static GroupeManager getInstance() {
	        return ManagerGroupeHolder.instance;
	 }

	public  void  create(Groupe groupe) {
		GroupeEntity groupeEntity = EntityFactory.getGroupeEntity();

		groupeEntity.setNom(groupe.getNom());
		groupeEntity.setNiveau(groupe.getNiveau());
		groupeEntity.setDate(groupe.getDateDeCreation());
		groupeEntity.setTarif(groupe.getTarif());
		groupeEntity.setEmploiDuTemps(groupe.getEmploiDuTemps());
		//groupeEntity.setListeEleves(groupe.getListeEleves());

		GroupeDAO groupeDAO = new GroupeDAO();
		groupeDAO.create(groupeEntity);	
	}
	
	public Groupe readById(String nom) {
		GroupeDAO groupeDAO = new GroupeDAO();
                return (groupeDAO.readByName(nom));
	}
	
	public void delete(Groupe groupe){
		GroupeEntity groupeEntity = EntityFactory.getGroupeEntity();

                groupeEntity.setNom(groupe.getNom());
		
		GroupeDAO groupeDAO = new GroupeDAO();
		groupeDAO.delete(groupeEntity);
	}
	
	public ArrayList<Groupe> getAllGroupes() {
		GroupeDAO groupeDAO = new GroupeDAO();
		return groupeDAO.getAllGroupes();
	}
	
	public  void  update(Groupe groupe) {
		GroupeEntity groupeEntity = EntityFactory.getGroupeEntity();

		groupeEntity.setNom(groupe.getNom());
		groupeEntity.setNiveau(groupe.getNiveau());
		groupeEntity.setDate(groupe.getDateDeCreation());
		groupeEntity.setTarif(groupe.getTarif());
		groupeEntity.setEmploiDuTemps(groupe.getEmploiDuTemps());
		//groupeEntity.setListeEleves(groupe.getListeEleves());
		
		GroupeDAO groupeDAO = new GroupeDAO();
		groupeDAO.update(groupeEntity);
	}
	
	public ArrayList<Integer> recupererElevesFromGroupe(String identifiantGroupe) {
		GroupeEntity groupeEntity = EntityFactory.getGroupeEntity();
		GroupeDAO groupeDAO = new GroupeDAO();
		return groupeDAO.recupererElevesFromGroupe(identifiantGroupe);
	}
}


