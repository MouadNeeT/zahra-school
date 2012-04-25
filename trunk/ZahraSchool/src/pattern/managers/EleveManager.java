package pattern.managers;

import pattern.beans.Eleve;
import pattern.dao.DAO;
import pattern.dao.DAOFactory;
import pattern.entity.EleveEntity;
import pattern.entity.EntityFactory;

public class EleveManager {
	private EleveManager(){
		
	}
	private static class ManagerEleveHolder {
	        private final static EleveManager instance = new EleveManager();
	    }

	    /**
	     * M�thode permettant d'obtenir l'instance unique.
	     * @return L'instance du singleton.
	     */
	    public static EleveManager getInstance() {
	        return ManagerEleveHolder.instance;
	    }
	
	public  void  createAndStore(Eleve eleve) {
		//
		EleveEntity eleveEntity = EntityFactory.getEleveEntity();
		eleveEntity.setNom(eleve.getNom());
		eleveEntity.setPrenom(eleve.getPrenom());
		
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
		tx = session.beginTransaction();
		// do some work
		DAO<EleveEntity> eleveDAO = DAOFactory.getEleveDAO();
		eleveDAO.create(eleveEntity);
		
		tx.commit();
		}
		catch (RuntimeException e) {
		if (tx != null) tx.rollback();
		throw e; // or display error message
		}finally {
			session.close();
		}
	}
}
