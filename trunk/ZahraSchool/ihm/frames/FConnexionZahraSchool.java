package frames;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;

import panelsAdministrateur.IHMConnexion;

public class FConnexionZahraSchool extends JWindow{
	
	frames.FFondFenetreAdministrateur frame;
	frames.FFondFenetreProfesseur f2;
	JPanel panel = new JPanel();
    JPanel t=null;
    IHMConnexion connexion = new IHMConnexion(frame, f2);
    
    public FConnexionZahraSchool(){
    	panel.add(connexion);
    	getContentPane().add(panel);	
    	setSize(new Dimension(500, 400));  	
		setLocationRelativeTo(null);
		setVisible(true);       
    }
    
    public static void main(String[] args) {
    	FConnexionZahraSchool f = new FConnexionZahraSchool();

	}
}
