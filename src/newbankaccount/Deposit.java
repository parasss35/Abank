package newbankaccount;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
public class Deposit extends javax.swing.JFrame {
    public Deposit() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAmountInfo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblAccountNumber = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnDeposit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAmountInfo.setFont(new java.awt.Font("Modern No. 20", 3, 24)); // NOI18N
        lblAmountInfo.setForeground(new java.awt.Color(51, 204, 0));
        lblAmountInfo.setText("DEPOSIT");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(612, 214));

        lblAccountNumber.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblAccountNumber.setText("ACCOUNT NUMBER");

        txtAccountNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccountNumber.setForeground(new java.awt.Color(153, 153, 153));
        txtAccountNumber.setText("Enter Account No.");
        txtAccountNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAccountNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAccountNumberMouseClicked(evt);
            }
        });

        lblAmount.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblAmount.setText("AMOUNT");

        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(153, 153, 153));
        txtAmount.setText("Enter Amount");
        txtAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAmountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtAccountNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAccountNumber)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAmount)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        btnDeposit.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnDeposit.setForeground(new java.awt.Color(0, 0, 153));
        btnDeposit.setText("DEPOSIT");
        btnDeposit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 153));
        btnCancel.setText("CANCEL");
        btnCancel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));

        btnBack.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 153));
        btnBack.setText("BACK");
        btnBack.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAmountInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblAmountInfo)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
            this.setVisible(false);
            new MainPage().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
       Connection conn=null;
       PreparedStatement s=null;
       PreparedStatement s1=null;
       try
       {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","imaengineer");
            String SQL="update balanceinfo set balance=balance+? where accountno=?";
            s=conn.prepareStatement(SQL);
            s.setInt(1,Integer.parseInt(txtAmount.getText()));
            s.setString(2,txtAccountNumber.getText());
            int n=s.executeUpdate();
            if(n>0)
            {
              try
              {
                  Class.forName("oracle.jdbc.driver.OracleDriver");
                  conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","imaengineer");
                  String SQL1="select accountno,balance from balanceinfo where accountno=?";
                  s1=conn.prepareStatement(SQL1);
                  s1.setString(1,txtAccountNumber.getText());
                  ResultSet rs=s1.executeQuery();
                  if(rs.next())
                  {
                      Deposit1 d=new Deposit1("DEPOSIT SUCCESSFUL!!!!",rs.getString(1),rs.getString(2));
                      this.setVisible(false);
                      d.setVisible(true);
                  }
              }
              catch(SQLException e )
              {
                  System.out.println(e);
              }
            }
           conn.close();
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
       catch(ClassNotFoundException e)
       {
           System.out.println(e);
       }
    }//GEN-LAST:event_btnDepositActionPerformed

    private void txtAccountNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAccountNumberMouseClicked
            txtAccountNumber.setForeground(Color.black);
            txtAccountNumber.setText("");
    }//GEN-LAST:event_txtAccountNumberMouseClicked

    private void txtAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAmountMouseClicked
            txtAmount.setForeground(Color.black);
            txtAmount.setText("");
    }//GEN-LAST:event_txtAmountMouseClicked
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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblAmountInfo;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
