/**
 * author GAUTIER Stéphanie
 */

package entity;

import java.util.Date;

import domaine.Eleve;



public class AbsenceEntity extends Entity {

	/**
     * le motif de l'absence de l'élève.
     * @see Absence#setMotif(String)
     * @see Absence#getMotif()
     */
    private String motif;
    private Date date;
    private int identifiant;
    private int identifiantEleve;

    
    public AbsenceEntity(){}
    
    public AbsenceEntity(int identifiant, String motif, Date date, int identifiantEleve)
    {
    	this.identifiantEleve=identifiantEleve;
        this.motif=motif;
        this.date=date;
        this.identifiant = identifiant;
    }
    
    /**
	 * @return the identifiant
	 */
	public int getIdentifiant() {
		return identifiant;
	}

	/**
	 * @param eleve the identifiant to set
	 */
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
    
     /**
	 * @return the eleve
	 */
	public int getIdentifiantEleve() {
		return identifiantEleve;
	}

	/**
	 * @param eleve the eleve to set
	 */
	public void setIdentifiantEleve(int identifiantEleve) {
		this.identifiantEleve = identifiantEleve;
	}

	/**
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	public void setMotif(String Motif){
        this.motif= Motif;
    }
    
    public String getmotif()
    {
        return this.motif;
    }
    
      public void setDate(Date date)
    {
        this.date=date;
    }
    
    public Date getDate()
    {
        return this.date;
    }
    

}
