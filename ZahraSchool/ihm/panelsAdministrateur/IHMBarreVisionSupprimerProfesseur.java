package panelsAdministrateur;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import panelsProfesseur.Horloge;
import panelsProfesseur.IHMBarreVisionMenuPrincipal;
import frames.FFondFenetreAdministrateur;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IHMBarreVisionVisualiserProfesseur.java
 *
 * Created on 7 avr. 2012, 22:16:22
 */


/**
 *
 * @author Evi and Max
 */
public class IHMBarreVisionSupprimerProfesseur extends javax.swing.JPanel {

	FFondFenetreAdministrateur f;
    /** Creates new form IHMBarreVisionVisualiserProfesseur */
    public IHMBarreVisionSupprimerProfesseur(FFondFenetreAdministrateur f) {
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

        jLabel1 = new javax.swing.JLabel();
        boutonRetourMenuPrincipal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Supprimer un professeur");

        boutonRetourMenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boutonRetourMenuPrincipal.setForeground(new java.awt.Color(0, 102, 255));
        boutonRetourMenuPrincipal.setBackground(new java.awt.Color(240,240,240));
        boutonRetourMenuPrincipal.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/imageMaison.png")); 
        boutonRetourMenuPrincipal.setText("Retour au menu pricipal");
        boutonRetourMenuPrincipal.setBorder(null);
        boutonRetourMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boutonRetourMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonRetourMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boutonRetourMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonRetourMenuPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void boutonRetourMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	IHMBarreVisionMenuPrincipal visionMenu = new IHMBarreVisionMenuPrincipal();
		IHMMenuPrincipalAdministrateur menuPrincipal = new IHMMenuPrincipalAdministrateur(f);
		JPanel panel = new JPanel(new BorderLayout());    		
		panel.add(new Horloge(), BorderLayout.WEST);
		panel.add(menuPrincipal, BorderLayout.EAST);
		panel.add(visionMenu, BorderLayout.NORTH);
		f.setPanel(panel);
    }


    // Variables declaration - do not modify
    private javax.swing.JButton boutonRetourMenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration

}
