package panelsAdministrateur;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import frames.FFondFenetreAdministrateur;
import javax.swing.JLabel;


public class IHMMenuPrincipalAdministrateur extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	frames.FFondFenetreAdministrateur f;
	
	public IHMMenuPrincipalAdministrateur(frames.FFondFenetreAdministrateur f){
		this.f = f;
		initComponents();
	}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jPanel2 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            boutonFicheProfesseur = new javax.swing.JButton();
            jPanel3 = new javax.swing.JPanel();
            jLabel3 = new javax.swing.JLabel();
            boutonAjouterProfesseur = new javax.swing.JButton();
            jPanel4 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            boutonModifierProfesseur = new javax.swing.JButton();
            jPanel5 = new javax.swing.JPanel();
            jLabel4 = new javax.swing.JLabel();
            boutonSupprimerProfesseur = new javax.swing.JButton();

            jPanel2.setBackground(new java.awt.Color(255, 255, 255));
            jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            jLabel1.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/imageVisualiserProfesseur.png")); // NOI18N

            boutonFicheProfesseur.setBackground(new java.awt.Color(255, 255, 255));
            boutonFicheProfesseur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            boutonFicheProfesseur.setForeground(new java.awt.Color(0, 0, 204));
            boutonFicheProfesseur.setText("Visualiser fiche professeur");
            boutonFicheProfesseur.setBorder(null);
            boutonFicheProfesseur.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    boutonFicheProfesseurActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(31, 31, 31)
                    .addComponent(boutonFicheProfesseur)
                    .addContainerGap(89, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(boutonFicheProfesseur)))
                    .addContainerGap(24, Short.MAX_VALUE))
            );

            jPanel3.setBackground(new java.awt.Color(255, 255, 255));
            jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            jLabel3.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/imageAjouterProfesseur.png")); // NOI18N

            boutonAjouterProfesseur.setBackground(new java.awt.Color(255, 255, 255));
            boutonAjouterProfesseur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            boutonAjouterProfesseur.setForeground(new java.awt.Color(0, 0, 204));
            boutonAjouterProfesseur.setText("Ajouter professeur");
            boutonAjouterProfesseur.setBorder(null);
            boutonAjouterProfesseur.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    boutonAjouterProfesseurActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addGap(58, 58, 58)
                    .addComponent(boutonAjouterProfesseur)
                    .addContainerGap(128, Short.MAX_VALUE))
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(boutonAjouterProfesseur)))
                    .addContainerGap(24, Short.MAX_VALUE))
            );

            jPanel4.setBackground(new java.awt.Color(255, 255, 255));
            jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            jLabel2.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/imageModifierProfesseur.png")); // NOI18N

            boutonModifierProfesseur.setBackground(new java.awt.Color(255, 255, 255));
            boutonModifierProfesseur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            boutonModifierProfesseur.setForeground(new java.awt.Color(0, 0, 204));
            boutonModifierProfesseur.setText("Modifier Fiche professeur");
            boutonModifierProfesseur.setBorder(null);
            boutonModifierProfesseur.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    boutonModifierProfesseurActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addGap(28, 28, 28)
                    .addComponent(boutonModifierProfesseur)
                    .addContainerGap(90, Short.MAX_VALUE))
            );
            jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(boutonModifierProfesseur)))
                    .addContainerGap(23, Short.MAX_VALUE))
            );

            jPanel5.setBackground(new java.awt.Color(255, 255, 255));
            jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

            jLabel4.setIcon(new javax.swing.ImageIcon("../ZahraSchool/images/imageSupprimerProfesseur.png")); // NOI18N

            boutonSupprimerProfesseur.setBackground(new java.awt.Color(255, 255, 255));
            boutonSupprimerProfesseur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
            boutonSupprimerProfesseur.setForeground(new java.awt.Color(0, 0, 204));
            boutonSupprimerProfesseur.setText("Supprimer professeur");
            boutonSupprimerProfesseur.setBorder(null);
            boutonSupprimerProfesseur.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    boutonSupprimerProfesseurActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4)
                    .addGap(54, 54, 54)
                    .addComponent(boutonSupprimerProfesseur)
                    .addContainerGap(116, Short.MAX_VALUE))
            );
            jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(boutonSupprimerProfesseur)))
                    .addContainerGap(24, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(89, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(110, 110, 110)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(196, 196, 196))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(183, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
        }// </editor-fold>

        private void boutonFicheProfesseurActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        	//f = new FFondFenetreAdministrateur();
        	JPanel panel = new JPanel(new BorderLayout());
        	JPanel visualiserETVision = new JPanel(new BorderLayout());
        	IHMMenuGaucheAdministrateur menuAdminGauche = new IHMMenuGaucheAdministrateur(f);
        	panelDateEmbaucheAdministrateur dateEmbauche = new panelDateEmbaucheAdministrateur();
    		IHMVisualiserProfesseur visualiser = new IHMVisualiserProfesseur(f);
    		visualiserETVision.add(visualiser, BorderLayout.NORTH);
    		visualiserETVision.add(dateEmbauche, BorderLayout.WEST);
    		visualiserETVision.add(visualiser, BorderLayout.CENTER);
    		visualiserETVision.add(new IHMBarreVisionVisualiserProfesseur(f), BorderLayout.NORTH);
        	panel.add(menuAdminGauche, BorderLayout.WEST);
        	panel.add(visualiserETVision, BorderLayout.CENTER);
    		f.setPanel(panel);
        }

        private void boutonSupprimerProfesseurActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        	JPanel panel = new JPanel(new BorderLayout());
        	JPanel visualiserETVision = new JPanel(new BorderLayout());
        	IHMMenuGaucheAdministrateur menuAdminGauche = new IHMMenuGaucheAdministrateur(f);
    		IHMModifierSupprimerProfesseur visualiser = new IHMModifierSupprimerProfesseur(f);
    		visualiserETVision.add(visualiser, BorderLayout.NORTH);
    		
    		visualiserETVision.add(visualiser, BorderLayout.CENTER);
    		visualiserETVision.add(new IHMBarreVisionSupprimerProfesseur(f), BorderLayout.NORTH);
        	panel.add(menuAdminGauche, BorderLayout.WEST);
        	panel.add(visualiserETVision, BorderLayout.CENTER);
    		f.setPanel(panel);
        	
        }

        private void boutonAjouterProfesseurActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
            JPanel panel1 = new JPanel();
        panel1.setSize(700,200);
        JLabel label = new JLabel("                                                 ");
        panel1.add(label);
        	JPanel panel = new JPanel(new BorderLayout());
        	JPanel visualiserETVision = new JPanel(new BorderLayout());
        	IHMMenuGaucheAdministrateur menuAdminGauche = new IHMMenuGaucheAdministrateur(f);
    		IHMAjouterProfesseur ajouter = new IHMAjouterProfesseur(f);		
    		visualiserETVision.add(ajouter, BorderLayout.CENTER);
    		visualiserETVision.add(new IHMBarreVisionAjouterProfesseur(f), BorderLayout.NORTH);
                visualiserETVision.add(panel1, BorderLayout.WEST);
        	panel.add(menuAdminGauche, BorderLayout.WEST);
        	panel.add(visualiserETVision, BorderLayout.CENTER);
    		f.setPanel(panel);
        }

        private void boutonModifierProfesseurActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:
        	JPanel panel = new JPanel(new BorderLayout());
        	JPanel visualiserETVision = new JPanel(new BorderLayout());
        	IHMMenuGaucheAdministrateur menuAdminGauche = new IHMMenuGaucheAdministrateur(f);
        	IHMModifierSupprimerProfesseur visualiser = new IHMModifierSupprimerProfesseur(f);
    		visualiserETVision.add(visualiser, BorderLayout.NORTH);
    		
    		visualiserETVision.add(visualiser, BorderLayout.CENTER);
    		visualiserETVision.add(new IHMBarreVisionModifierProfesseur(f), BorderLayout.NORTH);
        	panel.add(menuAdminGauche, BorderLayout.WEST);
        	panel.add(visualiserETVision, BorderLayout.CENTER);
    		f.setPanel(panel);
        }


        // Variables declaration - do not modify
        private javax.swing.JButton boutonAjouterProfesseur;
        private javax.swing.JButton boutonFicheProfesseur;
        private javax.swing.JButton boutonModifierProfesseur;
        private javax.swing.JButton boutonSupprimerProfesseur;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        // End of variables declaration

    }
