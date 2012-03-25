package panels;
import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;


public class IHMBarreBas extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JButton jButton3 = new JButton();
    
    public IHMBarreBas(){
    	initComponents();
    }
    
    
    
    public void initComponents(){

        jPanel1 = new javax.swing.JPanel();
        boutonReglementInterieur = new javax.swing.JButton();
        boutonAide = new javax.swing.JButton();
        boutonInformationsSurLeSite = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        boutonReglementInterieur.setBackground(new java.awt.Color(204, 204, 255));
        boutonReglementInterieur.setFont(new java.awt.Font("Tahoma", 2, 12));
        boutonReglementInterieur.setForeground(new java.awt.Color(0, 0, 153));
        boutonReglementInterieur.setText("Règlement intérieur");
        boutonReglementInterieur.setBorder(null);

        boutonAide.setBackground(new java.awt.Color(204, 204, 255));
        boutonAide.setFont(new java.awt.Font("Tahoma", 2, 12));
        boutonAide.setForeground(new java.awt.Color(0, 0, 153));
        boutonAide.setText("Aide ?");
        boutonAide.setBorder(null);
        boutonAide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonAideActionPerformed(evt);
            }
        });

        boutonInformationsSurLeSite.setBackground(new java.awt.Color(204, 204, 255));
        boutonInformationsSurLeSite.setFont(new java.awt.Font("Tahoma", 2, 12));
        boutonInformationsSurLeSite.setForeground(new java.awt.Color(0, 0, 153));
        boutonInformationsSurLeSite.setText("Informations sur le site");
        boutonInformationsSurLeSite.setBorder(null);
        boutonInformationsSurLeSite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonInformationsSurLeSiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(boutonInformationsSurLeSite, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(boutonAide, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 473, Short.MAX_VALUE)
                .addComponent(boutonReglementInterieur, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonReglementInterieur)
                    .addComponent(boutonAide)
                    .addComponent(boutonInformationsSurLeSite))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>

    private void boutonAideActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void boutonInformationsSurLeSiteActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        // TODO add your handling code here:
    }                                                           


    // Variables declaration - do not modify
    private javax.swing.JButton boutonAide;
    private javax.swing.JButton boutonInformationsSurLeSite;
    private javax.swing.JButton boutonReglementInterieur;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration

}

