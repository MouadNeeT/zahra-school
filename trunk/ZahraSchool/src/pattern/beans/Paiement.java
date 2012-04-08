package pattern.beans;

import java.util.Date;

public class Paiement {
    
private Date datePrevue;
private Date dateEncaissement;
private float montant;
private String mois;
private Eleve eleve;

public  Paiement(){}

public  Paiement(Date datePrevue,Date dateEncaissement,float montant,String mois, Eleve eleve){
this.datePrevue=datePrevue;
this.dateEncaissement= dateEncaissement;
this.montant=montant;
this.mois=mois;
this.eleve=eleve;
}

 public void setDateEncaissement(Date dateEncaissement)
    {
        this.dateEncaissement=dateEncaissement;
    }
    
    public Date getDateEncaissement()
    {
        return this.dateEncaissement;
    }
    
     public void setDatePrevue(Date datePrevue)
    {
        this.datePrevue=datePrevue;
    }
    
    public Date getDatePrevue()
    {
        return this.datePrevue;
    }
    
     public void setMontant(float montant)
    {
        this.montant=montant;
    }
    
    public float returnMontant()
    {
        return this.montant;
    }
    
     public void setMois(String mois){
        this.mois= mois;
    }
    
    public String getMois()
    {
        return this.mois;
    }

      public void setEleve(Eleve eleve){
      this.eleve= eleve;
    }
    
    public Eleve getEleve()
    {
        return this.eleve;
    }
}
