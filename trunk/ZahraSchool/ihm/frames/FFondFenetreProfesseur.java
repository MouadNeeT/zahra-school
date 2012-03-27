package frames;

import panels.*;






import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import panels.IHMBarreBas;
import panels.IHMBarreHautProfesseur;
import panels.IHMMenuGaucheProfesseur;
import panelsAdministrateur.*;

public class FFondFenetreProfesseur extends JFrame{
	
	IHMBarreHautProfesseur barreHaut = new IHMBarreHautProfesseur();
	IHMMenuGaucheProfesseur menuGauche = new IHMMenuGaucheProfesseur();
	IHMBarreBas barreBas = new IHMBarreBas();
	IHMMenuPrincipalAdministrateur principalMenu = new IHMMenuPrincipalAdministrateur();
        FaireLapelle1 appel1 = new FaireLapelle1();
	
	public FFondFenetreProfesseur(){
		
		
		JPanel panel1 = new JPanel(new BorderLayout());
		
		/**
		 * Il faut ajouter le panel que vous voulez ici.
		 * Rajouter donc le panel : ne pas oublier de mettre le
		 * borderLayout � WEST
		 */
                //appel1.setLayout( new BorderLayout());

		panel1.add(menuGauche, BorderLayout.WEST);
		panel1.add(barreHaut, BorderLayout.NORTH);
		panel1.add(appel1, BorderLayout.CENTER);
		panel1.add(barreBas, BorderLayout.SOUTH);
		add(panel1);
		panel1.setPreferredSize(new Dimension(800, 500));
		setSize(new Dimension(800, 600));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	

}
