/**
 * author GAUTIER Stéphanie
 */

package pattern.entity;

import java.util.ArrayList;

import pattern.beans.EmploiDuTemps;
import pattern.beans.Heure;

public class JourEntity extends Entity{
	private ArrayList<Heure> listeHeures;
	private EmploiDuTemps emploiDuTemps;
	
	public JourEntity(){}
	
	public JourEntity(ArrayList<Heure> listeHeures, EmploiDuTemps emploiDuTemps){
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

