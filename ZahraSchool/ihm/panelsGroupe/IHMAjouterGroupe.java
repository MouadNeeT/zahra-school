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

import panelsEleve.*;

/**
 *
 * @author alexandre
 */
public class IHMAjouterGroupe extends javax.swing.JPanel {
 frames.FFondFenetreProfesseur f;
    public IHMAjouterGroupe( frames.FFondFenetreProfesseur f) {
        this.f=f;
        initComponents();
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AjoutGroupeDateJours = new javax.swing.JComboBox();
        AjoutGroupeDateMois = new javax.swing.JComboBox();
        AjoutGroupeDateAnnees = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        AjoutGroupeBoutonAjouter = new javax.swing.JButton();
        AjoutGroupeBoutonAnnule = new javax.swing.JButton();
        AjoutGroupeBoutonRadCollectif = new javax.swing.JRadioButton();
        AjoutGroupeBoutonRadIndividuel = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        AjoutGroupeAvertissement1 = new javax.swing.JLabel();
        AjoutGroupeAvertissement2 = new javax.swing.JLabel();
        AjoutGroupeNomGroupe = new javax.swing.JTextField();
        AjoutGroupeNomProfesseur = new javax.swing.JTextField();
        AjoutGroupePrenomProfesseur = new javax.swing.JTextField();
        AjoutGroupeNiveauGroupe = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AjoutGroupeTarifs = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setBorder(javax.swing.BorderFactory.createTitledBorder("Ajout d'un groupe"));

        jLabel1.setText("Nom :");

        jLabel3.setText("Date de la création :");

        jLabel5.setText("Nom du professeur :");

        jLabel6.setText("Prenom du professeur :");

        AjoutGroupeDateJours.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        AjoutGroupeDateJours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutGroupeDateJoursActionPerformed(evt);
            }
        });

        AjoutGroupeDateMois.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre" }));
        AjoutGroupeDateMois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutGroupeDateMoisActionPerformed(evt);
            }
        });

        AjoutGroupeDateAnnees.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        AjoutGroupeDateAnnees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutGroupeDateAnneesActionPerformed(evt);
            }
        });

        jLabel11.setText("Niveau du groupe :");

        AjoutGroupeBoutonAjouter.setText("Ajouter");
        AjoutGroupeBoutonAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutGroupeBoutonAjouterActionPerformed(evt);
            }
        });

        AjoutGroupeBoutonAnnule.setText("Annuler");
        AjoutGroupeBoutonAnnule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutGroupeBoutonAnnuleActionPerformed(evt);
            }
        });

        buttonGroup1.add(AjoutGroupeBoutonRadCollectif);
        AjoutGroupeBoutonRadCollectif.setText("Collectif");
        AjoutGroupeBoutonRadCollectif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutGroupeBoutonRadCollectifActionPerformed(evt);
            }
        });

        buttonGroup1.add(AjoutGroupeBoutonRadIndividuel);
        AjoutGroupeBoutonRadIndividuel.setText("Individuel");
        AjoutGroupeBoutonRadIndividuel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Type de groupe:");

        AjoutGroupeAvertissement1.setText("Attention le nombre d'élèves dans les groupes individuels ");

        AjoutGroupeAvertissement2.setText("est au maximum de 5.");

        jLabel7.setText("Tarifs :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AjoutGroupeNomGroupe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(AjoutGroupePrenomProfesseur, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AjoutGroupeDateJours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AjoutGroupeDateMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AjoutGroupeDateAnnees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(AjoutGroupeNomProfesseur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(AjoutGroupeTarifs, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AjoutGroupeAvertissement2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AjoutGroupeBoutonRadIndividuel)
                                            .addComponent(AjoutGroupeBoutonRadCollectif)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(AjoutGroupeBoutonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(AjoutGroupeBoutonAnnule, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(AjoutGroupeNiveauGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(AjoutGroupeAvertissement1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(793, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(AjoutGroupeNomGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(AjoutGroupeNiveauGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(AjoutGroupeBoutonRadIndividuel))
                            .addComponent(AjoutGroupeBoutonRadCollectif))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AjoutGroupeAvertissement1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AjoutGroupeAvertissement2)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AjoutGroupeBoutonAnnule, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AjoutGroupeBoutonAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(AjoutGroupeDateJours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AjoutGroupeDateMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AjoutGroupeDateAnnees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(AjoutGroupeNomProfesseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(AjoutGroupePrenomProfesseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(AjoutGroupeTarifs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AjoutGroupeDateAnneesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutGroupeDateAnneesActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_AjoutGroupeDateAnneesActionPerformed

    private void AjoutGroupeDateMoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutGroupeDateMoisActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_AjoutGroupeDateMoisActionPerformed

    private void AjoutGroupeDateJoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutGroupeDateJoursActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_AjoutGroupeDateJoursActionPerformed

    private void AjoutGroupeBoutonAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutGroupeBoutonAjouterActionPerformed
        panelsGroupe.IHMAjouterGroupe p = new  panelsGroupe.IHMAjouterGroupe(f);
        panels.IHMJDialogConfirmation d1 = new panels.IHMJDialogConfirmation(f,true,"Le groupe "+AjoutGroupeNomGroupe.getText()+" a bien été ajouté",p);
        d1.setLocation(300,200);
        d1.setVisible(true);
    }//GEN-LAST:event_AjoutGroupeBoutonAjouterActionPerformed

    private void AjoutGroupeBoutonAnnuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutGroupeBoutonAnnuleActionPerformed
        panelsGroupe.IHMAjouterGroupe AG = new  panelsGroupe.IHMAjouterGroupe(f);
        f.setPanel(AG);
    }//GEN-LAST:event_AjoutGroupeBoutonAnnuleActionPerformed

    private void AjoutGroupeBoutonRadCollectifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutGroupeBoutonRadCollectifActionPerformed

    }//GEN-LAST:event_AjoutGroupeBoutonRadCollectifActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AjoutGroupeAvertissement1;
    private javax.swing.JLabel AjoutGroupeAvertissement2;
    private javax.swing.JButton AjoutGroupeBoutonAjouter;
    private javax.swing.JButton AjoutGroupeBoutonAnnule;
    private javax.swing.JRadioButton AjoutGroupeBoutonRadCollectif;
    private javax.swing.JRadioButton AjoutGroupeBoutonRadIndividuel;
    private javax.swing.JComboBox AjoutGroupeDateAnnees;
    private javax.swing.JComboBox AjoutGroupeDateJours;
    private javax.swing.JComboBox AjoutGroupeDateMois;
    private javax.swing.JTextField AjoutGroupeNiveauGroupe;
    private javax.swing.JTextField AjoutGroupeNomGroupe;
    private javax.swing.JTextField AjoutGroupeNomProfesseur;
    private javax.swing.JTextField AjoutGroupePrenomProfesseur;
    private javax.swing.JTextField AjoutGroupeTarifs;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}