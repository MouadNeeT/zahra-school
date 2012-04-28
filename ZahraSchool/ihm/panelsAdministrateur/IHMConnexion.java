package panelsAdministrateur;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import panelsProfesseur.Horloge;
import panelsProfesseur.IHMBarreVisionMenuPrincipal;
import panelsProfesseur.IHMMenuProfesseurPrincipal;

import frames.FFondFenetreAdministrateur;
import frames.FFondFenetreProfesseur;
import javax.swing.JLabel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IHMConnexionZahraSchool.java
 *
 * Created on 6 avr. 2012, 15:30:58
 */

public class IHMConnexion extends javax.swing.JPanel {
    String typePersonne = "Professeur";
    frames.FFondFenetreAdministrateur f1;
    frames.FFondFenetreProfesseur f2;

    /**
     * Creates new form IHMConnexionZahraSchool
     */
    public IHMConnexion(frames.FFondFenetreAdministrateur f1, frames.FFondFenetreProfesseur f2) {
        this.f1 = f1;
    	this.f2 = f2;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldIdentifiant = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldMotDePasse = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxIdentifiaction = new javax.swing.JComboBox();
        jButtonIdentification = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonIdentifiantMdpOublie = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("S'identifier"));

        jLabel1.setText("Identifiant :");

        jTextFieldIdentifiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentifiantActionPerformed(evt);
            }
        });

        jLabel2.setText("Mot de passe :");

        jPasswordFieldMotDePasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldMotDePasseActionPerformed(evt);
            }
        });

        jLabel3.setText("S'identifier en tant que :");

        jComboBoxIdentifiaction.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Professeur", "Administrateur" }));
        jComboBoxIdentifiaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIdentifiactionActionPerformed(evt);
            }
        });

        jButtonIdentification.setText("S'identifier");
        jButtonIdentification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIdentificationActionPerformed(evt);
            }
        });

        jLabel4.setText("Identifiant ou mot de passe oublie ?");

        jButtonIdentifiantMdpOublie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonIdentifiantMdpOublie.setForeground(new java.awt.Color(0, 0, 204));
        jButtonIdentifiantMdpOublie.setText("Obtenir son identifiant et/ou mot de passe");
        jButtonIdentifiantMdpOublie.setBorder(null);
        jButtonIdentifiantMdpOublie.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonIdentifiantMdpOublie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIdentifiantMdpOublie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIdentifiantMdpOublieActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("ex : penom.nom@exemple.com");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Caracteres admis : [A-Z] [a-z] [0-9]");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(jButtonIdentification))
                        .addComponent(jButtonIdentifiantMdpOublie))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxIdentifiaction, 0, 164, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldMotDePasse, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jTextFieldIdentifiant, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel4)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordFieldMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxIdentifiaction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jButtonIdentification)
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonIdentifiantMdpOublie)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void jPasswordFieldMotDePasseActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonIdentifiantMdpOublieActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	JOptionPane jop = new JOptionPane();
        //ImageIcon img = new ImageIcon("images/cysboy.gif");

    	String mess = "Votre identifiant correspond a \n";
        mess += "votre addresse de messagerie, \n";
        mess += "Votre mot de passe correspond \n";
        mess += "egalement au mot de passe de \n";
        mess += "votre messagerie.\n";

        jop.showMessageDialog(null, mess, "Oublie ?", JOptionPane.INFORMATION_MESSAGE);
    }

    private void jComboBoxIdentifiactionActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        System.out.println(""+jComboBoxIdentifiaction.getSelectedItem());
            	if (jComboBoxIdentifiaction.getSelectedItem() == typePersonne)
                {
            		typePersonne = "Professeur";
            	}
            	else
                        typePersonne = "Administrateur";
    }

    private void jTextFieldIdentifiantActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButtonIdentificationActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        System.out.println(typePersonne);
    	if (typePersonne == "Administrateur")
        {
    		f1 = new FFondFenetreAdministrateur();
    		IHMBarreVisionMenuPrincipal visionMenu = new IHMBarreVisionMenuPrincipal();
    		IHMMenuPrincipalAdministrateur menuPrincipal = new IHMMenuPrincipalAdministrateur(f1);
    		JPanel panel = new JPanel(new BorderLayout());    		
    		panel.add(new Horloge(), BorderLayout.WEST);
    		panel.add(menuPrincipal, BorderLayout.EAST);
    		panel.add(visionMenu, BorderLayout.NORTH);
    		f1.setPanel(panel);
    		f1.setLocationRelativeTo(null);
    		f1.setVisible(true);
    	}
    	else
        {
    		f2 = new FFondFenetreProfesseur();   		
    		JPanel panel = new JPanel(new BorderLayout());
    		IHMBarreVisionMenuPrincipal visionMenu = new IHMBarreVisionMenuPrincipal();
    		IHMMenuProfesseurPrincipal menuPrincipal2 = new IHMMenuProfesseurPrincipal(f2);
    		panel.add(menuPrincipal2, BorderLayout.CENTER);
    		panel.add(visionMenu, BorderLayout.NORTH);
    		//panel.add(new Horloge(), BorderLayout.WEST);
                JLabel label = new JLabel();
                label.setText("                    ");
                panel.add(label, BorderLayout.WEST);
    		f2.setPanel(panel);
    		f2.setLocationRelativeTo(null);
    		f2.setVisible(true);
                f2.setMenuGauche(false);
    	}
    }


    // Variables declaration - do not modify
    private javax.swing.JButton jButtonIdentifiantMdpOublie;
    private javax.swing.JButton jButtonIdentification;
    private javax.swing.JComboBox jComboBoxIdentifiaction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldMotDePasse;
    private javax.swing.JTextField jTextFieldIdentifiant;
    // End of variables declaration

}
