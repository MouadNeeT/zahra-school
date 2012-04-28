package pattern.beans;

import java.util.ArrayList;
import java.util.Date;

public class Groupe {
    private EmploiDuTemps emploiDuTemps;
    private ArrayList<Eleve> listeEleves;
    private Groupe groupe;
    private String nom;
    private String niveau;
    private Date dateDeCreation;
    private float tarif;

    public Groupe() {}
    
    public Groupe(String nom, String niveau ,Date dateDeCreation, float tarif,ArrayList<Eleve> listeEleves,EmploiDuTemps emploiDuTemps )
    {
        this.nom=nom;
        this.niveau=niveau;
        this.dateDeCreation=dateDeCreation;
        this.tarif=tarif;
        this.listeEleves=listeEleves;
        this.emploiDuTemps= emploiDuTemps;
    }
    
    public void setNom(String Nom){
        this.nom= Nom;
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public void setNiveau(String Niveau)
    {
        this.niveau=Niveau;
    }
    
    public String getNiveau()
    {
        return this.niveau;
    }
    
    public void setDate(Date dateDeCreation)
    {
        this.dateDeCreation=dateDeCreation;
    }
    
    public Date getDateDeCreation()
    {
        return this.dateDeCreation;
    }
    
    public void setTarif(float tarif)
    {
        this.tarif=tarif;
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
	 * @return the tarif
	 */
	public float getTarif() {
		return tarif;
	}

	/**
	 * @param e
	 * @return
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	public boolean add(Eleve e) {
		return listeEleves.add(e);
	}

	/**
	 * @param o
	 * @return
	 * @see java.util.ArrayList#remove(java.lang.Object)
	 */
	public boolean remove(Object o) {
		return listeEleves.remove(o);
	}

	/**
	 * @param dateDeCreation the dateDeCreation to set
	 */
	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
    
    
}
