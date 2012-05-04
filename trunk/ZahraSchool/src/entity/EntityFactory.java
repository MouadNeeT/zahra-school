/**
 * author GAUTIER Stéphanie
 */

package entity;

public class EntityFactory {
	/**
     * Retourne un objet Absence interagissant avec la BDD
     * @return
     */
    public static AbsenceEntity getAbsenceEntity(){
            return new AbsenceEntity();
    }
    
    /**
     * Retourne un objet administrateur interagissant avec la BDD
     * @return AdministrateurEntity()
     */
    public static AdministrateurEntity getAdministrateurEntity(){
    	return new AdministrateurEntity();
    }
    /**
     * Retourne un objet Eleve interagissant avec la BDD
     * @return
     */
    public static EleveEntity getEleveEntity(){
            return new EleveEntity();
    }
    /**
     * Retourne un objet EmploiDuTemps interagissant avec la BDD
     * @return
     */
    public static EmploiDuTempsEntity getEmploiDuTempsEntity(){
            return new EmploiDuTempsEntity();
    }
    /**
     * Retourne un objet Groupe interagissant avec la BDD
     * @return
     */
    public static GroupeEntity getGroupeEntity(){
            return new GroupeEntity();
    } 
    
    /**
     * Retourne un objet Heure interagissant avec la BDD
     * @return
     */
    public static HeureEntity getHeureEntity(){
    	return new HeureEntity();
    }
    
    /**
     * Retourne un objet Jour interagissant avec la BDD
     * @return
     */
    public static JourEntity getJourEntity(){
            return new JourEntity();
    }
    
    /**
     * Retourne un objet Matiere interagissant avec la BDD
     * @return
     */
    public static MatiereEntity getMatiereDAO(){
            return new MatiereEntity();
    }
    
    /**
     * Retourne un objet Paiement interagissant avec la BDD
     * @return
     */
    public static PaiementEntity getPaiementEntity(){
            return new PaiementEntity();
    }
      
    /**
     * Retourne un objet Professeur interagissant avec la BDD
     * @return
     */
    public static ProfesseurEntity getProfesseurEntity(){
        return new ProfesseurEntity();
    }

}
