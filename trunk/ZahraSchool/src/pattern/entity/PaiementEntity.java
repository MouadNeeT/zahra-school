/**
 * author GAUTIER St�phanie
 */

package pattern.entity;

import java.util.Date;

import pattern.beans.Eleve;

public class PaiementEntity {
	private int montant;
	private String mois;
	private Date dateDePaiementPrevus;
	private Date dateEncaissement;
	private Eleve eleve;
	
	public PaiementEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public PaiementEntity(int montant, String mois, Date dateDePaiementPrevus, Date dateEncaissement, Eleve eleve) {
		this.montant = montant;
		this.mois = mois;
		this.dateDePaiementPrevus = dateDePaiementPrevus;
		this.dateEncaissement = dateEncaissement;
		this.eleve = eleve;
	}
	
	
	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public String getMois() {
		return mois;
	}

	public void setMois(String mois) {
		this.mois = mois;
	}

	public Date getDateDePaiementPrevus() {
		return dateDePaiementPrevus;
	}

	public void setDateDePaiementPrevus(Date dateDePaiementPrevus) {
		this.dateDePaiementPrevus = dateDePaiementPrevus;
	}

	/**
	 * @return the eleve
	 */
	public Eleve getEleve() {
		return eleve;
	}

	/**
	 * @param eleve the eleve to set
	 */
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}

	/**
	 * @return the dateDePaiementPrevus
	 */

	public Date getDateEncaissement() {
		return dateEncaissement;
	}

	public void setDateEncaissement(Date dateEncaissement) {
		this.dateEncaissement = dateEncaissement;
	}

	

}
