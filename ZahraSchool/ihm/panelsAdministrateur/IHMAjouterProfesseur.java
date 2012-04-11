package panelsAdministrateur;

import java.awt.BorderLayout;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import panels.Horloge;
import panels.IHMBarreVisionMenuPrincipal;

import frames.FFondFenetreAdministrateur;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IHMModifierSupprimerProfesseur.java
 *
 * Created on 7 avr. 2012, 23:12:26
 */


/**
 *
 * @author Evi and Max
 */
public class IHMAjouterProfesseur extends javax.swing.JPanel {

	FFondFenetreAdministrateur f;
    /** Creates new form IHMModifierSupprimerProfesseur */
    public IHMAjouterProfesseur(FFondFenetreAdministrateur f) {
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
    	GregorianCalendar calendar = new GregorianCalendar();
        jPanel5 = new javax.swing.JPanel();
        boutonModifier = new javax.swing.JButton();
        boutonSupprimer = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        nom = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        naissance = new javax.swing.JLabel();
        telephone = new javax.swing.JLabel();
        dateEmbauche = new javax.swing.JLabel();
        niveauEtudes = new javax.swing.JLabel();
        adresse = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAdresseAdresse = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textNiveauEtudesEtudes = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        textJourNaissance = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        textAnneeNaissance = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jTextFieldPrenom = new javax.swing.JTextField();
        jTextFieldDateNaissance = new javax.swing.JTextField();
        jTextFieldTelephone = new javax.swing.JTextField();
        jTextFieldDateEmbaucheJour = new javax.swing.JTextField();
        jTextFieldDateEmbaucheMois = new javax.swing.JTextField();
        jTextFieldDateEmbaucheAnnee = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        
        jTextFieldDateEmbaucheMois.setText("" + (calendar.get(GregorianCalendar.MONTH) + 1));
        jTextFieldDateEmbaucheAnnee.setText("" + (calendar.get(GregorianCalendar.YEAR)));
        jTextFieldDateEmbaucheJour.setText("" + (calendar.get(GregorianCalendar.DAY_OF_MONTH)));
        
       // boutonModifier.setIcon(new javax.swing.ImageIcon("../Tests/images/imageBoutonEnregistrer.png")); // NOI18N
        boutonModifier.setText("Enregistrer");
        boutonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonModifierActionPerformed(evt);
            }
        });

      //  boutonSupprimer.setIcon(new javax.swing.ImageIcon("../Tests/images/imageBoutonSupprimer.png")); // NOI18N
        boutonSupprimer.setText("Annuler");
        boutonSupprimer.setToolTipText("En cliquant sur annuler, vous retournerez � la page d'accueil");
        boutonSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(boutonModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boutonSupprimer)
                .addGap(107, 107, 107))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonSupprimer)
                    .addComponent(boutonModifier))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 153)))); // NOI18N

        nom.setFont(new java.awt.Font("Tahoma", 1, 12));
        nom.setText("Nom :");

        prenom.setFont(new java.awt.Font("Tahoma", 1, 12));
        prenom.setText("Prenom :");

        naissance.setFont(new java.awt.Font("Tahoma", 1, 12));
        naissance.setText("Date de naissance :");

        telephone.setFont(new java.awt.Font("Tahoma", 1, 12));
        telephone.setText("Num�ro de t�l�phone :");
        telephone.setToolTipText("");

        dateEmbauche.setFont(new java.awt.Font("Tahoma", 1, 12));
        dateEmbauche.setText("Date d'embauche :");

        niveauEtudes.setFont(new java.awt.Font("Tahoma", 1, 12));
        niveauEtudes.setText("Niveau d'�tudes :");

        adresse.setFont(new java.awt.Font("Tahoma", 1, 12));
        adresse.setText("Adresse :");

        textAdresseAdresse.setColumns(20);
        textAdresseAdresse.setFont(new java.awt.Font("Tahoma", 0, 12));
        textAdresseAdresse.setRows(5);
        jScrollPane1.setViewportView(textAdresseAdresse);

        textNiveauEtudesEtudes.setColumns(20);
        textNiveauEtudesEtudes.setFont(new java.awt.Font("Tahoma", 0, 12));
        textNiveauEtudesEtudes.setRows(5);
        jScrollPane2.setViewportView(textNiveauEtudesEtudes);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setForeground(new java.awt.Color(51, 0, 153));
        jLabel7.setText("Fiche � remplir");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12));

        textAnneeNaissance.setFont(new java.awt.Font("Tahoma", 0, 12));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12));

        jTextFieldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrenomActionPerformed(evt);
            }
        });

        jTextFieldDateNaissance.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jTextFieldDateNaissance.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldDateNaissance.setText("exemple : 05/12/2000");

        jTextFieldTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelephoneActionPerformed(evt);
            }
        });

        jTextFieldDateEmbaucheAnnee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateEmbaucheAnneeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("jj");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("mm");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("aaaa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(naissance)
                            .addComponent(telephone)
                            .addComponent(adresse)
                            .addComponent(nom)
                            .addComponent(prenom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTelephone)
                            .addComponent(jTextFieldDateNaissance)
                            .addComponent(jTextFieldPrenom)
                            .addComponent(jTextFieldNom)
                            .addComponent(jScrollPane1))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textJourNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addGap(50, 50, 50)
                                        .addComponent(textAnneeNaissance))
                                    .addComponent(niveauEtudes))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jTextFieldDateEmbaucheJour, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldDateEmbaucheMois, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDateEmbaucheAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel15)
                                        .addGap(126, 126, 126)
                                        .addComponent(jLabel16))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(dateEmbauche))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nom)
                            .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(niveauEtudes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prenom)
                            .addComponent(jTextFieldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textJourNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(textAnneeNaissance))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(naissance)
                                .addComponent(jTextFieldDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telephone)
                            .addComponent(jTextFieldTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adresse)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dateEmbauche)
                                    .addComponent(jTextFieldDateEmbaucheJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextFieldDateEmbaucheMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldDateEmbaucheAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))))
                .addGap(14, 14, 14)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>

    private void boutonModifierActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	JOptionPane jop1 = new JOptionPane();
		jop1.showMessageDialog(null, "Enregistrement du professeur", "Information", JOptionPane.INFORMATION_MESSAGE);
    }

    private void boutonSupprimerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
		IHMBarreVisionMenuPrincipal visionMenu = new IHMBarreVisionMenuPrincipal();
		IHMMenuPrincipalAdministrateur menuPrincipal = new IHMMenuPrincipalAdministrateur(f);
		JPanel panel = new JPanel(new BorderLayout());    		
		panel.add(new Horloge(), BorderLayout.WEST);
		panel.add(menuPrincipal, BorderLayout.EAST);
		panel.add(visionMenu, BorderLayout.NORTH);
		f.setPanel(panel);
}

    private void jTextFieldPrenomActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFieldTelephoneActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFieldDateEmbaucheAnneeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel adresse;
    private javax.swing.JButton boutonModifier;
    private javax.swing.JButton boutonSupprimer;
    private javax.swing.JLabel dateEmbauche;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldDateEmbaucheAnnee;
    private javax.swing.JTextField jTextFieldDateEmbaucheJour;
    private javax.swing.JTextField jTextFieldDateEmbaucheMois;
    private javax.swing.JTextField jTextFieldDateNaissance;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldPrenom;
    private javax.swing.JTextField jTextFieldTelephone;
    private javax.swing.JLabel naissance;
    private javax.swing.JLabel niveauEtudes;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel prenom;
    private javax.swing.JLabel telephone;
    private javax.swing.JTextArea textAdresseAdresse;
    private javax.swing.JLabel textAnneeNaissance;
    private javax.swing.JLabel textJourNaissance;
    private javax.swing.JTextArea textNiveauEtudesEtudes;
    // End of variables declaration

}
