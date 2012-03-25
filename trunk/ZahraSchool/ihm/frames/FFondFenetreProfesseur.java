import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class FFondFenetreProfesseur extends JFrame{
	
	IHMBarreHautProfesseur barreHaut = new IHMBarreHautProfesseur();
	IHMMenuGaucheProfesseur menuGauche = new IHMMenuGaucheProfesseur();
	IHMBarreBas barreBas = new IHMBarreBas();
	IHMMenuPrincipalAdministrateur principalMenu = new IHMMenuPrincipalAdministrateur();
	
	public FFondFenetreProfesseur(){
		
		
		JPanel panel1 = new JPanel(new BorderLayout());
		
		panel1.add(principalMenu, BorderLayout.CENTER);
		panel1.add(menuGauche, BorderLayout.CENTER);
		panel1.add(barreHaut, BorderLayout.NORTH);
		
		panel1.add(barreBas, BorderLayout.SOUTH);
		add(panel1);
		panel1.setSize(new Dimension(800, 600));
		setSize(new Dimension(800, 600));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	

}
