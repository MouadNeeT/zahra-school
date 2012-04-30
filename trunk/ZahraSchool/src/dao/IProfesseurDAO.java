package dao;

import java.util.ArrayList;
import java.util.List;

import domaine.Administrateur;
import domaine.Professeur;

public interface IProfesseurDAO {
	
	  public Professeur getProfesseurById(String identifiant);
	  public Professeur getProfesseurByLogin(String login);
	  public Professeur getProfesseurByName(String nom, String prenom);
	  public void saveProfesseur(Professeur professeur);
	  public int getProfesseurCount();
	  public List getAllProfesseurs();

}
