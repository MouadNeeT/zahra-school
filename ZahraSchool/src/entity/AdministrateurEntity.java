package entity;

import java.util.Date;


/**
 * <b>Administrateur est un entity</b>
 * <p>
 * un administrateur est caract�ris� par les informations suivantes :
 * <ul>
 * <li>L'identifiant de l'administrateur.</li>
 * <li>Le mot de passe de l'administrateur.</li>
 * <li>le nom de l'administrateur.</li>
 * <li>le prenom de l'administrateur.</li>
 * <li>l'adresse de l'administrateur</li>
 * <li>le num�ro de t�l�phone de l'administrateur.</li>
 * <li>le niveau d'�tudes de l'administrateur.</li>
 * <li>la date de naissance de l'administrateur.</li>
 * <li>la date d'embauche de l'administrateur</li>
 * </ul>
 * </p>
 * 
 * @see Administrateur
 * 
 * @author GAUTIER St�phanie
 * @version 1.0
 */

public class AdministrateurEntity extends Entity {
	
	/**
	 * L'identifiant de l'administrateur.
	 * Il s'agit de l'adresse mail.
	 * @see Administrateur#setIdentifiant(String)
	 * @see Administrateur#getIdentifiant()
	 */
	private String identifiant;
	/**
	 * Le mot de passe de l'administrateur.
	 * En g�n�ral le mot de passe ser celui de la boite mail
	 * @see Administrateur#setMotDePasse(String)
	 * @see Administrateur#getMotDePasse()
	 */
	private String motDePasse;
	
	/**
	 * Construvteur vide
	 */
	public AdministrateurEntity(){
	}
	
	/**
	 * 
	 * @param identifiant
	 * @param motDePasse
	 */
	public AdministrateurEntity(String identifiant, String motDePasse){
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
