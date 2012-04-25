package frames;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

import panelsAdministrateur.IHMConnexion;

public class FConnexionZahraSchool extends JFrame {
    frames.FFondFenetreAdministrateur frame;
    frames.FFondFenetreProfesseur f2;
    JPanel panel = new JPanel();
    
    JPanel t=null;
    IHMConnexion connexion = new IHMConnexion(frame, f2);
    
    public FConnexionZahraSchool(){
    	panel.add(connexion);
    	getContentPane().add(panel);	
    	setSize(new Dimension(470, 450));  	
	setLocationRelativeTo(null);
	setVisible(true);      
    }

    // Main
    public static void main(String[] args) {
    	FConnexionZahraSchool f = new FConnexionZahraSchool();
    }
}
