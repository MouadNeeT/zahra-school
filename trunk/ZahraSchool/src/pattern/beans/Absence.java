package pattern.beans;

import java.util.ArrayList;
import java.util.Date;

public class Absence {

    private String motif;
    private Date date;
   private ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();
    
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
    
        public void setListeEleves(ArrayList<Eleve> listeEleves)
    {
        this.listeEleves=listeEleves;
    }
    
    public ArrayList<Eleve> returnListeElves()
    {
        return this.listeEleves;
    }
    
    public void addEleve(Eleve eleve){
                this.listeEleves.add(eleve);
        }
        
   
        public void removeEleve(Eleve eleve){
                this.listeEleves.remove(eleve);
        }
        
}
