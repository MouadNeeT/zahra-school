package panelsAppel;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import panelsProfesseur.Horloge;
import panelsProfesseur.IHMBarreVisionMenuPrincipal;
import panelsProfesseur.IHMBarreVisionPresentation;
import panelsProfesseur.IHMMenuProfesseurPrincipal;

import manager.GroupeManager;
import manager.ProfesseurManager;
import domaine.Groupe;
import domaine.Professeur;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IHMAppel1.java
 *
 * Created on 8 mai 2012, 12:51:51
 */



/**
 *
 * @author GAUTIER
 */
public class IHMAppel1 extends javax.swing.JPanel {
	frames.FFondFenetreProfesseur f;
	int choixTypeAppel = 1; //album
    /** Creates new form IHMAppel1 */
    public IHMAppel1(frames.FFondFenetreProfesseur f) {
    	this.f = f;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButtonListe = new javax.swing.JRadioButton();
        jRadioButtonAlbum = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        boutonSuivant = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Type d'appel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 255)))); // NOI18N

        jLabel1.setText("Choisissez le type d'appel :");

        jRadioButtonListe.setText("D�filement sous forme de liste");
        jRadioButtonListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonListeActionPerformed(evt);
            }
        });

        jRadioButtonAlbum.setSelected(true);
        jRadioButtonAlbum.setText("D�filement sous forme d'album photo");
        jRadioButtonAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAlbumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonListe)
                    .addComponent(jRadioButtonAlbum))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonAlbum)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonListe)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choix du groupe pour l'appel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 255)))); // NOI18N

        jLabel2.setText("Choisissez le nom du groupe :");

        jList1.setModel(new javax.swing.AbstractListModel() {
        	ArrayList<Groupe> listeGroupes = GroupeManager.getInstance().getAllGroupes();
            public int getSize() { return listeGroupes.size(); }
            public Object getElementAt(int i) { return (listeGroupes.get(i).getNom()); }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        
        boutonSuivant.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/suivantAppel1.png")); // NOI18N
        boutonSuivant.setToolTipText("Faire l'appel");
        boutonSuivant.setBorder(null);
        boutonSuivant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonSuivantActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/attention.png")); // NOI18N
        jLabel3.setText("Le d�filement sous forme de liste n'affichera pas la photo des �l�ves");

        jLabel4.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/cloche.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(786, Short.MAX_VALUE)
                .addComponent(boutonSuivant, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(boutonSuivant, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void jRadioButtonListeActionPerformed(java.awt.event.ActionEvent evt) {

    		jRadioButtonAlbum.setSelected(false);
    		jRadioButtonListe.setSelected(true);
    	
    		
    }
    
    private void jRadioButtonAlbumActionPerformed(java.awt.event.ActionEvent evt) {
    	jRadioButtonAlbum.setSelected(true);
		jRadioButtonListe.setSelected(false);
    	
    }

    private void boutonSuivantActionPerformed(java.awt.event.ActionEvent evt) {
    	int i = jList1.getSelectedIndex();
    	ArrayList<Groupe> list = GroupeManager.getInstance().getAllGroupes();
    	Groupe groupe = list.get(i);
        if (jRadioButtonAlbum.isSelected()) choixTypeAppel = 1;
        else choixTypeAppel = 2;
        
        JPanel panel = new JPanel(new BorderLayout());    		
		IHMBarreVisionPresentation visionMenu = new IHMBarreVisionPresentation(f, "Faire l'appel", "");
        switch (choixTypeAppel) {
        	case 1 : panelsAppel.IHMAppel2 appel2 = new IHMAppel2(f, groupe);
        	         panel.add(appel2, BorderLayout.WEST);
        	         panel.add(visionMenu, BorderLayout.NORTH);
        	         f.setPanel(panel);
        	         f.setMenuGauche(true);
        	         break;
        	case 2 : //en construction
        		     break;
            default : break;
        }
        
    	
    }


    // Variables declaration - do not modify
    private javax.swing.JButton boutonSuivant;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonAlbum;
    private javax.swing.JRadioButton jRadioButtonListe;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration

}
