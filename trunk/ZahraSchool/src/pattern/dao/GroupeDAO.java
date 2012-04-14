package pattern.dao;

import java.sql.Connection;

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
	public GroupeEntity find2(String nom) {
		// TODO Auto-generated method stub
		GroupeEntity groupe = new GroupeEntity(); 
		return groupe;
	}
//
}
