package frames;






import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import panels.IHMBarreBas;
import panels.IHMBarreHautProfesseur;
import panels.IHMMenuGaucheProfesseur;
import panelsAdministrateur.*;

public class FFondFenetreProfesseur extends JFrame{

          IHMBarreHautProfesseur barreHaut = new IHMBarreHautProfesseur(this);
	IHMMenuGaucheProfesseur menuGauche = new IHMMenuGaucheProfesseur();
	IHMBarreBas barreBas = new IHMBarreBas();
        JPanel panel1 = new JPanel(new BorderLayout());
        JPanel t=null;
          
	public FFondFenetreProfesseur(){

		panel1.add(menuGauche, BorderLayout.WEST);
	        panel1.add(barreHaut, BorderLayout.NORTH);
                panel1.add(barreBas, BorderLayout.SOUTH);
                panel1.setPreferredSize(new Dimension(800, 500));
		setSize(new Dimension(800, 600));
		
                setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
        
        public JPanel getPanel(){
            return t;
        }
        
        public void setPanel(JPanel j){
            
               panel1.removeAll();
               panel1.add(menuGauche, BorderLayout.WEST);
	        panel1.add(barreHaut, BorderLayout.NORTH);
                panel1.add(barreBas, BorderLayout.SOUTH);
               t=j;
		panel1.add(getPanel(), BorderLayout.CENTER);
		add(panel1);
               setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
        }
        
        public void setMenuGauche(Boolean F)
        {
            if(F)
            menuGauche.setVisible(true);
            else
            menuGauche.setVisible(false);
        }

}