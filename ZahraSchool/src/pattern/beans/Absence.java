package pattern.beans;

import java.util.Date;

public class Absence {
    /**
     * le motif de l'absence de l'�l�ve.
     * @see Absence#setMotif(String)
     * @see Absence#getMotif()
     */
    private String motif;
    private Date date;
    
    public Absence(){}
    
    public Absence(String motif, Date date)
    {
        this.motif=motif;
        this.date=date;
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
