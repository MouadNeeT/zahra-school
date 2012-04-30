package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import domaine.Administrateur;

@Repository("administrateurDAO")
public class AdministrateurDAO implements IAdministrateurDAO{

	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Administrateur getAdministrateurById(String identifiant) {
		String sql = "select identifiant, motDePasse from administrateur where identifiant = ?";

		// Mapping d'un enregistrement vers un ResultSet
		RowMapper mapper = new RowMapper() {
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Administrateur administrateur = new Administrateur();
				administrateur.setIdentifiant(rs.getString("identifiant"));
				administrateur.setMotDePasse(rs.getString("motDePasse"));
				return administrateur;
			}

		};
		// Retourne l'objet Employe associé à l'Id
		// Notez 1) le casting explicite Employe,
		// 2) que l'enveloppe de l'argument 'id' dans un tableau d'objet,
		// 3) le boxing de 'id' comme un type reference Long
		// Ces étapes ne sont pas necessaire en utilisant (java 5)
		// SimpleJdbcTemplate
		return (Administrateur) jdbcTemplate.queryForObject(sql, new Object[] { String
				.valueOf(identifiant) }, mapper);
	}

	@Override
	public Administrateur getAdministrateurByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveAdministrateur(Administrateur administrateur) {
		final String ADMINISTRATEUR_INSERT = "insert into administrateur (identifiant, motDePasse)"
				+ "values (?,?)";

	        /*
		 * On récupère et on utilisera directement le jdbcTemplate
		 */
		jdbcTemplate.update(
				ADMINISTRATEUR_INSERT,
				new Object[] { administrateur.getIdentifiant(),administrateur.getMotDePasse()});
	}

	@Override
	public int getAdministrateurCount() {
		final String ADMINISTRATEUR_COUNT = "select count(*) from administrateur";

		/*
		 * On récupère et on utilisera directement le jdbcTemplate
		 */
			
		 int nbLignes = jdbcTemplate.queryForInt(ADMINISTRATEUR_COUNT);
		
		return nbLignes;
	}

	@Override
	public List<Administrateur> getAllAdministrateurs() {
		// TODO Auto-generated method stub
		return null;
	}

}
