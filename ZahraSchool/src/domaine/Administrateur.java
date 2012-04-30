package domaine;

import java.util.Date;

/**
 * <b>Administrateur est un bean</b>
 * <p>
 * un administrateur est caracterise par les informations suivantes :
 * <ul>
 * <li>L'identifiant de l'administrateur.</li>
 * <li>Le mot de passe de l'administrateur.</li>
 * </ul>
 * </p>
 * 
 * @see Administrateur
 * 
 * @author GAUTIER Stephanie
 * @version 1.0
 */

public class Administrateur {
	
	
	private String identifiant;
	
	private String motDePasse;
	

	/**
	 * Construvteur vide
	 */
	public Administrateur(){
	}
	
	/**
	 * 
	 * @param identifiant
	 * @param motDePasse
	 */
	public Administrateur(String identifiant, String motDePasse){
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
	}

	/**
	 * @return the identifiant
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * @param identifiant the identifiant to set
	 */
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	/**
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * @param motDePasse the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	
}
