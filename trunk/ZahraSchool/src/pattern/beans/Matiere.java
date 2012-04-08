package pattern.beans;

public class Matiere {
    
    private String nom;
    private String type;
    
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
    
}
