package frames;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import panelsProfesseur.IHMBarreBas;
import panelsProfesseur.IHMBarreHautProfesseur;
import panelsProfesseur.IHMMenuGaucheProfesseur;
import panelsAdministrateur.IHMBarreHautAdministrateur;
import panelsAdministrateur.IHMMenuPrincipalAdministrateur;

public class FFondFenetreAdministrateur extends JFrame{

	//FFondFenetreAdministrateur f;
	IHMBarreHautAdministrateur barreHaut = new IHMBarreHautAdministrateur(this);
	
	IHMBarreBas barreBas = new IHMBarreBas();
	
        JPanel panel1 = new JPanel(new BorderLayout());
        JPanel t=null;
          
	public FFondFenetreAdministrateur(){

		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    	int height = (int)dimension.getHeight();
    	int width  = (int)dimension.getWidth();
    	
	        panel1.add(barreHaut, BorderLayout.NORTH);
                panel1.add(barreBas, BorderLayout.SOUTH);
                //panel1.add(this.getPanel(), BorderLayout.CENTER);
                panel1.setPreferredSize(new Dimension(800, 500));
		setSize(new Dimension(width, height));
		add(panel1);
                setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
        
        public JPanel getPanel(){
            return t;
        }
        
        public void setPanel(JPanel j){
            
               panel1.removeAll();
               
	        panel1.add(barreHaut, BorderLayout.NORTH);
                panel1.add(barreBas, BorderLayout.SOUTH);
               t=j;
		panel1.add(getPanel(), BorderLayout.CENTER);
		add(panel1);
               setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
        }
	

}

