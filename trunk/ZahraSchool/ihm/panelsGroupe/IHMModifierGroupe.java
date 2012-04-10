/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IHMAjouterEleve.java
 *
 * Created on 26 mars 2012, 23:33:49
 */

package panelsGroupe;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import panelsAdministrateur.IHMBarreVisionGestionEleve;

/**
 *
 * @author alexandre
 */
public class IHMModifierGroupe extends javax.swing.JPanel {
 frames.FFondFenetreProfesseur f;
    /** Creates new form IHMAjouterEleve */
    public IHMModifierGroupe( frames.FFondFenetreProfesseur f) {
        this.f=f;
        initComponents();
        // ajout d'un image dans le bouton modifier
        ModifierGroupeBoutonModifier.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/imageBoutonEditCrayon.png"));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ModifierGroupeListeGroupes = new javax.swing.JList();
        ModifierGroupeBoutonModifier = new javax.swing.JButton();
        ModifierGroupeBoutonAnnuler = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ModifierGroupePrenomProfesseur = new javax.swing.JTextField();
        ModifierGroupeDateJour = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ModifierGroupeNom = new javax.swing.JTextField();
        ModifierGroupeNomProfesseur = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ModifierGroupeTarifs1 = new javax.swing.JTextField();
        ModifierGroupeDateAnnee = new javax.swing.JTextField();
        ModifierGroupeDateMois = new javax.swing.JTextField();
        ModifierGroupeTypeGroupe = new javax.swing.JTextField();
        ModifierGroupeNiveauGroupe = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setBorder(javax.swing.BorderFactory.createTitledBorder("Modifier un groupe"));

        jLabel10.setText("Type de groupe");

        jLabel11.setText("Niveau du groupe :");

        jLabel12.setText("Groupe(s) :");

        ModifierGroupeListeGroupes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "GROUPE 1", "GROUPE 2", "GROUPE 3" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ModifierGroupeListeGroupes);

        ModifierGroupeBoutonModifier.setIcon(new javax.swing.ImageIcon("..ZahraSchool/images/imageBoutonEditCrayon.png"));
        ModifierGroupeBoutonModifier.setText(" Modifier");
        ModifierGroupeBoutonModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierGroupeBoutonModifierActionPerformed(evt);
            }
        });

        ModifierGroupeBoutonAnnuler.setText("Annuler");
        ModifierGroupeBoutonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierGroupeBoutonAnnulerActionPerformed(evt);
            }
        });

        jLabel6.setText("Prenom du professeur :");

        jLabel5.setText("Nom du professeur :");

        jLabel7.setText("Tarifs :");

        jLabel1.setText("Nom :");

        jLabel3.setText("Date de la création :");

        ModifierGroupeDateMois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierGroupeDateMoisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(354, 354, 354))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 217, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ModifierGroupeNom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ModifierGroupeNomProfesseur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ModifierGroupeDateJour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ModifierGroupeDateMois, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ModifierGroupeDateAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(1, 1, 1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ModifierGroupeTarifs1)
                                            .addComponent(ModifierGroupePrenomProfesseur, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))))
                        .addGap(77, 77, 77)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ModifierGroupeNiveauGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ModifierGroupeTypeGroupe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ModifierGroupeBoutonModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ModifierGroupeBoutonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(ModifierGroupeTypeGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ModifierGroupeNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(ModifierGroupeDateJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ModifierGroupeDateMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ModifierGroupeDateAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(ModifierGroupeNiveauGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ModifierGroupeNomProfesseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ModifierGroupePrenomProfesseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ModifierGroupeTarifs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ModifierGroupeBoutonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModifierGroupeBoutonModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ModifierGroupeBoutonModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierGroupeBoutonModifierActionPerformed
      IHMRechercherGroupe p = new IHMRechercherGroupe(f,2);
      panels.IHMJDialogConfirmation d1 = new panels.IHMJDialogConfirmation(f,true,"Le groupe "+ModifierGroupeNom.getText()+" a bien été modifié",p);
      d1.setLocation(300,200);
      d1.setVisible(true);
}//GEN-LAST:event_ModifierGroupeBoutonModifierActionPerformed

    private void ModifierGroupeBoutonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierGroupeBoutonAnnulerActionPerformed
         panelsGroupe.IHMChoixGroupe CG = new  panelsGroupe.IHMChoixGroupe(f);
        IHMBarreVisionGestionEleve barreVision = new IHMBarreVisionGestionEleve(f);
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(CG, BorderLayout.CENTER);
        panel.add(barreVision, BorderLayout.NORTH);
        f.setPanel(panel);
        f.setMenuGauche(true);
      
    }//GEN-LAST:event_ModifierGroupeBoutonAnnulerActionPerformed

    private void ModifierGroupeDateMoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierGroupeDateMoisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModifierGroupeDateMoisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModifierGroupeBoutonAnnuler;
    private javax.swing.JButton ModifierGroupeBoutonModifier;
    private javax.swing.JTextField ModifierGroupeDateAnnee;
    private javax.swing.JTextField ModifierGroupeDateJour;
    private javax.swing.JTextField ModifierGroupeDateMois;
    private javax.swing.JList ModifierGroupeListeGroupes;
    private javax.swing.JTextField ModifierGroupeNiveauGroupe;
    private javax.swing.JTextField ModifierGroupeNom;
    private javax.swing.JTextField ModifierGroupeNomProfesseur;
    private javax.swing.JTextField ModifierGroupePrenomProfesseur;
    private javax.swing.JTextField ModifierGroupeTarifs1;
    private javax.swing.JTextField ModifierGroupeTypeGroupe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
