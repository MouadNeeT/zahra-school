/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IHMAfficheFicheEleve.java
 *
 * Created on 27 mars 2012, 00:08:19
 */

package panelsGroupe;

import domaine.Groupe;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import manager.GroupeManager;
import panelsProfesseur.IHMBarreVisionPresentation;

/**
 *
 * @author alexandre
 */
public class IHMSupprimerGroupe extends javax.swing.JPanel {
 frames.FFondFenetreProfesseur f;
 
    /** Creates new form IHMAfficheFicheEleve */
    public IHMSupprimerGroupe( frames.FFondFenetreProfesseur f) {
        this.f=f;
        initComponents();
        // affiche la liste des groupes
        jList1.setModel(new javax.swing.AbstractListModel() {
                ArrayList<Groupe> listeGroupes = GroupeManager.getInstance().getAllGroupes();
                public int getSize() { return listeGroupes.size(); }
                public Object getElementAt(int i) { return (listeGroupes.get(i).getNom()); }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        Nom = new javax.swing.JLabel();
        Niveau = new javax.swing.JLabel();
        Tarif = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Supprimer un groupe"));

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des groupes :"));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButton2.setText("Annuler");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setText("Tarif :");

        jLabel11.setText("Niveau du groupe :");

        jLabel1.setText("Nom du groupe:");

        jLabel4.setText("Date de creation :");

        date.setText(" ");

        Nom.setText(" ");

        Niveau.setText(" ");

        Tarif.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Niveau, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Tarif, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Nom))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(date)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Niveau))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Tarif))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jButton4.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/imageBoutonSupprimer.png"));
        jButton4.setText("Supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(644, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panelsGroupe.IHMChoixGroupe CG = new  panelsGroupe.IHMChoixGroupe(f);
        f.AfficheBarreVision(CG,"   Gestion des Groupes","../ZahraSchool/images/groupe.png");
}//GEN-LAST:event_jButton2ActionPerformed

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        jList1.setModel(new javax.swing.AbstractListModel() {
                ArrayList<Groupe> listeGroupes = GroupeManager.getInstance().getAllGroupes();
                public int getSize() { return listeGroupes.size(); }
                public Object getElementAt(int i) {
                    groupeAsupprimer = listeGroupes.get(i);
                    // affiche infos dans les champs
                    Nom.setText(listeGroupes.get(i).getNom());
                    Niveau.setText(listeGroupes.get(i).getNiveau());
                    Tarif.setText(""+listeGroupes.get(i).getTarif());
                    date.setText(listeGroupes.get(i).getDateDeCreation().getDate()+"/"+listeGroupes.get(i).getDateDeCreation().getMonth()+"/"+listeGroupes.get(i).getDateDeCreation().getYear());
                    return (listeGroupes.get(i).getNom());
                }
        });
    }//GEN-LAST:event_jList1MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JOptionPane jp = new JOptionPane();
        int reponse = jp.showConfirmDialog(null, "Supprimer le groupe "+Nom.getText(), "Confirmation", JOptionPane.YES_NO_OPTION);

        if (reponse == JOptionPane.YES_OPTION)
        {
        // delete
        GroupeManager.getInstance().delete(groupeAsupprimer);

        JOptionPane jp2 = new JOptionPane();
	jp2.showMessageDialog(null, "Suppression du groupe", "Information", JOptionPane.INFORMATION_MESSAGE);
        IHMSupprimerGroupe SG = new IHMSupprimerGroupe(f);
        f.AfficheBarreVision(SG,"   Gestion des Groupes","../ZahraSchool/images/groupe.png");
        }
}//GEN-LAST:event_jButton4ActionPerformed

    private Groupe groupeAsupprimer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Niveau;
    private javax.swing.JLabel Nom;
    private javax.swing.JLabel Tarif;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
