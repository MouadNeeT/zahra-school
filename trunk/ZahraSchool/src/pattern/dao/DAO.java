package pattern.dao;



import java.sql.Connection;

import pattern.beans.Groupe;
import pattern.beans.Professeur;
import pattern.entity.AbsenceEntity;
import pattern.entity.GroupeEntity;



public abstract class DAO<T> {
        
        protected Connection connect = null;
        
        /**
         * Constructeur
         * @param conn
         */
        public DAO(Connection conn){
                this.connect = conn;
        }
        
        public DAO(){}
        
        /**
         * Methode de creation
         * @param obj
         * @return
         */
        public abstract boolean create(T obj);
        /**
         * Methode pour effacer
         * @param obj
         * @return
         */
        public abstract boolean delete(T obj);
        /**
         * Methode de mise a jour
         * @param obj
         * @return
         */
        public abstract boolean update(T obj);
        /**
         * Methode de recherche des informations
         * @param id
         * @return
         */
        public abstract T find(T obj);

		

		public Professeur find(String nom, String prenom) {
			// TODO Auto-generated method stub
			return null;
		}

		public Professeur find2(String nom, String prenom) {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Groupe find2(String nom) {
			// TODO Auto-generated method stub
			return null;
		}
		
		public Groupe find(String nom) {
			// TODO Auto-generated method stub
			return null;
		}

}