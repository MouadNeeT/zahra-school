package panels;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * IHMBarreChargementFenetreProfesseur.java
 *
 * Created on 6 avr. 2012, 16:16:05
 */



/**
 *
 * @author Evi and Max
 */
public class IHMBarreVisionMenuPrincipal extends javax.swing.JPanel {

    /** Creates new form IHMBarreChargementFenetreProfesseur */
    public IHMBarreVisionMenuPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu principal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(431, 431, 431)
                .addComponent(jLabel1)
                .addContainerGap(447, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>


    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    // End of variables declaration

}
