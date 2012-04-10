package pattern.beans;

import java.util.Date;

/**
 * <b>Administrateur est un bean</b>
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
 * @author GAUTIER Stephanie
 * @version 1.0
 */

public class Administrateur {
	
	
	private String identifiant;
	
	private String motDePasse;
	
	private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private int numeroTelephone;
	
	private String niveauEtudes;
	
	private Date dateDeNaissance;
	
	private Date dateEmbauche;
	
	/**
	 * Construvteur vide
	 */
	public Administrateur(){
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
	public Administrateur(String identifiant, String motDePasse, String nom,
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
