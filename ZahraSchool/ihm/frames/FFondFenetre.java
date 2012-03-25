package frames;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import panels.IHMBarreHautProfesseur;
import panels.IHMMenuGaucheProfesseur;
import panelsAdministrateur.IHMBarreBas;


public class FFondFenetre extends JFrame{
	
	IHMBarreHautProfesseur barreHaut = new IHMBarreHautProfesseur();
	IHMMenuGaucheProfesseur menuGauche = new IHMMenuGaucheProfesseur();
	IHMBarreBas barreBas = new IHMBarreBas();
	
	public FFondFenetre(){
		
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(menuGauche, BorderLayout.CENTER);
		panel.add(barreHaut, BorderLayout.NORTH);
		
		panel.add(barreBas, BorderLayout.SOUTH);
		add(panel);
		panel.setSize(new Dimension(800, 600));
		setSize(new Dimension(800, 600));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
	

}
