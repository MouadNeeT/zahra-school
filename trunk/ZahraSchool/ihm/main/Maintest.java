package main;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Maintest extends JFrame {
    JPanel panel = new JPanel();

    IHMConnexion2 connexion = new IHMConnexion2();
    
    public Maintest(){
    	panel.add(connexion);
    	getContentPane().add(panel);	
    	setSize(new Dimension(470, 450));  	
	setLocationRelativeTo(null);
	setVisible(true);      
    }

    // Main
    public static void main(String[] args) {
    	Maintest f = new Maintest();
    }
}
