package pattern.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import pattern.beans.Administrateur;
import pattern.entity.AdministrateurEntity;

public abstract class AdministrateurDAO extends DAO<AdministrateurEntity>{
	
	public AdministrateurDAO(Connection connexion) {
        super(connexion);
}
	public AdministrateurDAO(){}

	public boolean create(Administrateur obj) {
		return false;
	}

	public boolean delete(Administrateur obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Administrateur obj) {
		// TODO Auto-generated method stub
		return false;
	}

	public Administrateur find(String identifiant, String motDePasse) {
        
        Administrateur administrateur = new Administrateur();                
        
        try {
                ResultSet result = this.connect.createStatement(
                                                       ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                                       ResultSet.CONCUR_READ_ONLY
                                                ).executeQuery(
                                                       "SELECT * FROM administrateur WHERE identifiant = " + identifiant
                                                       + "AND motDePasse = " + motDePasse
                                                  );
                if(result.first())
                	
                        administrateur = new Administrateur(identifiant, motDePasse, result.getString("nom"), 
                        									result.getString("prenom"), result.getString("adresse"), 
                        									result.getInt("numeroTelephone"), 
                        		                            result.getString("niveauEtudes"), result.getDate("dateDeNaissance"), 
                        		                            result.getDate("dateEmbauche"));
               
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return administrateur;
	}
	@Override
	public boolean create(AdministrateurEntity obj) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(AdministrateurEntity obj) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean update(AdministrateurEntity obj) {
		// TODO Auto-generated method stub
		return false;
	}
}
