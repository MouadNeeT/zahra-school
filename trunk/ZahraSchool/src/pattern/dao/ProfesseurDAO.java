package pattern.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pattern.beans.Eleve;
import pattern.beans.Matiere;
import pattern.beans.Professeur;
import pattern.entity.ProfesseurEntity;

/**
 * <b>Professeur DAO</b>
 * <p>
 * Le professeur est recherché dans la base de donnée grâce aux éléments suivants :
 * <ul>
 * <li>le nom du professeur.</li>
 * <li>le prenom du professeur.</li>
 * </ul>
 * </p>
 *<p>
 * En fonction du nom et du prénom, les autres éléments sont retrouvés dans la
 * base de données.
 * </p>
 * 
 * @see ProfesseurDAO
 * @see DAO
 * 
 * @author GAUTIER Stéphanie
 * @version 1.0
 */

public class ProfesseurDAO extends DAO<ProfesseurEntity>{

	public ProfesseurDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}
	public ProfesseurDAO(){}

	@Override
	public boolean create(Professeur obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Professeur obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Professeur obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Professeur find(String nom, String prenom) {
		Professeur professeur = new Professeur();                
        
        try {
                ResultSet result = this.connect.createStatement(
                                                       ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                                       ResultSet.CONCUR_READ_ONLY
                                                ).executeQuery(
                                                       "SELECT * FROM professeur WHERE nom = " + nom
                                                       + "AND prenom = " + prenom
                                                  );
                if(result.first())
                	
                        professeur = new Professeur(result.getString("identifiant"), result.getString("motDePasse"), 
                        		nom, prenom, 
                        		result.getString("adresse"), result.getInt("numeroTelephone"), 
                        		result.getString("niveauEtudes"), result.getDate("dateDeNaissance"), 
                        		result.getDate("dateEmbauche"), result.getArray(arg0)
                        		ArrayList<Eleve> listeEleves, ArrayList<Matiere> listeMatieres);
               
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return professeur;
	}

	@Override
	public boolean create(ProfesseurEntity obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(ProfesseurEntity obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(ProfesseurEntity obj) {
		// TODO Auto-generated method stub
		return false;
	}
}
