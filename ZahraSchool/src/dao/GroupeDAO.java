package dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import domaine.Eleve;
import domaine.EmploiDuTemps;
import domaine.Groupe;
import domaine.Matiere;
import domaine.Paiement;
import domaine.Professeur;

import entity.GroupeEntity;

public class GroupeDAO {
	private JdbcTemplate jdbcTemplate;
	
	public GroupeDAO(){}
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplat
		
		e = new JdbcTemplate(dataSource);
	}
	
	
	public void create(GroupeEntity groupe) {
    	Connection conn = null;
		PreparedStatement stmt = null;		
		try {
		final String GROUPE_INSERT = "insert into groupe (nom,  niveau , dateDeCreation,  tarif, listeEleves, emploiDuTemps) "
				+ " values (?,?,?,?,?,?)"; 


		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		//<---------------- ne pas oublier de changer
        DataSource ds = (DataSource) appContext.getBean("datasource2");
        
        conn = ds.getConnection();
		stmt = conn.prepareStatement(GROUPE_INSERT);
	        /*
		 * On récupère et on utilisera directement le jdbcTemplate
		 */
		
		stmt.setString(1, groupe.getNom());
		stmt.setString(2, groupe.getNiveau());
		stmt.setDate(3, (java.sql.Date) groupe.getDateDeCreation());
		stmt.setFloat(4, groupe.getTarif());
		stmt.setObject(5, groupe.getListeEleves());
		stmt.setObject(6, groupe.getEmploiDuTemps());
		
		
		stmt.execute();
		} catch (SQLException e) {
				e.printStackTrace();
		} finally {
			try {
				if(stmt != null) { stmt.close(); }
				if(conn != null) { conn.close(); }
			} catch (SQLException e) {}
		}
    }
	
	public Eleve readByName(String nom){
    	Connection conn = null;
		PreparedStatement stmt = null; 
		ResultSet rs = null;

		try {
		String sql = "select nom,  niveau , dateDeCreation,  tarif, listeEleves, emploiDuTemps from eleve where nom = ?";

		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
        DataSource dataSource = (DataSource) appContext.getBean("datasource2");
        
        conn = dataSource.getConnection();
		stmt = conn.prepareStatement(sql);
	
		stmt.setString(1, nom);
		rs = stmt.executeQuery();
		Groupe groupe = null;
		if(rs.next()) {
			groupe = new Groupe();
			groupe.setNom(rs.getString("nom"));
			groupe.setNiveau(rs.getString("niveau"));
			groupe.setDateDeCreation(rs.getDate("dateDeCreation"));
			groupe.setTarif(rs.getFloat("tarif"));
			groupe.setListeEleves((ArrayList<Eleve> rs.getObject("listeEleves"));
			groupe.setEmploiDuTemps((EmploiDuTemps) rs.getObject("emploiDuTemps"));
			
		}
		
		return groupe;

	} catch (SQLException e) {
	e.printStackTrace();
	

	} finally {
	try {
		if(rs != null) { rs.close(); }
	if(stmt != null) { stmt.close(); }
	if(conn != null) { conn.close(); }
	} catch (SQLException e) {
		
	}
	}
	return null;
    }
	
	
	public void delete (GroupeEntity groupe) {
    	Connection conn = null;
		PreparedStatement stmt = null;		
		try {
			String nom = groupe.getNom();
			
		String sql = "DELETE FROM groupe where nom = '" + nom + "'";
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		//<---------------- ne pas oublier de changer
        DataSource ds = (DataSource) appContext.getBean("datasource2");
        
        conn = ds.getConnection();
		stmt = conn.prepareStatement(sql);
		
		
		
		stmt.execute(sql);
		} catch (SQLException e) {
				e.printStackTrace();
		} finally {
			try {
				if(stmt != null) { stmt.close(); }
				if(conn != null) { conn.close(); }
			} catch (SQLException e) {}
		}
		
		
    }
	
	  public void update (GroupeEntity groupe) {
      	Connection conn = null;
  		PreparedStatement stmt = null;		
  		String nom = groupe.getNom();
  		
  		try {
  		final String sql = 
  				 
  				"UPDATE eleve set nom = '" + groupe.getNom() + "', niveau = '" + groupe.getNiveau() + "'," +
  						 					 "dateDeCreation = '" + groupe.getDateDeCreation() + "'," + "tarif = '" + groupe.getTarif() + "',"+
  						                     "listeEleves = '" + groupe.getListeEleves() + "'," + "emploiDuTemps = '" + groupe.getEmploiDuTemps() + "'";

  		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
  		//<---------------- ne pas oublier de changer
          DataSource ds = (DataSource) appContext.getBean("datasource2");
          
          conn = ds.getConnection();
  		stmt = conn.prepareStatement(sql);
	
  		stmt.execute(sql);
  		} catch (SQLException e) {
  				e.printStackTrace();
  		} finally {
  			try {
  				if(stmt != null) { stmt.close(); }
  				if(conn != null) { conn.close(); }
  			} catch (SQLException e) {}
  		}
      }

}
