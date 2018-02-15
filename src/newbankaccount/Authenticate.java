package newbankaccount;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
public class Authenticate extends javax.swing.JFrame {
    public Authenticate() {
        initComponents();
        /*java.util.Date now = new java.util.Date();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        String date = df1.format(now);
        lblDate.setText(date);*/
        java.util.Date now1 = new java.util.Date();
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String date1 = df2.format(now1);
        lblDate.setText(date1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\download.png")); // NOI18N
        jLabel1.setText("jLabel1");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("to access your accounts..");

        jLabel6.setFont(new java.awt.Font("Engravers MT", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Login To ABANK");

        lblUserName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblUserName.setText("USERNAME : *");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("PASSWORD: *");

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(153, 153, 153));
        txtUserName.setText("Enter UserName");
        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserNameMouseClicked(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setText("Enter Password");
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("( * : mandatory fields )");

        jCheckBox1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox1)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(btnReset))
                                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnSubmit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUserName)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnReset))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("WELCOME TO");

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Personal Banking");

        lblDate.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 153, 0));

        lblTime.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(41, 41, 41))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(lblDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String name2;
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
    Connection conn=null;
    PreparedStatement st=null;
    
    try
    {
     Class.forName("oracle.jdbc.driver.OracleDriver");
     conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","imaengineer");
     String SQL="select * from login where userid=? and username=?";
     st=conn.prepareStatement(SQL);
     String name1=txtUserName.getText();
     name2=txtPassword.getText();
     st.setString(1, name1);
     st.setString(2, name2);
     ResultSet rs=st.executeQuery();
     if(rs.next())
     {
         this.setVisible(false);
         new MainPage().setVisible(true);
     }
     else
     {
         JOptionPane.showMessageDialog(null, "Kindly enter correct userid and username");
         txtUserName.setText("");
         txtPassword.setText("");
     }
     conn.close();
}
catch(ClassNotFoundException e)
{
    System.out.println(e.toString());
}
catch(SQLException e)
{
    System.out.println(e.toString());
}

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtUserName.setText("");
         txtPassword.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
           txtPassword.setEchoChar((char)0);   //to make password visible
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseClicked
        txtUserName.setForeground(Color.black);   
        txtUserName.setText("");
    }//GEN-LAST:event_txtUserNameMouseClicked

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        txtPassword.setForeground(Color.black);    
        txtPassword.setText("");    
    }//GEN-LAST:event_txtPasswordMouseClicked
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
            java.util.logging.Logger.getLogger(Authenticate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authenticate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authenticate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authenticate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authenticate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
