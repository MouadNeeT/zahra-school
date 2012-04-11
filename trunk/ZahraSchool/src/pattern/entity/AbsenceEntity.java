/**
 * author GAUTIER Stéphanie
 */

package pattern.entity;

import java.util.Date;

import pattern.beans.Absence;
import pattern.beans.Eleve;

public class AbsenceEntity extends Entity {

	/**
     * le motif de l'absence de l'élève.
     * @see Absence#setMotif(String)
     * @see Absence#getMotif()
     */
    private String motif;
    private Date date;
    private Eleve eleve;
    
    public AbsenceEntity(){}
    
    public AbsenceEntity(Eleve eleve, String motif, Date date)
    {
    	this.eleve=eleve;
        this.motif=motif;
        this.date=date;
    }
    
     /**
	 * @return the eleve
	 */
	public Eleve getEleve() {
		return eleve;
	}

	/**
	 * @param eleve the eleve to set
	 */
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
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
