package pattern.beans;

import java.util.ArrayList;

public class Matiere {
    
    private String nom;
    private String type;
    
    private ArrayList<Groupe> listeGroupes = new ArrayList<Groupe>();
    private ArrayList<Professeur> listeProfesseur = new ArrayList<Professeur>();
    private EmploiDuTemps emploiDuTemps;
    
    
    public Matiere()
    {}
    
    public Matiere(String nom, String type)
    {
        this.nom=nom;
        this.type= type;
    }
    
    public void setNom(String nom)
    {
        this.nom=nom;
    }
    public String getNom()
    {
        return this.nom;
    }
    
     public void settype(String type)
    {
        this.type=type;
    }
    public String gettype()
    {
        return this.type;
    }
    
       public void setListeGroupes(ArrayList<Groupe> listeGroupes)
    {
        this.listeGroupes=listeGroupes;
    }
    
    public ArrayList<Groupe> returnListeGroupes()
    {
        return this.listeGroupes;
    }
    
    public void addGroupe(Groupe group){
                this.listeGroupes.add(group);
        }
        

        public void removeGroupe(Groupe group){
                this.listeGroupes.remove(group);
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
