package pattern.dao;
import pattern.beans.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Date;

import pattern.beans.Absence;

/*

public class AbsenceDAO extends DAO<Absence> {

        public AbsenceDAO(Connection connexion) {
                super(connexion);
        }

        public boolean create(Eleve obj) {
                return false;
        }

        public boolean delete(Eleve obj) {
                return false;
        }

        public Absence find(String nom, String prenom) {
                
                Absence Absence = new Absence();                
                
                try {
                        ResultSet absence = this.connect.createStatement(
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
                return Absence;
        }

        public boolean update(Absence obj) {
                return false;
        }
        
   

}*/