package pattern.dao;
import pattern.beans.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Date;

import pattern.beans.Eleve;

/**
 * <b>ELeve DAO</b>
 * <p>
 * L'élève est recherché dans la base de donnée grâce aux éléments suivants :
 * <ul>
 * <li>le nom de l'élève.</li>
 * <li>le prenom de l'élève.</li>
 * </ul>
 * </p>
 *<p>
 * En fonction du nom et du prénom, les autres éléments sont retrouvés dans la
 * base de données.
 * </p>
 * 
 * @see EleveDAO
 * @see DAO
 * 
 * @author GAUTIER Stéphanie
 * @version 1.0
 */

public class EleveDAO extends DAO<Eleve> {

        public EleveDAO(Connection connexion) {
                super(connexion);
        }

        public boolean create(Eleve obj) {
                return false;
        }

        public boolean delete(Eleve obj) {
                return false;
        }

        public Eleve find(String nom, String prenom) {
                
                Eleve eleve = new Eleve();                
                
                try {
                        ResultSet result = this.connect.createStatement(
                                                               ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                                               ResultSet.CONCUR_READ_ONLY
                                                        ).executeQuery(
                                                               "SELECT * FROM eleve WHERE nom = " + nom
                                                               + "AND prenom = " + prenom
                                                          );
                        if(result.first())
                        	
                                eleve = new Eleve(result.getInt("identifiant"), nom, prenom, 
                                		result.getInt("age"), result.getDate("dateDeNaissance"), 
                                		result.getString("photo"), result.getInt("numeroTelephoneEleve"), 
                                		result.getInt("numeroTelephoneParent"), result.getDate("dateInscription"), 
                                		result.getString("niveauEtudes"), result.getString("nomPere"), 
                                		result.getString("prenomPere"), result.getString("nomMere"), 
                                		result.getString("prenomMere"), result.getString("status"), result.getString("niveauTest"));
                       
                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return eleve;
        }

        public boolean update(Eleve obj) {
                return false;
        }

}