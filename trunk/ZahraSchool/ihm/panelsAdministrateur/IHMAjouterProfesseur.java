/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InterfaceAjouterProfesseur.java
 *
 * Created on 9 mars 2012, 11:52:32
 */

package panelsAdministrateur;

import java.awt.BorderLayout;
import java.sql.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import manager.ProfesseurManager;

import database.SpringJDBC;
import domaine.Professeur;

import panelsProfesseur.Horloge;
import panelsProfesseur.IHMBarreVisionMenuPrincipal;
import frames.FFondFenetreAdministrateur;

/**
 *
 * @author Evi and Max
 */
public class IHMAjouterProfesseur extends javax.swing.JPanel {

    /** Creates new form InterfaceAjouterProfesseur */

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
        jPanel2 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        boutonAnnuler = new javax.swing.JButton();
        boutonEnregistrer = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        nom = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        naissance = new javax.swing.JLabel();
        telephone = new javax.swing.JLabel();
        dateEmbauche = new javax.swing.JLabel();
        niveauEtudes = new javax.swing.JLabel();
        adresse = new javax.swing.JLabel();
        motDePasse = new javax.swing.JLabel();
        textNom = new javax.swing.JTextField();
        textPrenom = new javax.swing.JTextField();
        textJourNaissance = new javax.swing.JTextField();
        textMoisNaissance = new javax.swing.JTextField();
        textAnneeNaissance = new javax.swing.JTextField();
        textNumTel = new javax.swing.JTextField();
        textjourDateEmbauche = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAdresse = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textNiveauEtudes = new javax.swing.JTextArea();
        textMotDePasse = new javax.swing.JPasswordField();
        textMoisDateEmbauche = new javax.swing.JTextField();
        textAnneeDateEmbauche = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        motDePasse1 = new javax.swing.JLabel();
        textIdentifiant = new javax.swing.JTextField();
        
