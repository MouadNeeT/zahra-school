package manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import dao.DAO;
import dao.AdministrateurDAO;
import dao.DAOFactory;
import domaine.Administrateur;
import entity.AdministrateurEntity;
import entity.EntityFactory;

public class AdministrateurManager {
	
	public JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public AdministrateurManager(){
	
}
private static class ManagerAdministrateurHolder {

        private final static AdministrateurManager instance = new AdministrateurManager();
    }

    /**
     * Methode permettant d'obtenir l'instance unique.
     * @return L'instance du singleton.
     */
    public static AdministrateurManager getInstance() {
        return ManagerAdministrateurHolder.instance;
    }
    
    public void create(Administrateur administrateur) {
    	
    	AdministrateurEntity administrateurEntity = EntityFactory.getAdministrateurEntity();
    	administrateurEntity.setIdentifiant(administrateur.getIdentifiant());
    	administrateurEntity.setMotDePasse(administrateur.getMotDePasse());
 
    	AdministrateurDAO administrateurDAO = new AdministrateurDAO();
    	administrateurDAO.create(administrateurEntity);
	}
    
    public Administrateur readById(String identifiant) {
 
    	AdministrateurDAO administrateurDAO = new AdministrateurDAO();
    	return administrateurDAO.readById(identifiant);
	}



}

