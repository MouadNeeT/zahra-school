package pattern.entity;

import java.util.Date;


/**
 * <b>Administrateur est un entity</b>
 * <p>
 * un administrateur est caractérisé par les informations suivantes :
 * <ul>
 * <li>L'identifiant de l'administrateur.</li>
 * <li>Le mot de passe de l'administrateur.</li>
 * <li>le nom de l'administrateur.</li>
 * <li>le prenom de l'administrateur.</li>
 * <li>l'adresse de l'administrateur</li>
 * <li>le numéro de téléphone de l'administrateur.</li>
 * <li>le niveau d'études de l'administrateur.</li>
 * <li>la date de naissance de l'administrateur.</li>
 * <li>la date d'embauche de l'administrateur</li>
 * </ul>
 * </p>
 * 
 * @see Administrateur
 * 
 * @author GAUTIER Stéphanie
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
	 * En général le mot de passe ser celui de la boite mail
	 * @see Administrateur#setMotDePasse(String)
	 * @see Administrateur#getMotDePasse()
	 */
	private String motDePasse;
	/**
	 * le nom de l'administrateur.
	 * @see Administrateur#setNom(String)
	 * @see Administrateur#getNom()
	 */
	private String nom;
	/**
	 * le prenom de l'administrateur.
	 * @see Administrateur#setPrenom(String)
	 * @see Administrateur#getPrenom()
	 */
	private String prenom;
	/**
	 * l'adresse de l'administrateur
	 * @see Administrateur#setAdresse(String)
	 * @see Administrateur#getAdresse()
	 */
	private String adresse;
	/**
	 * le numéro de téléphone de l'administrateur.
	 * @see Administrateur#setNumeroTelephone(String)
	 * @see Administrateur#getNumeroTelephone()
	 */
	private int numeroTelephone;
	/**
	 * le niveau d'études de l'administrateur.
	 * @see Administrateur#setNiveauEtudes(String)
	 * @see Administrateur#getNiveauEtudes()
	 */
	private String niveauEtudes;
	/**
	 * la date de naissance de l'administrateur.
	 * @see Administrateur#setDateDeNaissance(Date)
	 * @see Administrateur#getDateDeNaissance()
	 */
	private Date dateDeNaissance;
	/**
	 * la date d'embauche de l'administrateur
	 * @see Administrateur#setDateEmbauche(Date)
	 * @see Administrateur#getDateEmbauche()
	 */
	private Date dateEmbauche;
	
	/**
	 * Construvteur vide
	 */
	public AdministrateurEntity(){
	}
	
	/**
	 * 
	 * @param identifiant
	 * @param motDePasse
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param numeroTelephone
	 * @param niveauEtudes
	 * @param dateDeNaissance
	 * @param dateEmbauche
	 */
	public AdministrateurEntity(String identifiant, String motDePasse, String nom,
			String prenom, String adresse, int numeroTelephone, 
			String niveauEtudes, Date dateDeNaissance, Date dateEmbauche){
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.numeroTelephone = numeroTelephone;
		this.niveauEtudes = niveauEtudes;
		this.dateDeNaissance = dateDeNaissance;
		this.dateEmbauche = dateEmbauche;
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

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the numeroTelephone
	 */
	public int getNumeroTelephone() {
		return numeroTelephone;
	}

	/**
	 * @param numeroTelephone the numeroTelephone to set
	 */
	public void setNumeroTelephone(int numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	/**
	 * @return the niveauEtudes
	 */
	public String getNiveauEtudes() {
		return niveauEtudes;
	}

	/**
	 * @param niveauEtudes the niveauEtudes to set
	 */
	public void setNiveauEtudes(String niveauEtudes) {
		this.niveauEtudes = niveauEtudes;
	}

	/**
	 * @return the dateDeNaissance
	 */
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	/**
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	/**
	 * @return the dateEmbauche
	 */
	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	/**
	 * @param dateEmbauche the dateEmbauche to set
	 */
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	
	
	
	
	

}
