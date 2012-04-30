package dao;

import java.util.List;

import domaine.Administrateur;

public interface IAdministrateurDAO {
	
	  public Administrateur getAdministrateurById(String identifiant);
	  public Administrateur getAdministrateurByLogin(String login);
	  public void saveAdministrateur(Administrateur admin);
	  public int getAdministrateurCount();
	  public List<Administrateur> getAllAdministrateurs();

}
