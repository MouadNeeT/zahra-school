package dao;


import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.Date;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import domaine.Eleve;
import domaine.EmploiDuTemps;
import domaine.Groupe;
import domaine.Matiere;
import domaine.Paiement;
import domaine.Professeur;

import entity.EleveEntity;
import entity.ProfesseurEntity;



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

public class EleveDAO {

	private JdbcTemplate jdbcTemplate;
	
	public EleveDAO(){}
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

        public void create(EleveEntity eleve) {
        	Connection conn = null;
    		PreparedStatement stmt = null;		
    		try {
    		final String ELEVE_INSERT = "insert into eleve (identifiant, nom, prenom, age, dateDeNaissance, adresse, photo, numeroTelephoneEleve, numeroTelephoneParent, dateInscription, niveauEtudes, nomPere, prenomPere, nomMere, prenomMere, status, niveauTest, listeProfesseurs, listeGroupes, listePaiements, emploiDuTemps) "
    				+ " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; 


    		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
    		//<---------------- ne pas oublier de changer
            DataSource ds = (DataSource) appContext.getBean("datasource2");
            
            conn = ds.getConnection();
    		stmt = conn.prepareStatement(ELEVE_INSERT);
    	        /*
    		 * On r�cup�re et on utilisera directement le jdbcTemplate
    		 */
    		
    		stmt.setInt(1, eleve.getIdentifiant());
    		stmt.setString(2, eleve.getNom());
    		stmt.setString(3, eleve.getPrenom());
    		stmt.setInt(4, eleve.getAge());
    		stmt.setDate(5, (java.sql.Date) eleve.getDateDeNaissance());
    		stmt.setString(6, eleve.getAdresse());
    		stmt.setString(7, eleve.getPhoto());
    		stmt.setInt(8, eleve.getNumeroTelephoneEleve());
    		stmt.setInt(9, eleve.getNumeroTelephoneParent());
    		stmt.setDate(10, (java.sql.Date) eleve.getDateInscription());
    		stmt.setString(11, eleve.getNiveauEtudes());
    		stmt.setString(12, eleve.getNomPere());
    		stmt.setString(13, eleve.getPrenomPere());
    		stmt.setString(14, eleve.getNomMere());
    		stmt.setString(15, eleve.getPrenomPere());
    		stmt.setString(16, eleve.getStatus());
    		stmt.setString(17, eleve.getNiveauTest());
    		stmt.setObject(18, eleve.getListeProfesseurs());
    		stmt.setObject(19, eleve.getListeGroupes());
    		stmt.setObject(20, eleve.getListePaiements());
    		stmt.setObject(21, eleve.getEmploiDuTemps());
    		
    		
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
        
        public Eleve readById(int identifiant){
        	Connection conn = null;
    		PreparedStatement stmt = null; 
    		ResultSet rs = null;

    		try {
    		String sql = "select identifiant, nom, prenom, age, dateDeNaissance, adresse, photo, numeroTelephoneEleve, numeroTelephoneParent, dateInscription, niveauEtudes, nomPere, prenomPere, nomMere, prenomMere, status, niveauTest, listeProfesseurs, listeGroupes, listePaiements, emploiDuTemps from eleve where identifiant = ?";

    		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
            DataSource dataSource = (DataSource) appContext.getBean("datasource2");
            
            conn = dataSource.getConnection();
    		stmt = conn.prepareStatement(sql);
    	
    		stmt.setInt(1, identifiant);
    		rs = stmt.executeQuery();
    		Eleve eleve = null;
    		if(rs.next()) {
    			eleve = new Eleve();
    			eleve.setIdentifiant(rs.getInt("identifiant"));
    			eleve.setNom(rs.getString("nom"));
    			eleve.setPrenom(rs.getString("prenom"));
    			eleve.setAge(rs.getInt("age"));
    			eleve.setDateDeNaissance(rs.getDate("dateDeNaissance"));
    			eleve.setAdresse(rs.getString("adresse"));
    			eleve.setPhoto(rs.getString("photo"));
    			eleve.setNumeroTelephoneEleve(rs.getInt("numeroTelephoneEleve"));
    			eleve.setNumeroTelephoneParent(rs.getInt("numeroTelephoneParent"));
    			eleve.setDateInscription(rs.getDate("dateInscription"));
    			eleve.setNiveauEtudes(rs.getString("niveauEtudes"));
    			eleve.setNomPere(rs.getString("nomPere"));
    			eleve.setPrenomPere(rs.getString("prenomPere"));
    			eleve.setNomMere(rs.getString("nomMere"));
    			eleve.setPrenomPere(rs.getString("prenomPere"));
    			eleve.setStatus(rs.getString("status"));
    			eleve.setNiveauTest(rs.getString("niveauTest"));
    			eleve.setListeProfesseurs((ArrayList<Professeur>) rs.getObject("listeProfesseurs"));
        		eleve.setListeGroupes((ArrayList<Groupe>) rs.getObject("listeGroupes"));
        		eleve.setListePaiements((ArrayList<Paiement>) rs.getObject("listePaiements"));
        		eleve.setEmploiDuTemps((EmploiDuTemps) rs.getObject("emploiDuTemps"));
    		}
    		
    		return eleve;

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
        
        public void delete (EleveEntity eleve) {
        	Connection conn = null;
    		PreparedStatement stmt = null;		
    		try {
    			String nom = eleve.getNom();
    			String prenom = eleve.getPrenom();
    			int identifiant= eleve.getIdentifiant();
    		String sql = "DELETE FROM eleve where nom = '" + nom + "' and prenom = '" + prenom + "' and identifiant = '" +  identifiant + "'";
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

        public void update (EleveEntity eleve) {
        	Connection conn = null;
    		PreparedStatement stmt = null;		
    		int identifiant = eleve.getIdentifiant();
    		
    		try {
    		final String sql = 
    				 
    				"UPDATE eleve set nom = '" + eleve.getNom() + "', prenom = '" + eleve.getPrenom() + "'," +
    						 					 "age = '" + eleve.getAge() + "'," + "dateDeNaissance = '" + eleve.getDateDeNaissance() + "',"+
    						                     "adresse = '" + eleve.getAdresse() + "'," + "photo = '" + eleve.getPhoto() + "'," +
    						 					 "numeroTelephoneEleve = '" + eleve.getNumeroTelephoneEleve() + "'," +
    						 					"numeroTelephoneParent = '" + eleve.getNumeroTelephoneParent() + "'," +
    				                             "dateInscription = '" + eleve.getDateInscription() + "'," +
    						                     "niveauEtudes = '" + eleve.getNiveauEtudes() + "', " +
    						                     "nomPere = '" + eleve.getNomPere() + "', " +
    						                     "nomMere = '" + eleve.getNomMere() + "', " +
    						                     "prenomMere = '" + eleve.getPrenomMere() + "', " +
    						                     "prenomPere = '" + eleve.getPrenomPere() + "', " +
    						                     "status = '" + eleve.getStatus() + "', " +
    						                     "niveauTest = '" + eleve.getNiveauTest() + "', " +
    						                     "listeGroupes = '" + eleve.getListeGroupes() + "'" +
    				                             "where identifiant = '" + identifiant + "'";

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

		public Eleve readByNomPrenom(String nom, String prenom) {
			// TODO Auto-generated method stub
			return null;
		}

		public ArrayList<Eleve> getAllEleves() {
			int nombreEleves = 0;
			Connection conn = null;
			@SuppressWarnings("unused")
			PreparedStatement stmt = null;	
			ResultSet resultats = null;
			
		    @SuppressWarnings("unused")
			final String requete = "";
		    ArrayList<Eleve> listeEleves = new ArrayList<Eleve>();
			
		    try {
		    	//JdbcTemplate jdbcTemplate = new JdbcTemplate();
				//Professeur professeur = SpringJDBC.getProfesseurByName(nom, prenom);
				/* Chargement conteneur Spring et r�cup�ration bean SataSource	*/
				ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
				//<---------------- ne pas oublier de changer
		        DataSource ds = (DataSource) appContext.getBean("datasource2");
		        conn = ds.getConnection();
				PreparedStatement ALL = conn.prepareStatement("select identifiant, nom, prenom, age, dateDeNaissance, adresse, photo, numeroTelephoneEleve, numeroTelephoneParent, dateInscription, niveauEtudes, nomPere, prenomPere, nomMere, prenomMere, status, niveauTest, listeProfesseurs, listeGroupes, listePaiements, emploiDuTemps from eleve");
				resultats = ALL.executeQuery();
				
				boolean encore = resultats.next();

			      while (encore) {
			       
			        Eleve e = new Eleve(resultats.getInt(1), resultats.getString(2), resultats.getString(3), resultats.getInt(4), resultats.getDate(5), resultats.getString(6), 
			        		resultats.getString(7), resultats.getInt(8), resultats.getInt(9), resultats.getDate(10), resultats.getString(11),
			        		resultats.getString(12), resultats.getString(13), resultats.getString(14), resultats.getString(15), 
			        		resultats.getString(16), resultats.getString(17), 
			        		(ArrayList<Professeur>) resultats.getObject(18), (ArrayList<Groupe>)resultats.getObject(19), 
			        		(ArrayList<Paiement>) resultats.getObject(20), (EmploiDuTemps) resultats.getObject(21));
			        listeEleves.add(e);
			        encore = resultats.next();
			        nombreEleves = nombreEleves + 1;
			      }

			      resultats.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return listeEleves;
		
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
		
		
        
}