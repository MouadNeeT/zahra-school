package database;

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

import domaine.Administrateur;
import domaine.Eleve;
import domaine.Professeur;


public class SpringJDBC {
	
	/******************** A D M I N I S T R A T E U R *********************************************/
	public void saveAdministrateur(Administrateur administrateur) {
		Connection conn = null;
		PreparedStatement stmt = null;		
		try {
			final String ADMINISTRATEUR_INSERT =
				"insert into administrateur (identifiant,motDePasse) " +
				"values (?,?)";
			
			/* Chargement conteneur Spring et récupération bean SataSource	*/
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
			//<---------------- ne pas oublier de changer
	        DataSource ds = (DataSource) appContext.getBean("datasource2");
	        
	        conn = ds.getConnection();
			stmt = conn.prepareStatement(ADMINISTRATEUR_INSERT);
			
			stmt.setString(1, administrateur.getIdentifiant());
			stmt.setString(2, administrateur.getMotDePasse());
			
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
	/**
	 * Récupération Employe avec à partir de son id
	 */
	public Administrateur getAdministrateurbyId(String identifiant) {
		Connection conn = null;
		PreparedStatement stmt = null; 
		ResultSet rs = null;

		try {
			final String ADMINISTRATEUR_QUERY =
				"select  identifiant, motDePasse from administrateur where identifiant=?";
			
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
	        DataSource dataSource = (DataSource) appContext.getBean("datasource2");
	        
	        conn = dataSource.getConnection();
			stmt = conn.prepareStatement(ADMINISTRATEUR_QUERY);
		
			stmt.setString(1, identifiant);
			rs = stmt.executeQuery();
			Administrateur administrateur = null;
			if(rs.next()) {
				administrateur = new Administrateur();
				administrateur.setIdentifiant(rs.getString("identifiant"));
				administrateur.setMotDePasse(rs.getString("motDePasse"));
			}
			
			return administrateur;
	
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
	
	/************************************** P R O F E S S E U R *****************************************/
	
	public void saveProfesseur(Professeur professeur) {
		Connection conn = null;
		PreparedStatement stmt = null;		
		try {
			final String PROFESSEUR_INSERT =
				"insert into professeur (identifiant,motDePasse, nom, prenom, adresse, numeroTelephone, niveauEtudes, dateDeNaissance, dateEmbauche, listeEleves, listeMatieres) " +
				"values (?,?,?,?,?,?,?,?,?,?,?)";
			
			/* Chargement conteneur Spring et récupération bean SataSource	*/
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
			//<---------------- ne pas oublier de changer
	        DataSource ds = (DataSource) appContext.getBean("datasource2");
	        
	        conn = ds.getConnection();
			stmt = conn.prepareStatement(PROFESSEUR_INSERT);
			
			stmt.setString(1, professeur.getIdentifiant());
			stmt.setString(2, professeur.getMotDePasse());
			stmt.setString(3, professeur.getNom());
			stmt.setString(4, professeur.getPrenom());
			stmt.setString(5, professeur.getAdresse());
			stmt.setInt(6, professeur.getNumeroTelephone());
			stmt.setString(7, professeur.getNiveauEtudes());
			stmt.setDate(8, (Date) professeur.getDateDeNaissance());
			stmt.setDate(9, (Date) professeur.getDateEmbauche());
			stmt.setObject(10, professeur.getListeEleves());
			stmt.setObject(11, professeur.getListeMatieres());
			
			
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
	
	public void deleteProfesseur(String nom, String prenom) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			JdbcTemplate jdbcTemplate = new JdbcTemplate();
			//Professeur professeur = SpringJDBC.getProfesseurByName(nom, prenom);
			/* Chargement conteneur Spring et récupération bean SataSource	*/
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
			//<---------------- ne pas oublier de changer
	        DataSource ds = (DataSource) appContext.getBean("datasource2");
	        String DELETE_PROFESSEUR ="DELETE FROM professeur WHERE nom = ? and prenom=?";
	        conn = ds.getConnection();
			stmt = conn.prepareStatement(DELETE_PROFESSEUR);
	        
			/*stmt.setString(3, professeur.getNom());
			stmt.setString(4, professeur.getPrenom());
			stmt.setString(5, professeur.getAdresse());
			stmt.setInt(6, professeur.getNumeroTelephone());
			stmt.setString(7, professeur.getNiveauEtudes());
			stmt.setDate(8, (Date) professeur.getDateDeNaissance());
			stmt.setDate(9, (Date) professeur.getDateEmbauche());
			stmt.setObject(10, professeur.getListeEleves());
			stmt.setObject(11, professeur.getListeMatieres());*/
		} catch (SQLException e) {
		e.printStackTrace();
		} finally {
		try {
		if(stmt != null) { stmt.close(); }
		if(conn != null) { conn.close(); }
		} catch (SQLException e) {}
		}
			
	}
	
	public ArrayList<Professeur> getAllProfesseurs() {
		
		Connection conn = null;
		PreparedStatement stmt = null;	
		ResultSet resultats = null;
		
	    final String requete = "";
	    ArrayList<Professeur> listeProfesseurs = new ArrayList<Professeur>();
		
	    try {
	    	//JdbcTemplate jdbcTemplate = new JdbcTemplate();
			//Professeur professeur = SpringJDBC.getProfesseurByName(nom, prenom);
			/* Chargement conteneur Spring et récupération bean SataSource	*/
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
			//<---------------- ne pas oublier de changer
	        DataSource ds = (DataSource) appContext.getBean("datasource2");
	        conn = ds.getConnection();
			PreparedStatement ALL = conn.prepareStatement("select identifiant,motDePasse, nom, prenom, adresse, numeroTelephone, niveauEtudes, dateDeNaissance, dateEmbauche, listeEleves, listeMatieres from professeur");
			resultats = ALL.executeQuery();
			
			boolean encore = resultats.next();

		      while (encore) {
		        System.out.print(resultats.getString(1) + resultats.getString(2) + resultats.getString(3) + resultats.getString(4) + resultats.getString(5) + resultats.getInt(6) + resultats.getString(7) + resultats.getDate(8) + resultats.getDate(9) + resultats.getObject(10) +resultats.getObject(11));
		        ArrayList<Eleve> list = new ArrayList<Eleve>();
		        list = (ArrayList<Eleve>) resultats.getObject(10);
		        System.out.println("liste: "+list);
		        Professeur p = new Professeur(resultats.getString(1), resultats.getString(2), resultats.getString(3), resultats.getString(4), resultats.getString(5), resultats.getInt(6), resultats.getString(7), resultats.getDate(8), resultats.getDate(9), (ArrayList<Eleve>) resultats.getObject(10),(ArrayList) resultats.getObject(11));
		        listeProfesseurs.add(p);
		        encore = resultats.next();
		      }

		      resultats.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeProfesseurs;
	}

	
	public SpringJDBC() {
		super();
	}
}
