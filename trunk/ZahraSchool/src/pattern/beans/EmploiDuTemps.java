package pattern.beans;

import java.util.ArrayList;

public class EmploiDuTemps {
	
	private ArrayList<Jour> listeJours;
	private ArrayList<Matiere> listeMatieres;
	private ArrayList<Professeur> listeProfesseurs;
	private Groupe groupe; 
	private ArrayList<Eleve> listeEleves;
	
	public EmploiDuTemps(){}
	
	public EmploiDuTemps(ArrayList<Jour> listeJours, ArrayList<Matiere> listeMatieres, 
			ArrayList<Professeur> professeur, Groupe groupe, ArrayList<Eleve> listeEleves, ArrayList<Professeur> listeProfesseurs){
		this.listeJours = listeJours;
		this.listeEleves = listeEleves;
		this.listeMatieres = listeMatieres;
		this.groupe = groupe;
		this.listeProfesseurs = listeProfesseurs;	
	}

	/**
	 * @return the listeJours
	 */
	public ArrayList<Jour> getListeJours() {
		return listeJours;
	}

	/**
	 * @param listeJours the listeJours to set
	 */
	public void setListeJours(ArrayList<Jour> listeJours) {
		this.listeJours = listeJours;
	}

	/**
	 * @return the listeMatieres
	 */
	public ArrayList<Matiere> getListeMatieres() {
		return listeMatieres;
	}

	/**
	 * @param listeMatieres the listeMatieres to set
	 */
	public void setListeMatieres(ArrayList<Matiere> listeMatieres) {
		this.listeMatieres = listeMatieres;
	}

	/**
	 * @return the listeProfesseurs
	 */
	public ArrayList<Professeur> getListeProfesseurs() {
		return listeProfesseurs;
	}

	/**
	 * @param listeProfesseurs the listeProfesseurs to set
	 */
	public void setListeProfesseurs(ArrayList<Professeur> listeProfesseurs) {
		this.listeProfesseurs = listeProfesseurs;
	}

	/**
	 * @return the groupe
	 */
	public Groupe getGroupe() {
		return groupe;
	}

	/**
	 * @param groupe the groupe to set
	 */
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	/**
	 * @return the listeEleves
	 */
	public ArrayList<Eleve> getListeEleves() {
		return listeEleves;
	}

	/**
	 * @param listeEleves the listeEleves to set
	 */
	public void setListeEleves(ArrayList<Eleve> listeEleves) {
		this.listeEleves = listeEleves;
	}
	
	/**
	 * @param e
	 * @return
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	public boolean add(Eleve eleve) {
		return listeEleves.add(eleve);
	}

	/**
	 * @param o
	 * @return
	 * @see java.util.ArrayList#remove(java.lang.Object)
	 */
	public boolean remove(Eleve eleve) {
		return listeEleves.remove(eleve);
	}
	
	/**
	 * @param e
	 * @return
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	public boolean add(Jour e) {
		return listeJours.add(e);
	}

	/**
	 * @param o
	 * @return
	 * @see java.util.ArrayList#remove(java.lang.Object)
	 */
	public boolean remove(Jour jour) {
		return listeJours.remove(jour);
	}
	
	/**
	 * @param e
	 * @return
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	public boolean add(Matiere e) {
		return listeMatieres.add(e);
	}

	/**
	 * @param o
	 * @return
	 * @see java.util.ArrayList#remove(java.lang.Object)
	 */
	public boolean remove(Matiere o) {
		return listeMatieres.remove(o);
	}
	
	/**
	 * @param e
	 * @return
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	public boolean add(Professeur e) {
		return listeProfesseurs.add(e);
	}

	/**
	 * @param o
	 * @return
	 * @see java.util.ArrayList#remove(java.lang.Object)
	 */
	public boolean remove(Object o) {
		return listeProfesseurs.remove(o);
	}
	
	
	

	
}