        textMoisDateEmbauche.setText("" + (calendar.get(GregorianCalendar.MONTH) + 1));
        textAnneeDateEmbauche.setText("" + (calendar.get(GregorianCalendar.YEAR)));
        textjourDateEmbauche.setText("" + (calendar.get(GregorianCalendar.DAY_OF_MONTH)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        boutonAnnuler.setFont(new java.awt.Font("Tahoma", 1, 12));
        boutonAnnuler.setForeground(new java.awt.Color(255, 0, 0));
        boutonAnnuler.setText("Annuler");
        boutonAnnuler.setToolTipText("");
        boutonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAnnulerActionPerformed(evt);
            }
        });

        boutonEnregistrer.setFont(new java.awt.Font("Tahoma", 1, 12));
        boutonEnregistrer.setForeground(new java.awt.Color(0, 0, 153));
        boutonEnregistrer.setText("Enregistrer");
        boutonEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonEnregistrerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(486, 486, 486)
                .addComponent(boutonEnregistrer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(boutonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boutonEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        motDePasse.setFont(new java.awt.Font("Tahoma", 1, 12));
        motDePasse.setText("Mot de passe :");

        textNom.setFont(new java.awt.Font("Tahoma", 0, 12));

        textPrenom.setFont(new java.awt.Font("Tahoma", 0, 12));

        textJourNaissance.setFont(new java.awt.Font("Tahoma", 0, 12));

        textMoisNaissance.setFont(new java.awt.Font("Tahoma", 0, 12));

        textAnneeNaissance.setFont(new java.awt.Font("Tahoma", 0, 12));

        textNumTel.setFont(new java.awt.Font("Tahoma", 0, 12));
        textNumTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumTelActionPerformed(evt);
            }
        });

        textjourDateEmbauche.setFont(new java.awt.Font("Tahoma", 0, 12));

        textAdresse.setColumns(20);
        textAdresse.setFont(new java.awt.Font("Tahoma", 0, 12));
        textAdresse.setRows(5);
        jScrollPane1.setViewportView(textAdresse);

        textNiveauEtudes.setColumns(20);
        textNiveauEtudes.setFont(new java.awt.Font("Tahoma", 0, 12));
        textNiveauEtudes.setRows(5);
        jScrollPane2.setViewportView(textNiveauEtudes);

        textMotDePasse.setFont(new java.awt.Font("Tahoma", 0, 12));
        textMotDePasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMotDePasseActionPerformed(evt);
            }
        });

        textMoisDateEmbauche.setFont(new java.awt.Font("Tahoma", 0, 12));

        textAnneeDateEmbauche.setFont(new java.awt.Font("Tahoma", 0, 12));

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 11));
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("jj");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11));
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("mm");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 11));
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("aaaa");

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11));
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("jj");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 11));
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("mm");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11));
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("aaaa");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setForeground(new java.awt.Color(51, 0, 153));
        jLabel7.setText("Fiche d�taill�e");

        motDePasse1.setFont(new java.awt.Font("Tahoma", 1, 12));
        motDePasse1.setText("Identifiant :");

        textIdentifiant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textIdentifiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdentifiantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adresse)
                            .addComponent(nom)
                            .addComponent(prenom)
                            .addComponent(telephone)
                            .addComponent(naissance))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textJourNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textMoisNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textAnneeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel3))
                                    .addComponent(textPrenom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(textNom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(textNumTel, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateEmbauche)
                            .addComponent(niveauEtudes)
                            .addComponent(motDePasse1)
                            .addComponent(motDePasse))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(textjourDateEmbauche, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(14, 14, 14)
                                    .addComponent(textMoisDateEmbauche, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(textAnneeDateEmbauche, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6)))
                            .addComponent(textIdentifiant, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(textMotDePasse, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                        .addGap(9, 9, 9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prenom))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textJourNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(textMoisNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(textAnneeNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(naissance))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adresse))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(niveauEtudes)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateEmbauche)
                            .addComponent(textjourDateEmbauche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(textMoisDateEmbauche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(textAnneeDateEmbauche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(motDePasse1)
                            .addComponent(textIdentifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(motDePasse)
                            .addComponent(textMotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>

    private void boutonEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    	
    	String nom = textNom.getText();
        String prenom = textPrenom.getText();
        int dateNaissanceJour = Integer.parseInt(textJourNaissance.getText());
        int dateNaissanceMois = Integer.parseInt(textMoisNaissance.getText());
        int dateNaissanceAnnee = Integer.parseInt(textAnneeNaissance.getText());
        int dateEmbaucheJour = Integer.parseInt(textjourDateEmbauche.getText());
        int dateEmbaucheMois = Integer.parseInt(textMoisDateEmbauche.getText());
        int dateEmbaucheAnnee = Integer.parseInt(textAnneeDateEmbauche.getText());
        int telephone = Integer.parseInt(textNumTel.getText());
        String niveauEtudes = textNiveauEtudes.getText();
        String adresse = textAdresse.getText(); 
        String identifiant = textIdentifiant.getText();
        @SuppressWarnings("deprecation")
		String motDePasse = textMotDePasse.getText();
    	
        @SuppressWarnings("deprecation")
		Date dateDeNaissance = new Date(dateNaissanceJour, dateNaissanceMois, dateNaissanceAnnee);
        @SuppressWarnings("deprecation")
		Date dateEmbauche  = new Date(dateEmbaucheJour,dateEmbaucheMois,dateEmbaucheAnnee);
    	
        Professeur professeurBase;
		professeurBase = ProfesseurManager.getInstance().readById(textIdentifiant.getText());
		
		
		if (professeurBase != null) {
    		JOptionPane jop1 = new JOptionPane();
			jop1.showMessageDialog(null, "Cet identifiant est d�j� pris", "Erreur", JOptionPane.ERROR_MESSAGE);      	
			textIdentifiant.setText("");
			//boutonEnregistrerActionPerformed(evt);
		}
		else{
        Professeur professeur = new Professeur(identifiant, motDePasse, nom, prenom,
        									   adresse, telephone, niveauEtudes, 
        									   dateDeNaissance, dateEmbauche, null, null);
        
        
		//Professeur professeur = new Professeur("alexandre.sacareau@gmail.com", "xxxx", "SACAREAU", "Alexandre", "TOULOUSE", 658955488, "BAC + 4", dateNaisssance, dateEmbauche, null, null);
		ProfesseurManager.getInstance().create(professeur);
		System.out.println(professeur.getMotDePasse());
        
        JOptionPane jop1 = new JOptionPane();
		jop1.showMessageDialog(null, "Enregistrement du professeur", "Information", JOptionPane.INFORMATION_MESSAGE);
		}
    }                                                 

    private void boutonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	IHMBarreVisionMenuPrincipal visionMenu = new IHMBarreVisionMenuPrincipal();
		IHMMenuPrincipalAdministrateur menuPrincipal = new IHMMenuPrincipalAdministrateur(f);
		JPanel panel = new JPanel(new BorderLayout());    		
		panel.add(new Horloge(), BorderLayout.WEST);
		panel.add(menuPrincipal, BorderLayout.EAST);
		panel.add(visionMenu, BorderLayout.NORTH);
		f.setPanel(panel);
    }                                             

    private void textNumTelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
}

    private void textIdentifiantActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void textMotDePasseActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel adresse;
    private javax.swing.JButton boutonAnnuler;
    private javax.swing.JButton boutonEnregistrer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel dateEmbauche;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel motDePasse;
    private javax.swing.JLabel motDePasse1;
    private javax.swing.JLabel naissance;
    private javax.swing.JLabel niveauEtudes;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel prenom;
    private javax.swing.JLabel telephone;
    private javax.swing.JTextArea textAdresse;
    private javax.swing.JTextField textAnneeDateEmbauche;
    private javax.swing.JTextField textAnneeNaissance;
    private javax.swing.JTextField textIdentifiant;
    private javax.swing.JTextField textJourNaissance;
    private javax.swing.JTextField textMoisDateEmbauche;
    private javax.swing.JTextField textMoisNaissance;
    private javax.swing.JPasswordField textMotDePasse;
    private javax.swing.JTextArea textNiveauEtudes;
    private javax.swing.JTextField textNom;
    private javax.swing.JTextField textNumTel;
    private javax.swing.JTextField textPrenom;
    private javax.swing.JTextField textjourDateEmbauche;
    // End of variables declaration

}
