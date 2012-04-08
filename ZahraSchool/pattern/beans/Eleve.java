package beans;

import java.util.Date;


public class Eleve {
	/**
	 * Certains �l�ves peuvent avoir des noms, pr�noms identiques :
	 * l'identifiant les dif�renciera.
	 * 
	 * @see Eleve#getIdentifiant()
	 * @see Eleve#setIdentifiant(int)
	 */
	private int identifiant;
	/**
	 * le nom de l'�l�ve.
	 * 
	 * @see Eleve#setNom(String)
	 * @see Eleve#getNom()
	 */
	private String nom;
	/**
	 * le pr�nom de l'�l�ve.
	 * 
	 * @see Eleve#setPrenom(String)
	 * @see Eleve#getPrenom()
	 */
	private String prenom;
	/**
	 * l'�ge de l'�l�ve.
	 * 
	 * @see Eleve#setAge(int)
	 *  @see Eleve#getAge()
	 */
	private int age;
	/**
	 * la date de naissance de l'�l�ve
	 * 
	 *  @see Eleve#setDateDeNaissance(Date)
	 *   @see Eleve#getDateDeNaissance()
	 */
	private Date dateDeNaissance;
	/**
	 * la photo de l'�l�ve. Il s'agit de l'url de la photo.
	 * 
	 *  @see Eleve#setPhoto(String)
	 *   @see Eleve#getPhoto()
	 */
	private String photo; 
	/**
	 * le num�ro de t�l�phone de l'�l�ve.
	 * 
	 *  @see Eleve#setNumeroTelephoneEleve(int)
	 *   @see Eleve#getNumeroTelephoneEleve()
	 */
	private int numeroTelephoneEleve;
	/**
	 * le num�ro de t�l�phone des parents.
	 * 
	 *  @see Eleve#setNumeroTelephoneParent(int)
	 *   @see Eleve#getNumeroTelephoneParent()
	 */
	private int numeroTelephoneParent;
	/**
	 * la date d'inscription de l'�l�ve.
	 * 
	 *  @see Eleve#setDateInscription(Date)
	 *   @see Eleve#getDateInscription()
	 */
	private Date dateInscription;
	/**
	 * le niveau d'�tudes de l'�l�ve : (ex : coll�ge, lyc�e, ...) 
	 * 
	 *  @see Eleve#setNiveauEtudes(String)
	 *   @see Eleve#getNiveauEtudes()
	 */
	private String niveauEtudes;
	/**
	 * le nom du p�re de l'�l�ve.
	 *  @see Eleve#setNomPere(String)
	 *   @see Eleve#getNomPere()
	 */
	private String nomPere;
	/**
	 * le pr�nom du p�re de l'�l�ve.
	 * 
	 *  @see Eleve#setPrenomPere(String)
	 *   @see Eleve#getPrenomPere()
	 */
	private String prenomPere;
	/**
	 * le nom de la m�re de l'�l�ve
	 * @see Eleve#setNomMere(String)
	 *   @see Eleve#getNomMere()
	 */
	private String nomMere;
	/**
	 * le prenom de la m�re de l'�l�ve.
	 * @see Eleve#setPrenomMere(String)
	 *   @see Eleve#getPrenomMere()
	 */
	private String prenomMere;
	/**
	 * le statut de l'�l�ve 
	 * (ex : il se peut qu'un �l�ve ne puisse pas payer le mois)
	 * @see Eleve#setStatus(String)
	 *   @see Eleve#getStatus()
	 */
	private String status;
	/**
	 * le niveau de test de l'�l�ve.
	 * @see Eleve#setNiveauEtudes(String)
	 * @see Eleve#getNiveauEtudes()
	 */
	private String niveauTest;
	
	public Eleve(){
	}
	
	public Eleve(int identifiant, String nom, String prenom, int age, Date dateDeNaissance)
	
	
	/**
	 * @return the identifiant
	 */
	public int getIdentifiant() {
		return identifiant;
	}
	/**
	 * @param identifiant the identifiant to set
	 */
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
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
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}
	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	/**
	 * @return the numeroTelephoneEleve
	 */
	public int getNumeroTelephoneEleve() {
		return numeroTelephoneEleve;
	}
	/**
	 * @param numeroTelephoneEleve the numeroTelephoneEleve to set
	 */
	public void setNumeroTelephoneEleve(int numeroTelephoneEleve) {
		this.numeroTelephoneEleve = numeroTelephoneEleve;
	}
	/**
	 * @return the numeroTelephoneParent
	 */
	public int getNumeroTelephoneParent() {
		return numeroTelephoneParent;
	}
	/**
	 * @param numeroTelephoneParent the numeroTelephoneParent to set
	 */
	public void setNumeroTelephoneParent(int numeroTelephoneParent) {
		this.numeroTelephoneParent = numeroTelephoneParent;
	}
	/**
	 * @return the dateInscription
	 */
	public Date getDateInscription() {
		return dateInscription;
	}
	/**
	 * @param dateInscription the dateInscription to set
	 */
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
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
	 * @return the nomPere
	 */
	public String getNomPere() {
		return nomPere;
	}
	/**
	 * @param nomPere the nomPere to set
	 */
	public void setNomPere(String nomPere) {
		this.nomPere = nomPere;
	}
	/**
	 * @return the prenomPere
	 */
	public String getPrenomPere() {
		return prenomPere;
	}
	/**
	 * @param prenomPere the prenomPere to set
	 */
	public void setPrenomPere(String prenomPere) {
		this.prenomPere = prenomPere;
	}
	/**
	 * @return the nomMere
	 */
	public String getNomMere() {
		return nomMere;
	}
	/**
	 * @param nomMere the nomMere to set
	 */
	public void setNomMere(String nomMere) {
		this.nomMere = nomMere;
	}
	/**
	 * @return the prenomMere
	 */
	public String getPrenomMere() {
		return prenomMere;
	}
	/**
	 * @param prenomMere the prenomMere to set
	 */
	public void setPrenomMere(String prenomMere) {
		this.prenomMere = prenomMere;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the niveauTest
	 */
	public String getNiveauTest() {
		return niveauTest;
	}
	/**
	 * @param niveauTest the niveauTest to set
	 */
	public void setNiveauTest(String niveauTest) {
		this.niveauTest = niveauTest;
	}
	
	
	
	
	

}
