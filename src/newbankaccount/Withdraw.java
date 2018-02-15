package newbankaccount;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
public class Withdraw extends javax.swing.JFrame {
    public Withdraw() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblWithdrawl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblAccountNumber = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtAccountNumber = new javax.swing.JTextField();
        btnWithdraw = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWithdrawl.setFont(new java.awt.Font("Modern No. 20", 3, 24)); // NOI18N
        lblWithdrawl.setForeground(new java.awt.Color(51, 204, 0));
        lblWithdrawl.setText("WITHDRAWL");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        lblAccountNumber.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblAccountNumber.setText("ACCOUNT NUMBER");

        lblAmount.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblAmount.setText("AMOUNT");

        txtAmount.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(153, 153, 153));
        txtAmount.setText("Enter Amount");
        txtAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAmountMouseClicked(evt);
            }
        });

        txtAccountNumber.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtAccountNumber.setForeground(new java.awt.Color(153, 153, 153));
        txtAccountNumber.setText("Enter Account No.");
        txtAccountNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAccountNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAccountNumberMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAccountNumber)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAmount)
                        .addGap(90, 90, 90)))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(txtAmount))
                .addGap(212, 212, 212))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAccountNumber)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAmount)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        btnWithdraw.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnWithdraw.setForeground(new java.awt.Color(0, 0, 153));
        btnWithdraw.setText("WITHDRAW");
        btnWithdraw.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 0, 153));
        btnReset.setText("RESET");
        btnReset.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWithdrawl)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblWithdrawl)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
            this.setVisible(false);
            new MainPage().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        
        Connection conn=null;
        PreparedStatement s=null;
        PreparedStatement s1=null;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","imaengineer");
            String SQL="update balanceinfo set balance=balance-? where accountno=?";
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
                      Deposit1 d=new Deposit1("WITHDRAWAL SUCCESSFUL!!!!",rs.getString(1),rs.getString(2));
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
        catch(SQLException | ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
            txtAccountNumber.setText("");
            txtAmount.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblWithdrawl;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
