package dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import domaine.Absence;
import domaine.Eleve;
import domaine.EmploiDuTemps;
import domaine.Paiement;
import domaine.Professeur;

import entity.AbsenceEntity;
import entity.EleveEntity;

public class AbsenceDAO {
private JdbcTemplate jdbcTemplate;
	
	
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public AbsenceDAO(){}

	public void createAbsenceEleve(AbsenceEntity absence, EleveEntity eleve) {
		Connection conn = null;
		PreparedStatement stmt = null;		
		try {
		final String ABSENCE_INSERT = "insert into absence (identifiant, motif, date, identifiantEleve) "
				+ " values (?,?,?,?)"; 

		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
        DataSource ds = (DataSource) appContext.getBean("datasource2");
        
        conn = ds.getConnection();
		stmt = conn.prepareStatement(ABSENCE_INSERT);
	     
		stmt.setInt(1, absence.getIdentifiant());
		stmt.setString(2, absence.getMotif());
		stmt.setDate(3, (java.sql.Date) absence.getDate());
		stmt.setInt(4, eleve.getIdentifiant());
		
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
	
	public ArrayList<Absence> getAllAbsences() {
		Connection conn = null;
		@SuppressWarnings("unused")
		PreparedStatement stmt = null;	
		ResultSet resultats = null;
		
	    @SuppressWarnings("unused")
		final String requete = "";
	    ArrayList<Absence> listeAbsences = new ArrayList<Absence>();
		
	    try {
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
			//<---------------- ne pas oublier de changer
	        DataSource ds = (DataSource) appContext.getBean("datasource2");
	        conn = ds.getConnection();
			PreparedStatement ALL = conn.prepareStatement("select identifiant, motif, date, identifiantEleve from absence");
			resultats = ALL.executeQuery();
			
			boolean encore = resultats.next();

		      while (encore) {
		    	
		        @SuppressWarnings("unchecked")
				Absence a = new Absence (resultats.getInt(1), resultats.getString(2), resultats.getDate(3), resultats.getInt(4));
		        listeAbsences.add(a);
		        encore = resultats.next();
		      }

		      resultats.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeAbsences;
	
	}

	public ArrayList<Absence> getAllAbsencesFromIdEleve(int identifiantEleve) {
		Connection conn = null;
		@SuppressWarnings("unused")
		PreparedStatement stmt = null;	
		ResultSet resultats = null;
		
	    @SuppressWarnings("unused")
		final String requete = "";
	    ArrayList<Absence> listeAbsencesEleve = new ArrayList<Absence>();
		
	    try {
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-data.xml");
			//<---------------- ne pas oublier de changer
	        DataSource ds = (DataSource) appContext.getBean("datasource2");
	        conn = ds.getConnection();
			PreparedStatement ALL = conn.prepareStatement("select identifiant, motif, date, identifiantEleve from absence " +
					                                       "where identifiantEleve = '" + identifiantEleve + "'");
			resultats = ALL.executeQuery();
			
			boolean encore = resultats.next();

		      while (encore) {
		    	
		        @SuppressWarnings("unchecked")
				Absence a = new Absence (resultats.getInt(1), resultats.getString(2), resultats.getDate(3), resultats.getInt(4));
		        listeAbsencesEleve.add(a);
		        encore = resultats.next();
		      }

		      resultats.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listeAbsencesEleve;
	
	}

}
