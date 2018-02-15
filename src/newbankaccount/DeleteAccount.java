package newbankaccount;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
public class DeleteAccount extends javax.swing.JFrame {
    public DeleteAccount() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAccountDeletion = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblAccountNumber = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAccountDeletion.setFont(new java.awt.Font("Modern No. 20", 3, 24)); // NOI18N
        lblAccountDeletion.setForeground(new java.awt.Color(51, 204, 0));
        lblAccountDeletion.setText("DELETION");

        btnDelete.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 153));
        btnDelete.setText("DELETE");
        btnDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 153));
        btnBack.setText("BACK");
        btnBack.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 153)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lblAccountNumber.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblAccountNumber.setText("ACCOUNT NUMBER");

        txtAccountNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccountNumber.setForeground(new java.awt.Color(153, 153, 153));
        txtAccountNumber.setText("Enter Account Number");
        txtAccountNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAccountNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAccountNumberMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblAccountNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccountNumber))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAccountDeletion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblAccountDeletion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
                this.setVisible(false);
                new MainPage().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Connection conn=null;
        PreparedStatement s=null;
        PreparedStatement s1=null;
        try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","imaengineer");
                String SQL="delete from accountinfo where accountnumber=?";
                if(txtAccountNumber.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Account Number enntered is not valid");
                    txtAccountNumber.setText("");
                }
                else
                {
                s=conn.prepareStatement(SQL);
                s.setString(1,txtAccountNumber.getText());
                int n=s.executeUpdate();
                String SQL1="delete from balanceinfo where accountno=?";
                s1=conn.prepareStatement(SQL1);
                s1.setString(1,txtAccountNumber.getText());
                int n1=s1.executeUpdate();
                if(n>0 && n1>0)
                {
                    JOptionPane.showMessageDialog(null,"Deleted Successfully");
                    new MainPage().setVisible(true);
                }
                conn.close();
                }
            }
            catch(ClassNotFoundException e)
            {
              System.out.println(e);          
            }
            catch(SQLException e)
            {
                System.out.println(e);
            }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtAccountNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAccountNumberMouseClicked
            txtAccountNumber.setForeground(Color.black);
            txtAccountNumber.setText("");
    }//GEN-LAST:event_txtAccountNumberMouseClicked
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
            java.util.logging.Logger.getLogger(DeleteAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAccountDeletion;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JTextField txtAccountNumber;
    // End of variables declaration//GEN-END:variables
}
