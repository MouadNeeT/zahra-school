package pattern.dao;

public class DAOFactory {
	
    /**
    * Retourne un objet Absence interagissant avec la BDD
    * @return
    */
    public static DAO getAbsenceDAO(){
            return new AbsenceDAO();
    }

    /**
     * Retourne un objet Eleve interagissant avec la BDD
     * @return
     */
    public static DAO getEleveDAO(){
            return new EleveDAO();
    }
    /**
     * Retourne un objet EmploiDuTemps interagissant avec la BDD
     * @return
     */
    public static DAO getEmploiDuTempsDAO(){
            return new EmploiDuTempsDAO();
    }
    /**
     * Retourne un objet Groupe interagissant avec la BDD
     * @return
     */
    public static DAO getGroupeDAO(){
            return new GroupeDAO();
    } 
    
    /**
     * Retourne un objet Jour interagissant avec la BDD
     * @return
     */
    public static DAO getJourDAO(){
            return new JourDAO();
    }
    
    /**
     * Retourne un objet Matiere interagissant avec la BDD
     * @return
     */
    public static DAO getMatiereDAO(){
            return new MatiereDAO();
    }
    
    /**
     * Retourne un objet Paiement interagissant avec la BDD
     * @return
     */
    public static DAO getPaiementDAO(){
            return new PaiementDAO();
    }
    
    /**
     * Retourne un objet PlageHoraire interagissant avec la BDD
     * @return
     */
    public static DAO getHeureDAO(){
        return new HeureDAO();
    }
    
    /**
     * Retourne un objet Professeur interagissant avec la BDD
     * @return
     */
    public static DAO getProfesseurDAO(){
        return new ProfesseurDAO();
    }
}