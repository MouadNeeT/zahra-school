package pattern.beans;

import pattern.beans.*;
import java.util.ArrayList;
import java.util.Date;

public class Groupe {

    private ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();
    
    private String nom;
    
    private String niveau;
    
    private Date dateDeCreation;
    
    private float tarif;

    public Groupe(){}
    
    public Groupe(String nom, String niveau ,Date dateDeCreation, float tarif, ArrayList<Eleve> listeEleves)
    {
        this.nom=nom;
        this.niveau=niveau;
        this.dateDeCreation=dateDeCreation;
        this.tarif=tarif;
        this.listeEleves=listeEleves;
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
        
        /**
         * Retire une matière de la liste des cours dispensés
         * @param Matiere
         */
        public void removeEleve(Eleve eleve){
                this.listeEleves.remove(eleve);
        }
}
