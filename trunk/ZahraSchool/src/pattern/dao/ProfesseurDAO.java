package pattern.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import pattern.beans.Professeur;

/**
 * <b>Professeur DAO</b>
 * <p>
 * Le professeur est recherch� dans la base de donn�e gr�ce aux �l�ments suivants :
 * <ul>
 * <li>le nom du professeur.</li>
 * <li>le prenom du professeur.</li>
 * </ul>
 * </p>
 *<p>
 * En fonction du nom et du pr�nom, les autres �l�ments sont retrouv�s dans la
 * base de donn�es.
 * </p>
 * 
 * @see ProfesseurDAO
 * @see DAO
 * 
 * @author GAUTIER St�phanie
 * @version 1.0
 */
/*
public class ProfesseurDAO extends DAO<Professeur>{

	public ProfesseurDAO(Connection conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

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
                        		result.getDate("dateEmbauche"));
               
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return professeur;
	}

}
*/