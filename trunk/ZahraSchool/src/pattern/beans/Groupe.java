package pattern.beans;

import pattern.beans.*;
import java.util.ArrayList;
import java.util.Date;

public class Groupe {

    private ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();
    private ArrayList<Matiere> listeMatieres = new ArrayList<Matiere>();
    private ArrayList<Professeur> listeProfesseur = new ArrayList<Professeur>();
    
    private EmploiDuTemps emploiDuTemps;
    
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
        
        
        /*-----------------------------------------------------------------*/
         public void setListeMatieres(ArrayList<Matiere> listeMatieres)
    {
        this.listeMatieres=listeMatieres;
    }
    
    public ArrayList<Matiere> returnListeMatieres()
    {
        return this.listeMatieres;
    }
    
    public void addEleve(Matiere matiere){
                this.listeMatieres.add(matiere);
        }
        

        public void removeMatiere(Matiere Matieres){
                this.listeMatieres.remove(Matieres);
        }
        
     public void setListeProfesseur(ArrayList<Professeur> listeProfesseur)
    {
        this.listeProfesseur=listeProfesseur;
    }
    
    public ArrayList<Professeur> returnListeProfesseur()
    {
        return this.listeProfesseur;
    }
    
    public void addProfesseur(Professeur professeur){
                this.listeProfesseur.add(professeur);
        }
        
  
        public void removeProfesseur(Professeur professeur){
                this.listeProfesseur.remove(professeur);
        }
        
        
         public void setEmploi(EmploiDuTemps EmploiDuTemps)
    {
        this.emploiDuTemps=EmploiDuTemps;
    }
    
    public EmploiDuTemps returnEmploiDuTemps()
    {
        return this.emploiDuTemps;
    }
}
