package newbankaccount;
import java.awt.Color;
import java.sql.*;
public class Display extends javax.swing.JFrame {
    public Display() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        btnBalanceInfo = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAccountInfo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblAccountNumber = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBalanceInfo.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        btnBalanceInfo.setForeground(new java.awt.Color(0, 51, 204));
        btnBalanceInfo.setText("BALANCE DETAILS");
        btnBalanceInfo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        btnBalanceInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceInfoActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 51, 204));
        btnBack.setText("BACK");
        btnBack.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAccountInfo.setFont(new java.awt.Font("Viner Hand ITC", 1, 14)); // NOI18N
        btnAccountInfo.setForeground(new java.awt.Color(0, 0, 204));
        btnAccountInfo.setText("DETAILS");
        btnAccountInfo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        btnAccountInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountInfoActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAccountNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccountNumber))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAccountInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(btnBalanceInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccountInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBalanceInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
            this.setVisible(false);
            new MainPage().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAccountInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountInfoActionPerformed
      Connection conn=null;
      PreparedStatement s=null;
        try
              {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","imaengineer");
                String SQL1="select * from accountinfo where accountnumber=?";
                s=conn.prepareStatement(SQL1);
                s.setString(1,txtAccountNumber.getText());
                ResultSet rs=s.executeQuery();
                if(rs.next())
                {
                    Display2 d=new Display2(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                    this.setVisible(false);
                    d.setVisible(true);
                }
              } 
      catch(SQLException e)
      {
          System.out.println(e);
      }
      catch(ClassNotFoundException e)
      {
          System.out.println(e);
      }
    }//GEN-LAST:event_btnAccountInfoActionPerformed

    private void txtAccountNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAccountNumberMouseClicked
            txtAccountNumber.setForeground(Color.black);
            txtAccountNumber.setText("");
    }//GEN-LAST:event_txtAccountNumberMouseClicked

    private void btnBalanceInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceInfoActionPerformed
        Connection conn=null;
        PreparedStatement s=null;
        try
              {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","imaengineer");
                String SQL1="select * from balanceinfo where accountno=?";
                s=conn.prepareStatement(SQL1);
                s.setString(1,txtAccountNumber.getText());
                ResultSet rs=s.executeQuery();
                if(rs.next())
                {
                    Deposit1 d=new Deposit1(rs.getString(1),rs.getString(2));
                    this.setVisible(false);
                    d.setVisible(true);
                }
              } 
      catch(SQLException e)
      {
          System.out.println(e);
      }
      catch(ClassNotFoundException e)
      {
          System.out.println(e);
      } 
    }//GEN-LAST:event_btnBalanceInfoActionPerformed

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
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccountInfo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBalanceInfo;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JTextField txtAccountNumber;
    // End of variables declaration//GEN-END:variables
}
