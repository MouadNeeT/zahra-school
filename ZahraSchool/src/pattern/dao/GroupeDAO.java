package pattern.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pattern.beans.Eleve;

import pattern.beans.Groupe;
import pattern.beans.Professeur;
import pattern.entity.EmploiDuTempsEntity;
import pattern.entity.GroupeEntity;

public class GroupeDAO extends DAO<GroupeEntity>{

	public GroupeDAO(){}
	
	public GroupeDAO(Connection connexion) {
        super(connexion);
}
	@Override
	public boolean create(GroupeEntity obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(GroupeEntity obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(GroupeEntity obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public GroupeEntity find(GroupeEntity obj) {
		// TODO Auto-generated method stub
		return obj;
	}
	
	@Override
	public GroupeEntity find3(String nom) {
		// TODO Auto-generated method stub
		return obj;
	}

	@Override
	public Groupe find2(String nom) {
		  Groupe groupe;                
                
                try {
                        ResultSet result = this.connect.createStatement(
                                                               ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                                               ResultSet.CONCUR_READ_ONLY
                                                        ).executeQuery(
                                                               "SELECT * FROM groupe WHERE nom = " + nom                                                   
                                                          );
                        if(result.first()){
                        	EleveDAO eleveDAO = new EleveDAO();
                        	ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();
                        	result.beforeFirst();
                        	while(result.next() && result.getInt("identifiant") != 0)
                        		listeEleves.add(eleveDAO.find(result.getString("nom"), result.getString("prenom")));
                        
                        	//public Groupe(String nom, String niveau ,Date dateDeCreation, float tarif,ArrayList<Eleve> listeEleves,EmploiDuTemps emploiDuTemps )
                        
                                groupe = new Groupe(nom, result.getString("niveau"), result.getDate("dateDeCreation"), 
                                		result.getFloat("tarif"), listeEleves,null);
                        
                        
                        }
          
                       
                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return groupe;
        
	}
//
}
