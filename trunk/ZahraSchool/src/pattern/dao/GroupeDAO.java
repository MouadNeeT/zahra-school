package pattern.dao;
import pattern.beans.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Date;

public class GroupeDAO extends DAO<Groupe> {

        public GroupeDAO(Connection connexion) {
                super(connexion);
        }

    @Override
        public boolean create(Groupe obj) {
                return false;
        }

    @Override
        public boolean delete(Groupe obj) {
                return false;
        }

        public Groupe find(String nom) {
                
                Groupe groupe = new Groupe();                
                
                try {
                        ResultSet result = this.connect.createStatement(
                                                               ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                                               ResultSet.CONCUR_READ_ONLY
                                                        ).executeQuery(
                                                               "SELECT * FROM groupe WHERE nom = " + nom
                                                              
                                                          );
                        if(result.first())
                        	
                                groupe = new Groupe(nom, result.getString("niveau"), 
                                		result.getDate("dateDeCreation"), 
                                		result.getFloat("tarif"));
                /*          public Groupe(String nom, String niveau ,Date dateDeCreation, float tarif)*/

                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return groupe;
        }

    @Override
        public boolean update(Groupe obj) {
                return false;
        }

    @Override
    public Groupe find(String nom, String prenom) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}