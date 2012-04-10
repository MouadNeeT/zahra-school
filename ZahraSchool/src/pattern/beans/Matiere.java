package pattern.beans;

import java.util.ArrayList;

public class Matiere {
    
    private String nom;
    private String type;
    private ArrayList<EmploiDuTemps> listeEmploiDuTemps;
    private ArrayList<Professeur> listeProfesseurs;
    private ArrayList<Groupe> listeGroupes;
    
    public Matiere(){}
    
    public Matiere(String nom, String type, ArrayList<Professeur> listeProfesseurs,
    		ArrayList<Groupe> listeGroupes, ArrayList<EmploiDuTemps> listeEmploiDuTemps)
    {
        this.nom=nom;
        this.type= type;
        this.listeEmploiDuTemps = listeEmploiDuTemps;
        this.listeProfesseurs = listeProfesseurs;
        this.listeGroupes = listeGroupes;
    }
    
    public void setNom(String nom)
    {
        this.nom=nom;
    }
    public String getNom()
    {
        return this.nom;
    }
    
     public void setType(String type)
    {
        this.type=type;
    }
    public String getType()
    {
        return this.type;
    }

	/**
	 * @param e
	 * @return
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	public boolean add(EmploiDuTemps e) {
		return listeEmploiDuTemps.add(e);
	}

	/**
	 * @param o
	 * @return
	 * @see java.util.ArrayList#remove(java.lang.Object)
	 */
	public boolean remove(Object o) {
		return listeEmploiDuTemps.remove(o);
	}

	/**
	 * @return the listeEmploiDuTemps
	 */
	public ArrayList<EmploiDuTemps> getListeEmploiDuTemps() {
		return listeEmploiDuTemps;
	}

	/**
	 * @param listeEmploiDuTemps the listeEmploiDuTemps to set
	 */
	public void setListeEmploiDuTemps(ArrayList<EmploiDuTemps> listeEmploiDuTemps) {
		this.listeEmploiDuTemps = listeEmploiDuTemps;
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
	 * @return the listeGroupes
	 */
	public ArrayList<Groupe> getListeGroupes() {
		return listeGroupes;
	}

	/**
	 * @param listeGroupes the listeGroupes to set
	 */
	public void setListeGroupes(ArrayList<Groupe> listeGroupes) {
		this.listeGroupes = listeGroupes;
	}
    
}
