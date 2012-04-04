package frames;

import javax.swing.JFrame;

import panelsAdministrateur.IHMMenuPrincipalAdministrateur;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * pour tester vos panels, faites-le ds FFondProfesseur.
		 * J'y ai mis un commentaire.
		 */
		FFondFenetreProfesseur fenetreFondProfesseur =  new FFondFenetreProfesseur();
                panelsEleve.IHMChoixEleve2 F1 = new panelsEleve.IHMChoixEleve2(fenetreFondProfesseur);
                fenetreFondProfesseur.setPanel(F1);
		// TODO Auto-generated method stub
		
	
	}

}
