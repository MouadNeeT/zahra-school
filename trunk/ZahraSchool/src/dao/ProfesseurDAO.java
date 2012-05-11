package dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;

import manager.ProfesseurManager;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import domaine.Administrateur;
import domaine.Eleve;
import domaine.Matiere;
import domaine.Professeur;
import entity.EntityFactory;
import entity.ProfesseurEntity;

public class ProfesseurDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public ProfesseurDAO(){}
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}


	public Professeur readById(String identifiant) {
		Connection conn = null;
		PreparedStatement stmt = null; 
		ResultSet rs = null;

		try {
		String sql = "select identifiant, motDePasse, nom, prenom, adresse, numeroTelephone, niveauEtudes, dateDeNaissance, dateEmbauche, listeEleves, listeMatieres from professeur where identifiant = ?";

		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
        DataSource dataSource = (DataSource) appContext.getBean("datasource2");
        
        conn = dataSource.getConnection();
		stmt = conn.prepareStatement(sql);
	
		stmt.setString(1, identifiant);
		rs = stmt.executeQuery();
		Professeur professeur = null;
		if(rs.next()) {
			professeur = new Professeur();
			professeur.setIdentifiant(rs.getString("identifiant"));
			professeur.setMotDePasse(rs.getString("motDePasse"));
			professeur.setNom(rs.getString("nom"));
			professeur.setPrenom(rs.getString("prenom"));
			professeur.setAdresse(rs.getString("adresse"));
			professeur.setNumeroTelephone(rs.getInt("numeroTelephone"));
			professeur.setNiveauEtudes(rs.getString("niveauEtudes"));
			professeur.setDateDeNaissance(rs.getDate("dateDeNaissance"));
			professeur.setDateEmbauche(rs.getDate("dateEmbauche"));
			professeur.setListeEleves((ArrayList<Eleve>) rs.getObject("listeEleves"));
			professeur.setListeMatieres((ArrayList<Matiere>) rs.getObject("listeMatieres"));
		}
		
		return professeur;

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


	public Professeur getProfesseurByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}


	public Professeur getProfesseurByName(String nom, String prenom) {
		String sql = "select identifiant, motDePasse, nom, prenom, adresse, numeroTelephone, niveauEtudes, dateDeNaissance, dateEmbauche, listeEleves, listeMatieres from professeur where nom = ? and prenom = ?";

		// Mapping d'un enregistrement vers un ResultSet
		RowMapper mapper = new RowMapper() {
			@SuppressWarnings("unchecked")
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Professeur professeur = new Professeur();
				professeur.setIdentifiant(rs.getString("identifiant"));
				professeur.setMotDePasse(rs.getString("motDePasse"));
				professeur.setNom(rs.getString("nom"));
				professeur.setPrenom(rs.getString("prenom"));
				professeur.setAdresse(rs.getString("adresse"));
				professeur.setNumeroTelephone(rs.getInt("numeroTelephone"));
				professeur.setNiveauEtudes(rs.getString("niveauEtudes"));
				professeur.setDateDeNaissance(rs.getDate("dateDeNaissance"));
				professeur.setDateEmbauche(rs.getDate("dateEmbauche"));
				professeur.setListeEleves((ArrayList<Eleve>) rs.getArray("listeEleves"));
				professeur.setListeMatieres((ArrayList<Matiere>) rs.getArray("listeMatieres"));
						
				return professeur;
			}

		};
		// Retourne l'objet Employe associe a l'Id
		// Notez 1) le casting explicite Employe,
		// 2) que l'enveloppe de l'argument 'id' dans un tableau d'objet,
		// 3) le boxing de 'id' comme un type reference Long
		// Ces etapes ne sont pas necessaire en utilisant (java 5)
		// SimpleJdbcTemplate
		return (Professeur) jdbcTemplate.queryForObject(sql, new Object[] { 
				String.valueOf(nom), String.valueOf(prenom) }, mapper);

	}


	public void create(ProfesseurEntity professeur) {
		Connection conn = null;
		PreparedStatement stmt = null;		
		try {
		final String PROFESSEUR_INSERT = "insert into professeur (identifiant, motDePasse, nom, prenom, adresse, numeroTelephone, niveauEtudes, dateDeNaissance, dateEmbauche, listeEleves, listeMatieres) "
				+ " values (?,?,?,?,?,?,?,?,?,?,?)";

		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		//<---------------- ne pas oublier de changer
        DataSource ds = (DataSource) appContext.getBean("datasource2");
        
        conn = ds.getConnection();
		stmt = conn.prepareStatement(PROFESSEUR_INSERT);
	        /*
		 * On recupere et on utilisera directement le jdbcTemplate
		 */
		
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
		stmt.setObject(11, (Array) professeur.getListeMatieres());
		
		
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


	public int getProfesseurCount() {
		final String PROFESSEUR_COUNT = "select count(*) from professeur";

		/*
		 * On recupere et on utilisera directement le jdbcTemplate
		 */
			
		 int nbLignes = jdbcTemplate.queryForInt(PROFESSEUR_COUNT);
		
		return nbLignes;
	}

	
	@SuppressWarnings("unchecked")
	public ArrayList<Professeur> getAllProfesseurs() {
		Connection conn = null;
		@SuppressWarnings("unused")
		PreparedStatement stmt = null;	
		ResultSet resultats = null;
		
	    @SuppressWarnings("unused")
		final String requete = "";
	    ArrayList<Professeur> listeProfesseurs = new ArrayList<Professeur>();
		
	    try {
	    	//JdbcTemplate jdbcTemplate = new JdbcTemplate();
			//Professeur professeur = SpringJDBC.getProfesseurByName(nom, prenom);
			/* Chargement conteneur Spring et recuperation bean SataSource	*/
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
	
	public void delete(ProfesseurEntity professeur) {
		Connection conn = null;
		PreparedStatement stmt = null;		
		try {
			String nom = professeur.getNom();
			String prenom = professeur.getPrenom();
			String mdp = professeur.getMotDePasse();
		String sql = "DELETE FROM professeur where nom = '" + nom + "' and prenom = '" + prenom + "' and motDePasse = '" +  professeur.getMotDePasse() + "'";
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
	
	public Professeur readByNomPrenom(String nom, String prenom) {
		Connection conn = null;
		PreparedStatement stmt = null; 
		ResultSet rs = null;

		try {
		String sql = "select identifiant, motDePasse, nom, prenom, adresse, numeroTelephone, niveauEtudes, dateDeNaissance, dateEmbauche, listeEleves, listeMatieres from professeur where nom = ? and prenom = ?";

		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
        DataSource dataSource = (DataSource) appContext.getBean("datasource2");
        
        conn = dataSource.getConnection();
		stmt = conn.prepareStatement(sql);
	
		stmt.setString(1, nom);
		stmt.setString(2, prenom);
		rs = stmt.executeQuery();
		Professeur professeur = null;
		if(rs.next()) {
			professeur = new Professeur();
			professeur.setIdentifiant(rs.getString("identifiant"));
			professeur.setMotDePasse(rs.getString("motDePasse"));
			professeur.setNom(rs.getString("nom"));
			professeur.setPrenom(rs.getString("prenom"));
			professeur.setAdresse(rs.getString("adresse"));
			professeur.setNumeroTelephone(rs.getInt("numeroTelephone"));
			professeur.setNiveauEtudes(rs.getString("niveauEtudes"));
			professeur.setDateDeNaissance(rs.getDate("dateDeNaissance"));
			professeur.setDateEmbauche(rs.getDate("dateEmbauche"));
			professeur.setListeEleves((ArrayList<Eleve>) rs.getObject("listeEleves"));
			professeur.setListeMatieres((ArrayList<Matiere>) rs.getObject("listeMatieres"));
		}
		
		return professeur;

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
	
	public  void  update(ProfesseurEntity professeur) {
		
		Connection conn = null;
		PreparedStatement stmt = null;		
		String identifiant = professeur.getIdentifiant();
		String netudes = "bac+6";
		try {
		final String PROFESSEUR_INSERT = 
				 //jeux_video SET prix = 10, nbre_joueurs_max = 32 WHERE ID = 51
				"UPDATE professeur set nom = '" + professeur.getNom() + "', prenom = '" + professeur.getPrenom() + "'," +
						                     "numeroTelephone = '" + professeur.getNumeroTelephone() + "'," +
				                             "adresse = '" + professeur.getAdresse() + "'," +
						                     "niveauEtudes = '" + professeur.getNiveauEtudes() + "' " +
				                             "where identifiant = 'stephanie.gautier@gmail.com'";

		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		//<---------------- ne pas oublier de changer
        DataSource ds = (DataSource) appContext.getBean("datasource2");
        
        conn = ds.getConnection();
		stmt = conn.prepareStatement(PROFESSEUR_INSERT);
	        /*
		 * On recupere et on utilisera directement le jdbcTemplate
		 */
		
		
		
		
		stmt.execute(PROFESSEUR_INSERT);
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
