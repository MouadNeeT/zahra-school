package panelsAdministrateur;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;


import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import panels.IHMMenuProfesseurPrincipal;

import frames.FFondFenetreAdministrateur;
import frames.FFondFenetreProfesseur;


public class IHMConnexion extends JPanel {
	
	String typePersonne = "Professeur";

	frames.FFondFenetreAdministrateur f1;
	frames.FFondFenetreProfesseur f2;
    /** Creates new form Connexion2 */
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

        jLabel4 = new JLabel();
        jLabel3 = new JLabel();
        jTextField1 = new JTextField();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jComboBox1 = new JComboBox();
        jTextField2 = new JTextField();
        jLabel1 = new JLabel();

        jLabel4.setText("S'identifier en tant que :");

        jLabel3.setText("Identifiant ou mot de passe oubli�?");

        jTextField1.setText("[a-z][A-Z][0-9]");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Identifiant :");

        jButton1.setText("S'identifier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "Professeur", "Administrateur" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	System.out.println(""+jComboBox1.getSelectedItem());
            	if (jComboBox1.getSelectedItem() == typePersonne){
            		typePersonne = "Professeur";
            	}
            	else typePersonne = "Administrateur";
            }
        });

        jTextField2.setText("ex : nom_professeur@gmail.com");
        jTextField2.setToolTipText("null");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Mot de passe :");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2,GroupLayout.PREFERRED_SIZE, 27,GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
}

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	System.out.println(typePersonne);
    	if (typePersonne == "Administrateur"){
    		f1 = new FFondFenetreAdministrateur();
    		IHMMenuPrincipalAdministrateur menuPrincipal = new IHMMenuPrincipalAdministrateur(f1);
    		f1.setPanel(menuPrincipal);
    	}
    	else{
    		f2 = new FFondFenetreProfesseur();
    		JPanel panel = new JPanel(new BorderLayout());
    		IHMMenuProfesseurPrincipal menuPrincipal2 = new IHMMenuProfesseurPrincipal(f2);
    		//panel.add(menuPrincipal2, BorderLayout.CENTER);
    		//panel.setBackground(Color.BLACK);
    		f2.setPanel(menuPrincipal2);
    		f2.setLocationRelativeTo(null);
    		f2.setVisible(true); 
    	}
}

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

}

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
}


    // Variables declaration - do not modify
    private JButton jButton1;
    private JComboBox jComboBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JTextField jTextField1;
    private JTextField jTextField2;
    // End of variables declaration

}

