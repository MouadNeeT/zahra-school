/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panelsGroupe;

import panelsGroupe.*;

/**
 *
 * @author wael
 */
public class IHMChoixGroupe extends javax.swing.JPanel {

    /**
     * Creates new form IHMChoixEleve2
     */
     frames.FFondFenetreProfesseur f;
    public IHMChoixGroupe(frames.FFondFenetreProfesseur f) {
        this.f=f;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel18 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BoutonSupprimerGroupe = new javax.swing.JToggleButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        BoutonAjouterGroupe = new javax.swing.JToggleButton();
        jPanel16 = new javax.swing.JPanel();
        BoutonModifierGroupe = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BoutonVisualisationGroupe = new javax.swing.JToggleButton();

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel18.setPreferredSize(new java.awt.Dimension(206, 93));

        jLabel4.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/Supprimer.jpg"));

        BoutonSupprimerGroupe.setBackground(new java.awt.Color(255, 255, 255));
        BoutonSupprimerGroupe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BoutonSupprimerGroupe.setForeground(new java.awt.Color(0, 0, 204));
        BoutonSupprimerGroupe.setText("Supprimer un groupe");
        BoutonSupprimerGroupe.setToolTipText("Pour supprimer un groupe, cliquez ici.");
        BoutonSupprimerGroupe.setBorder(null);
        BoutonSupprimerGroupe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BoutonSupprimerGroupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonSupprimerGroupeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BoutonSupprimerGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addComponent(BoutonSupprimerGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel17.setPreferredSize(new java.awt.Dimension(206, 93));

        jLabel7.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/Ajouter.jpg"));

        BoutonAjouterGroupe.setBackground(new java.awt.Color(255, 255, 255));
        BoutonAjouterGroupe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BoutonAjouterGroupe.setForeground(new java.awt.Color(0, 0, 204));
        BoutonAjouterGroupe.setText("Ajouter un groupe");
        BoutonAjouterGroupe.setToolTipText("Pour ajouter un groupe, cliquez ici.");
        BoutonAjouterGroupe.setBorder(null);
        BoutonAjouterGroupe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BoutonAjouterGroupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonAjouterGroupeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BoutonAjouterGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BoutonAjouterGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel16.setPreferredSize(new java.awt.Dimension(206, 93));

        BoutonModifierGroupe.setBackground(new java.awt.Color(255, 255, 255));
        BoutonModifierGroupe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BoutonModifierGroupe.setForeground(new java.awt.Color(0, 0, 204));
        BoutonModifierGroupe.setText("Modifier un groupe");
        BoutonModifierGroupe.setToolTipText("Pour modifier un élève, cliquez ici.");
        BoutonModifierGroupe.setBorder(null);
        BoutonModifierGroupe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BoutonModifierGroupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonModifierGroupeActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/EDITER.jpg"));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BoutonModifierGroupe, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addComponent(BoutonModifierGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel15.setPreferredSize(new java.awt.Dimension(206, 93));

        jLabel5.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/visualizer.jpg"));

        BoutonVisualisationGroupe.setBackground(new java.awt.Color(255, 255, 255));
        BoutonVisualisationGroupe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BoutonVisualisationGroupe.setForeground(new java.awt.Color(0, 0, 204));
        BoutonVisualisationGroupe.setText("Visualiser un groupe");
        BoutonVisualisationGroupe.setToolTipText("Pour visualiser un groupe, cliquez ici.");
        BoutonVisualisationGroupe.setBorder(null);
        BoutonVisualisationGroupe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BoutonVisualisationGroupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonVisualisationGroupeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BoutonVisualisationGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BoutonVisualisationGroupe, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonSupprimerGroupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonSupprimerGroupeActionPerformed
        IHMRechercherGroupe RG = new IHMRechercherGroupe(f,3);
        f.setPanel(RG);
    }//GEN-LAST:event_BoutonSupprimerGroupeActionPerformed

    private void BoutonAjouterGroupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonAjouterGroupeActionPerformed
        IHMAjouterGroupe AG = new IHMAjouterGroupe(f);
        f.setPanel(AG);
    }//GEN-LAST:event_BoutonAjouterGroupeActionPerformed

    private void BoutonModifierGroupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonModifierGroupeActionPerformed
        IHMRechercherGroupe RG = new IHMRechercherGroupe(f,1);
        f.setPanel(RG);
    }//GEN-LAST:event_BoutonModifierGroupeActionPerformed

    private void BoutonVisualisationGroupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonVisualisationGroupeActionPerformed
        IHMRechercherGroupe RG = new IHMRechercherGroupe(f,1);
        f.setPanel(RG);
    }//GEN-LAST:event_BoutonVisualisationGroupeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BoutonAjouterGroupe;
    private javax.swing.JToggleButton BoutonModifierGroupe;
    private javax.swing.JToggleButton BoutonSupprimerGroupe;
    private javax.swing.JToggleButton BoutonVisualisationGroupe;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    // End of variables declaration//GEN-END:variables
}
