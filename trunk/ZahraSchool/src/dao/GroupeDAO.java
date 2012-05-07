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
		
		stmt.setInt(1, groupe.getNom());
		stmt.setString(2, groupe.getNiveau());
		stmt.setString(3, (java.sql.Date) groupe.getDateDeCreation());
		stmt.setInt(4, groupe.getTarif());
		stmt.setDate(5, groupe.getListeEleves());
		stmt.setString(6, groupe.getEmploiDuTemps());
		
		
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
}
