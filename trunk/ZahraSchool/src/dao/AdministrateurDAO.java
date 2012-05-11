package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import domaine.Administrateur;
import entity.AdministrateurEntity;

@Repository("administrateurDAO")
public class AdministrateurDAO{

	public JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Administrateur readById(String identifiant) {
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

	public Administrateur getAdministrateurByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	public void create(AdministrateurEntity administrateur) {
		Connection conn = null;
		PreparedStatement stmt = null;		
		try {
		final String ADMINISTRATEUR_INSERT = "insert into administrateur (identifiant, motDePasse)"
				+ "values (?,?)";
		
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

	public int getAdministrateurCount() {
		final String ADMINISTRATEUR_COUNT = "select count(*) from administrateur";

		/*
		 * On recupere et on utilisera directement le jdbcTemplate
		 */
			
		 int nbLignes = jdbcTemplate.queryForInt(ADMINISTRATEUR_COUNT);
		
		return nbLignes;
	}

	public List<Administrateur> getAllAdministrateurs() {
		// TODO Auto-generated method stub
		return null;
	}

	

	public void save(Administrateur administrateurEntity) {
		// TODO Auto-generated method stub
		
	}

	
	

	
}
