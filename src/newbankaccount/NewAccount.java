package newbankaccount;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
public class NewAccount extends javax.swing.JFrame 
{
    public NewAccount() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaAddress = new javax.swing.JTextArea();
        lblEmail = new javax.swing.JLabel();
        lblPhoneNo = new javax.swing.JLabel();
        lblAccountNumber = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        txtAccountNumber = new javax.swing.JTextField();
        lblBalance = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        lblFirstName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblFirstName.setText("FIRST NAME");

        lblLastName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblLastName.setText("LAST NAME");

        lblAddress.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblAddress.setText("ADDRESS");

        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFirstName.setForeground(new java.awt.Color(153, 153, 153));
        txtFirstName.setText("Enter First Name");
        txtFirstName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFirstNameMouseClicked(evt);
            }
        });

        txtaAddress.setColumns(20);
        txtaAddress.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtaAddress.setForeground(new java.awt.Color(153, 153, 153));
        txtaAddress.setRows(5);
        txtaAddress.setText("Enter Address");
        txtaAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtaAddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtaAddressMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtaAddress);

        lblEmail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblEmail.setText("EMAIL");

        lblPhoneNo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblPhoneNo.setText("PHONE NO.");

        lblAccountNumber.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblAccountNumber.setText("ACCOUNT NUMBER");

        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(153, 153, 153));
        txtLastName.setText("Enter Last name");
        txtLastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtLastName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLastNameMouseClicked(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("Enter Email ID");
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailMouseClicked(evt);
            }
        });

        txtPhoneNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPhoneNo.setForeground(new java.awt.Color(153, 153, 153));
        txtPhoneNo.setText("Enter Phone No.");
        txtPhoneNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPhoneNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPhoneNoMouseClicked(evt);
            }
        });
        txtPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNoActionPerformed(evt);
            }
        });

        txtAccountNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAccountNumber.setForeground(new java.awt.Color(153, 153, 153));
        txtAccountNumber.setText("Enter Account No.");
        txtAccountNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAccountNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAccountNumberMouseClicked(evt);
            }
        });

        lblBalance.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBalance.setText("BALANCE");

        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBalance.setForeground(new java.awt.Color(153, 153, 153));
        txtBalance.setText("Enter Amount Deposited(min 2000)");
        txtBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBalance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBalanceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFirstName)
                    .addComponent(lblLastName)
                    .addComponent(lblAddress)
                    .addComponent(lblPhoneNo)
                    .addComponent(lblAccountNumber)
                    .addComponent(lblEmail)
                    .addComponent(lblBalance))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirstName)
                    .addComponent(txtLastName)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBalance, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccountNumber)
                            .addComponent(txtPhoneNo)
                            .addComponent(txtEmail)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoneNo)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAccountNumber)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBalance)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setText("NEW ACCOUNT");

        btnSubmit.setBackground(new java.awt.Color(204, 204, 255));
        btnSubmit.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 0, 153));
        btnSubmit.setText("SUBMIT");
        btnSubmit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 204)));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(204, 204, 255));
        btnReset.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 0, 153));
        btnReset.setText("RESET");
        btnReset.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 153)));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 153));
        btnBack.setText("BACK");
        btnBack.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 153)));
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
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnReset)
                    .addComponent(btnBack))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
            txtFirstName.setText("");
            txtLastName.setText("");
            txtaAddress.setText("");
            txtPhoneNo.setText("");
            txtEmail.setText("");
            txtAccountNumber.setText("");
            txtBalance.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
    Connection conn=null;
    PreparedStatement s=null;
    PreparedStatement s1=null;
    try
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","imaengineer");
        String SQL="insert into accountinfo values(?,?,?,?,?,?)";
        String a=txtFirstName.getText();
        String a1=txtLastName.getText();
        String a2=txtaAddress.getText();
        String a3=txtEmail.getText();
        String a4=txtPhoneNo.getText();
        String a5=txtAccountNumber.getText();
        if(a.isEmpty()||a1.isEmpty()||a2.isEmpty()||a3.isEmpty()||a4.isEmpty()||a5.isEmpty())
        {
         JOptionPane.showMessageDialog(null,"Mandatory fields can't be empty");
         txtFirstName.setText("");
         txtLastName.setText("");
         txtaAddress.setText("");
         txtEmail.setText("");
         txtPhoneNo.setText("");
         txtAccountNumber.setText("");
         txtBalance.setText("");
        }
        else
        {
        s=conn.prepareStatement(SQL);
        s.setString(1, a);
        s.setString(2, a1);
        s.setString(3, a2);
        s.setString(4, a3);
        s.setString(5, a4);
        s.setString(6, a5);
        int n=s.executeUpdate();
        String SQL1="insert into balanceinfo values(?,?)";
        s1=conn.prepareStatement(SQL1);
        s1.setString(1, txtAccountNumber.getText());
        s1.setString(2, txtBalance.getText());
        int n1=s1.executeUpdate();
        if(n>0 && n1>0)
        {
        JOptionPane.showMessageDialog(null,"Account Successfully Created!!!!");
        new MainPage().setVisible(true);
        this.setVisible(false);
        }
        }
    }
    catch(SQLException | ClassNotFoundException e)
    {
        System.out.println(e);
    }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtFirstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFirstNameMouseClicked
        txtFirstName.setForeground(Color.black);
        txtFirstName.setText("");
    }//GEN-LAST:event_txtFirstNameMouseClicked

    private void txtLastNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLastNameMouseClicked
         txtLastName.setForeground(Color.black);
         txtLastName.setText("");   
    }//GEN-LAST:event_txtLastNameMouseClicked

    private void txtaAddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaAddressMouseClicked
         txtaAddress.setForeground(Color.black);
         txtaAddress.setText("");   
    }//GEN-LAST:event_txtaAddressMouseClicked

    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
        txtEmail.setForeground(Color.black);
         txtEmail.setText("");
    }//GEN-LAST:event_txtEmailMouseClicked

    private void txtPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNoActionPerformed

    private void txtPhoneNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPhoneNoMouseClicked
        txtPhoneNo.setForeground(Color.black);
         txtPhoneNo.setText("");
    }//GEN-LAST:event_txtPhoneNoMouseClicked

    private void txtAccountNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAccountNumberMouseClicked
        txtAccountNumber.setForeground(Color.black);
         txtAccountNumber.setText("");
    }//GEN-LAST:event_txtAccountNumberMouseClicked

    private void txtBalanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBalanceMouseClicked
         txtBalance.setForeground(Color.black);
         txtBalance.setText("");
    }//GEN-LAST:event_txtBalanceMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
            new MainPage().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed
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
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    public javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JTextField txtAccountNumber;
    public javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextArea txtaAddress;
    // End of variables declaration//GEN-END:variables
}
