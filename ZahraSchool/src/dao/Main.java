package dao;
/**
 * 
 */


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Calendar;

import javax.sql.DataSource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import database.SpringJDBC;
import domaine.Administrateur;
import domaine.Eleve;
import domaine.Matiere;
import domaine.Professeur;




/**
 * @author Evi and Max
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Administrateur admin = new Administrateur("stephanie.gautier1@gmail.com", "xxxx");
		
		AdministrateurDAO springDao1 ;
		
		ClassPathXmlApplicationContext appContext;

		
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		springDao1 = (AdministrateurDAO) appContext.getBean("AdministrateurDAO");
		
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-data.xml"));
		
		
			
			DataSource dataSource = (DataSource) appContext.getBean("datasource2");
			
			SpringJDBC j= new SpringJDBC(); 
			ProfesseurDAO pDao = new ProfesseurDAO();
			Eleve eleve1 = null;
			Eleve eleve2 = null;
			ArrayList<Eleve> listeEleves = new ArrayList();
			listeEleves = null;
			Matiere matiere = null;
			ArrayList<Matiere> listeMatieres = new ArrayList<Matiere>();
			listeMatieres = null;
			@SuppressWarnings("deprecation")
			Date d = new Date(29, 04, 2012);
			

			Professeur professeur;/* = new Professeur("stephanie.gautier1@gmail.com", 
                    "mdp", 
                    "GAUTIER", 
                    "Stéphanie", 
                    "33, Chemin de la Salade Ponsan",
                    635559008,
                    "Bac + 4",
                    d,
                    d,
                    listeEleves,
                    listeMatieres);*/
			//j.saveProfesseur(professeur);
			//System.out.println(professeur.getMotDePasse());
			//j.saveAdministrateur(admin);
			
			System.out.println(pDao.getAllProfesseurs());
			
			/*Professeur prof = new Professeur("stephanie.gautier1@gmail.com", 
                    "mdp", 
                    "GAUTIER", 
                    "Stéphanie2", 
                    "33, Chemin de la Salade Ponsan",
                    635559008,
                    "Bac + 4",
                    d,
                    d,
                    listeEleves,
                    listeMatieres);
			j.saveProfesseur(prof);*/
			
			j.getAllProfesseurs();
			
		}
	
}