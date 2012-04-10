package pattern.beans;

import java.util.ArrayList;

public class Jour {
	
	private ArrayList<Heure> listeHeures;
	private EmploiDuTemps emploiDuTemps;
	
	public Jour(){}
	
	public Jour(ArrayList<Heure> listeHeures, EmploiDuTemps emploiDuTemps){
		this.emploiDuTemps = emploiDuTemps;
		this.listeHeures = listeHeures;
	}

	/**
	 * @param e
	 * @return
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	public boolean add(Heure e) {
		return listeHeures.add(e);
	}

	/**
	 * @param o
	 * @return
	 * @see java.util.ArrayList#remove(java.lang.Object)
	 */
	public boolean remove(Object o) {
		return listeHeures.remove(o);
	}

	/**
	 * @return the listeHeures
	 */
	public ArrayList<Heure> getListeHeures() {
		return listeHeures;
	}

	/**
	 * @param listeHeures the listeHeures to set
	 */
	public void setListeHeures(ArrayList<Heure> listeHeures) {
		this.listeHeures = listeHeures;
	}

	/**
	 * @return the emploiDuTemps
	 */
	public EmploiDuTemps getEmploiDuTemps() {
		return emploiDuTemps;
	}

	/**
	 * @param emploiDuTemps the emploiDuTemps to set
	 */
	public void setEmploiDuTemps(EmploiDuTemps emploiDuTemps) {
		this.emploiDuTemps = emploiDuTemps;
	}
	

}
