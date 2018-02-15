package newbankaccount;
public class MainPage extends javax.swing.JFrame {
    public MainPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDeposit = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNewAccount = new javax.swing.JButton();
        btnWithdraw = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnDeposit.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnDeposit.setForeground(new java.awt.Color(0, 0, 204));
        btnDeposit.setText("Deposit cash to existing account");
        btnDeposit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 255)));
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnDisplay.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnDisplay.setForeground(new java.awt.Color(0, 0, 204));
        btnDisplay.setText("Display details of existing account");
        btnDisplay.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 204));
        btnDelete.setText("Delete existing account");
        btnDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNewAccount.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnNewAccount.setForeground(new java.awt.Color(0, 0, 204));
        btnNewAccount.setText("Create new account");
        btnNewAccount.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 255)));
        btnNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAccountActionPerformed(evt);
            }
        });

        btnWithdraw.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnWithdraw.setForeground(new java.awt.Color(0, 0, 204));
        btnWithdraw.setText("Withdraw cash from existing account");
        btnWithdraw.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 255)));
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnDisplay)
                .addGap(18, 18, 18)
                .addComponent(btnDeposit)
                .addGap(18, 18, 18)
                .addComponent(btnWithdraw)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnNewAccount)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("WELCOME TO ABANK");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("How can we help you?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAccountActionPerformed
        this.setVisible(false);
        new NewAccount().setVisible(true);
    }//GEN-LAST:event_btnNewAccountActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        this.setVisible(false);
        new Withdraw().setVisible(true);
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.setVisible(false);
        new DeleteAccount().setVisible(true);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        this.setVisible(false);
        new Display().setVisible(true);
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        this.setVisible(false);
        new Deposit().setVisible(true);
    }//GEN-LAST:event_btnDepositActionPerformed
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnNewAccount;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
