package panelsProfesseur;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.*;
import java.util.Date;
import javax.swing.*;

public class Horloge  extends JPanel{   
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Horloge(){
		
		DateFormat date = DateFormat.getDateInstance(DateFormat.FULL);
	    SimpleDateFormat heure = new SimpleDateFormat("HH 'h' mm 'minutes'");
	    JPanel panel = new JPanel(new BorderLayout());
	    JPanel panel2 = new JPanel(new BorderLayout());
	    JLabel heureAffichage = new JLabel("    " +heure.format(new Date()));
	    JLabel dateAffichage = new JLabel("    " +date.format(new Date()));
	    JLabel image = new JLabel();
	    image.setIcon(new ImageIcon("../ZahraSchool/images/imageHeure.png"));
	    panel.add(heureAffichage, BorderLayout.CENTER);
	    panel.add(dateAffichage, BorderLayout.NORTH);
	    panel.add(image, BorderLayout.SOUTH);
	    //panel.setBackground(Color.white);
	    panel2.add(panel, BorderLayout.CENTER);
	    add(panel2, BorderLayout.CENTER);
	    panel2.setSize(150, 50);
	    setSize(150, 90);
		
	}
  public static void main(String[] args) { 
	  Horloge h = new Horloge();
   }
}