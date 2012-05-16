package frames;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JPanel;

import panelsProfesseur.IHMBarreBas;
import panelsProfesseur.IHMBarreHautProfesseur;
import panelsProfesseur.IHMBarreVisionPresentation;
import panelsProfesseur.IHMMenuGaucheProfesseur;

public class FFondFenetreProfesseur extends JFrame {
        IHMBarreHautProfesseur barreHaut = new IHMBarreHautProfesseur(this);
	IHMMenuGaucheProfesseur menuGauche = new IHMMenuGaucheProfesseur(this);
	IHMBarreBas barreBas = new IHMBarreBas();
        JPanel panel1 = new JPanel(new BorderLayout());
        JPanel t=null;
          
	public FFondFenetreProfesseur(){
		Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
                int height = (int)dimension.getHeight();
                int width  = (int)dimension.getWidth();

		panel1.add(menuGauche, BorderLayout.WEST);
	        panel1.add(barreHaut, BorderLayout.NORTH);
                panel1.add(barreBas, BorderLayout.SOUTH);
                panel1.setPreferredSize(new Dimension(800, 500));
		setSize(new Dimension(width, height));
		
                setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
        
        public JPanel getPanel(){
            return t;
        }

        // Insere le panel avec le menu et barre de presentation
        public void setPanel(JPanel j) {
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

        // Afiche ou masque le menu gauche
        public void setMenuGauche(Boolean F)
        {
            if(F)
            menuGauche.setVisible(true);
            else
            menuGauche.setVisible(false);
        }

        // Affiche et ordonne le panel avec la barre de presentation
        public void AfficheBarreVision(JPanel panelMilieu, String titre, String image)
        {
        JPanel panel = new JPanel(new BorderLayout());
        IHMBarreVisionPresentation barreVision = new IHMBarreVisionPresentation(this,titre,image);
        panel.add(barreVision, BorderLayout.NORTH);

        JPanel panel1 = new JPanel();
        BoxLayout vertical = new BoxLayout(panel1, BoxLayout.Y_AXIS);
        panel1.setLayout(vertical);
        panel1.add(Box.createGlue());
        panel1.add(panelMilieu);
        panel1.add(Box.createGlue());

        JPanel panel2 = new JPanel();
        BoxLayout horizontal = new BoxLayout(panel2, BoxLayout.X_AXIS);
        panel2.setLayout(horizontal);
        panel2.add(Box.createGlue());
        panel2.add(panel1);
        panel2.add(Box.createGlue());

        panel.add(panel2, BorderLayout.CENTER);
        setPanel(panel);
        setMenuGauche(true);
        }

        // Redimension de l'image (utilise pour l'affichage de la photo de l'eleve)
        public ImageIcon image(File f){
            ImageIcon image = new ImageIcon(f.getAbsolutePath());
            Image im = image.getImage();
            float coef = (float) (((float)(im.getWidth(this)))/110.0);
            int	hauteur	= Math.round(im.getHeight(this)/coef);
            im	= im.getScaledInstance(110,hauteur,Image.SCALE_DEFAULT);
            image.setImage(im);
            return image;
        }

        public ImageIcon image2(String adressePath){
            ImageIcon image = new ImageIcon(adressePath);
            Image im = image.getImage();
            float coef = (float) (((float)(im.getWidth(this)))/110.0);
            int	hauteur	= Math.round(im.getHeight(this)/coef);
            im	= im.getScaledInstance(110,hauteur,Image.SCALE_DEFAULT);
            image.setImage(im);
            return image;
        }

}
