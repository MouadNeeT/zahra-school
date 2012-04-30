package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import domaine.Eleve;
import domaine.Matiere;
import domaine.Professeur;

public class ProfesseurDAO implements IProfesseurDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Professeur getProfesseurById(String identifiant) {
		String sql = "select identifiant, motDePasse, nom, prenom, adresse, numeroTelephone, niveauEtudes, dateDeNaissance, dateEmbauche, listeEleves, listeMatieres from professeur where identifiant = ?";

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
		// Retourne l'objet Employe associé à l'Id
		// Notez 1) le casting explicite Employe,
		// 2) que l'enveloppe de l'argument 'id' dans un tableau d'objet,
		// 3) le boxing de 'id' comme un type reference Long
		// Ces étapes ne sont pas necessaire en utilisant (java 5)
		// SimpleJdbcTemplate
		return (Professeur) jdbcTemplate.queryForObject(sql, new Object[] { String
				.valueOf(identifiant) }, mapper);
	}

	@Override
	public Professeur getProfesseurByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
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
		// Retourne l'objet Employe associé à l'Id
		// Notez 1) le casting explicite Employe,
		// 2) que l'enveloppe de l'argument 'id' dans un tableau d'objet,
		// 3) le boxing de 'id' comme un type reference Long
		// Ces étapes ne sont pas necessaire en utilisant (java 5)
		// SimpleJdbcTemplate
		return (Professeur) jdbcTemplate.queryForObject(sql, new Object[] { 
				String.valueOf(nom), String.valueOf(prenom) }, mapper);

	}

	@Override
	public void saveProfesseur(Professeur professeur) {
		final String PROFESSEUR_INSERT = "insert into professeur (identifiant, motDePasse, nom, prenom, adresse, numeroTelephone, niveauEtudes, dateDeNaissance, dateEmbauche, listeEleves, listeMatieres from professeur)"
				+ "values (?,?,?,?,?,?,?,?,?,?,?)";

	        /*
		 * On récupère et on utilisera directement le jdbcTemplate
		 */
		jdbcTemplate.update(
				PROFESSEUR_INSERT,
				new Object[] { professeur.getIdentifiant(),
						professeur.getMotDePasse(),
						professeur.getNom(),
						professeur.getPrenom(),
						professeur.getAdresse(),
						professeur.getNumeroTelephone(),
						professeur.getNiveauEtudes(),
						professeur.getDateDeNaissance(), 
						professeur.getDateEmbauche(),
						professeur.getListeEleves(),
						professeur.getListeMatieres()});

	}

	@Override
	public int getProfesseurCount() {
		final String PROFESSEUR_COUNT = "select count(*) from professeur";

		/*
		 * On récupère et on utilisera directement le jdbcTemplate
		 */
			
		 int nbLignes = jdbcTemplate.queryForInt(PROFESSEUR_COUNT);
		
		return nbLignes;
	}

	
	public ArrayList<Professeur> getAllProfesseurs() {
	    final String requete = "select nom, prenom from professeur";
		
		return null;
	}
	
	public void deleteProfesseur(String nom, String prenom) {
		Professeur professeur = getProfesseurByName(nom, prenom);
		jdbcTemplate.update(
				"DELETE FROM professeur WHERE nom = ? and prenom=?");
				
	}

}
