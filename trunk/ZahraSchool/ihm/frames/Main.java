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
                panels.FaireLapelle1 f1 = new panels.FaireLapelle1(fenetreFondProfesseur);
                fenetreFondProfesseur.setPanel(f1);
		// TODO Auto-generated method stub
		
		

	}

}
