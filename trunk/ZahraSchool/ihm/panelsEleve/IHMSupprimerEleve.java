/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IHMAfficheFicheEleve.java
 *
 * Created on 27 mars 2012, 00:08:19
 */

package panelsEleve;

import domaine.Eleve;
import domaine.Groupe;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import manager.EleveManager;
import manager.GroupeManager;

/**
 *
 * @author alexandre
 */
public class IHMSupprimerEleve extends javax.swing.JPanel {
    frames.FFondFenetreProfesseur f;

    /** Creates new form IHMAfficheFicheEleve */
    public IHMSupprimerEleve( frames.FFondFenetreProfesseur f) {
        this.f=f;
        initComponents();
        // ajout images boutons
        jButton4.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/imageBoutonSupprimer.png"));
        // Affichage de la liste des groupes
        jList1.setModel(new javax.swing.AbstractListModel() {
                ArrayList<Groupe> listeGroupes = GroupeManager.getInstance().getAllGroupes();
                public int getSize() { return listeGroupes.size(); }
                public Object getElementAt(int i) { return (listeGroupes.get(i).getNom()); }
        });
        // Affichage de la liste de tous les eleves
        jList2.setModel(new javax.swing.AbstractListModel() {
                ArrayList<Eleve> listeEleves = EleveManager.getInstance().getAllEleves();
                public int getSize() { return listeEleves.size(); }
                public Object getElementAt(int i) { return (listeEleves.get(i).getNom())+" "+(listeEleves.get(i).getPrenom()); }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        prenompere = new javax.swing.JLabel();
        nompere = new javax.swing.JLabel();
        adresse = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        prenommere = new javax.swing.JLabel();
        teleleve = new javax.swing.JLabel();
        telpa = new javax.swing.JLabel();
        nivetu = new javax.swing.JLabel();
        nomere = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        niveleve = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Photo = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Voir la fiche d'un eleve"));

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des groupes"));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setBorder(javax.swing.BorderFactory.createTitledBorder("Eleves du groupe"));
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jList2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jButton2.setText("Retour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        prenompere.setText("prenompere");

        nompere.setText("nompere");

        adresse.setText("adresse");

        date.setText("date");

        prenom.setText("prenom");

        nom.setText("nom");

        jLabel10.setText("Telephone de l'eleve :");

        jLabel11.setText("Niveau de l'eleve :");

        jLabel7.setText("Nom de la mere :");

        jLabel9.setText("Telephone des Parents :");

        jLabel2.setText("Prénom :");

        jLabel1.setText("Nom :");

        jLabel6.setText("Prenom du pere :");

        jLabel5.setText("Nom du pere :");

        jLabel4.setText("Adresse de domicile :");

        jLabel3.setText("Date de naissance :");

        jLabel8.setText("Prenom de la mere :");

        jList3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ses groupes"));
        jScrollPane3.setViewportView(jList3);

        prenommere.setText("prenommere");

        teleleve.setText("teleleve");

        telpa.setText("telpa");

        nivetu.setText("nivetu");

        nomere.setText("nommere");

        jLabel24.setText("Niveau d'etudes:");

        niveleve.setText("niveleve");

        jLabel14.setText("L'eleve paye :");

        status.setText("status");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Photo"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Photo, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Photo, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(prenom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adresse, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomere, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(nompere, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(prenompere, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(prenommere, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telpa, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(teleleve, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(niveleve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(nivetu, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addGap(11, 11, 11))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nompere))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(prenompere))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nomere, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(prenommere))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teleleve)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telpa)
                    .addComponent(jLabel9)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(prenom))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(adresse))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nivetu)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(niveleve))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(status)))
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(637, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        IHMChoixEleve CE = new IHMChoixEleve(f);
        f.AfficheBarreVision(CE,"   Gestion des Eleves","../ZahraSchool/images/eleve.png");
}//GEN-LAST:event_jButton2ActionPerformed

    private void jList1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MousePressed
        if (!jList1.isSelectionEmpty()) {
            jList1.setModel(new javax.swing.AbstractListModel() {
                ArrayList<Groupe> listeGroupes = GroupeManager.getInstance().getAllGroupes();
                public int getSize() { return listeGroupes.size(); }
                public Object getElementAt(int i) {
                    //listeEleves = listeGroupes.get(i).getListeEleves();
                    jList2.setModel(new javax.swing.AbstractListModel() {
                        public int getSize() { return listeEleves.size(); }
                        public Object getElementAt(int j) {
                            return (listeEleves.get(j).getNom()+" "+listeEleves.get(j).getPrenom());
                        }
                    });
                    return (listeGroupes.get(i).getNom());
                }
            });
        } else System.out.println("aucun element selectione");
    }//GEN-LAST:event_jList1MousePressed

    private void jList2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MousePressed
        if (!jList2.isSelectionEmpty()){
            jList2.setModel(new javax.swing.AbstractListModel() {
                public int getSize() { return listeEleves.size(); }
                public Object getElementAt(int i) {
                    // Eleve selectionné
                    eleve = listeEleves.get(i);

                    // Affiche infos
                    nom.setText(eleve.getNom());
                    prenom.setText(eleve.getPrenom());
                    date.setText(eleve.getDateDeNaissance().getDate()+"/"+eleve.getDateDeNaissance().getMonth()+"/"+eleve.getDateDeNaissance().getYear());
                    adresse.setText(eleve.getAdresse());
                    nomere.setText(eleve.getNomMere());
                    nompere.setText(eleve.getNomPere());
                    prenommere.setText(eleve.getPrenomMere());
                    prenompere.setText(eleve.getPrenomPere());
                    teleleve.setText("" + eleve.getNumeroTelephoneEleve());
                    telpa.setText("" +eleve.getNumeroTelephoneParent());
                    niveleve.setText(eleve.getNiveauTest());
                    nivetu.setText(eleve.getNiveauEtudes());
                    status.setText(eleve.getStatus());
                    // Sa liste de groupe

                    // Sa photo
                    Photo.setIcon(new javax.swing.ImageIcon(eleve.getPhoto()));
                    
                    return (listeEleves.get(i).getNom() + " " + listeEleves.get(i).getPrenom());
                }
            });
        } else System.out.println("aucun element selectione");
    }//GEN-LAST:event_jList2MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    JOptionPane jp = new JOptionPane();
    int reponse = jp.showConfirmDialog(null, "Supprimer l'eleve "+nom.getText(), "Confirmation", JOptionPane.YES_NO_OPTION);
    
    if (reponse == JOptionPane.YES_OPTION)
    {
        // delete
        EleveManager.getInstance().delete(eleve);

        JOptionPane jp2 = new JOptionPane();
	jp2.showMessageDialog(null, "Suppression de l'eleve", "Information", JOptionPane.INFORMATION_MESSAGE);
        IHMSupprimerEleve SE = new IHMSupprimerEleve(f);
        f.AfficheBarreVision(SE,"   Gestion des Eleves","../ZahraSchool/images/eleve.png");
    }
}//GEN-LAST:event_jButton4ActionPerformed

    // liste d'eleves
    private ArrayList<Eleve> listeEleves=null;
    private Eleve eleve ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Photo;
    private javax.swing.JLabel adresse;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel niveleve;
    private javax.swing.JLabel nivetu;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel nomere;
    private javax.swing.JLabel nompere;
    private javax.swing.JLabel prenom;
    private javax.swing.JLabel prenommere;
    private javax.swing.JLabel prenompere;
    private javax.swing.JLabel status;
    private javax.swing.JLabel teleleve;
    private javax.swing.JLabel telpa;
    // End of variables declaration//GEN-END:variables

}