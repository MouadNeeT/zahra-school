package panels;

//test
public class IHMFaireLapelle1 extends javax.swing.JPanel {

                  
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JList jList1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;

    
    public IHMFaireLapelle1() {
        initComponents();
    }

  
                    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Faire L'appel");

        jButton1.setText("Suivant");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Type d'appel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 0, 51))); // NOI18N

        jLabel2.setText("Choisisser le type d'appel :");
        jLabel2.setBounds(20, 60, 128, 14);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabel2.getAccessibleContext().setAccessibleName("text1");

        jRadioButton1.setText("D�filement de la liste sous form d'une liste");
        jRadioButton1.setActionCommand("Liste");
        jRadioButton1.setBounds(190, 50, 225, 23);
        jLayeredPane1.add(jRadioButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jRadioButton1.getAccessibleContext().setAccessibleName("Liste");

        jRadioButton2.setText("D�filement de la liste sous forme d'un gros plan");
        jRadioButton2.setActionCommand("Plan");
        jRadioButton2.setBounds(190, 80, 251, 23);
        jLayeredPane1.add(jRadioButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jRadioButton2.getAccessibleContext().setAccessibleName("Plan");

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choisissez le groupe", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 0, 51))); // NOI18N

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recherche rapide ?", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 0, 51))); // NOI18N
        jLayeredPane4.setBounds(0, -10, 100, 100);
        jLayeredPane3.add(jLayeredPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setText("Rentrez le nom du groupe:");
        jLabel3.setBounds(10, 40, 128, 14);
        jLayeredPane3.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField1.setText("jTextField1");
        jTextField1.setBounds(150, 40, 210, 20);
        jLayeredPane3.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBounds(30, 60, 380, 120);
        jLayeredPane2.add(jLayeredPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listes des groupes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(0, 0, 51))); // NOI18N

        jLabel4.setText("Choisissez un groupe: ");
        jLabel4.setBounds(20, 40, 130, 14);
        jLayeredPane5.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

       
        jScrollPane1.setViewportView(jList1);

        jScrollPane1.setBounds(160, 40, 180, 84);
        jLayeredPane5.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane5.setBounds(30, 200, 370, 160);
        jLayeredPane2.add(jLayeredPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))))
        );
        
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });

        jLabel1.getAccessibleContext().setAccessibleName("UpLabel");
    }// </editor-fold>                        

                     
}
