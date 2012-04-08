package pattern.beans;

import java.util.Date;

public class Groupe {

    private String nom;
    
    private String niveau;
    
    private Date dateDeCreation;
    
    private float tarif;

    public Groupe(){}
    
    public Groupe(String nom, String niveau ,Date dateDeCreation, float tarif)
    {
        this.nom=nom;
        this.niveau=niveau;
        this.dateDeCreation=dateDeCreation;
        this.tarif=tarif;
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
    
    public float returnTarif()
    {
        return this.tarif;
    }
    
    
}
