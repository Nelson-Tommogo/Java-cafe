/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import dataaccessobjects.Userdao;

/**
 *
 * @author TOMMOGO
 */
public class ChangePassword extends javax.swing.JFrame {

    public String UserEmail;

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
    }

    public ChangePassword(String Email) {
        initComponents();
        UserEmail = Email;
        btnupdate.setEnabled(false);
    }

    public void validatefields() {
        String OldPassword = txtold.getText();
        String NewPassword = txtnew.getText();
        String ConfirmPassword = txtconfirmpass.getText();
        if (!OldPassword.equals("") && !NewPassword.equals("") && !ConfirmPassword.equals("") && NewPassword.equals(ConfirmPassword)) {
            btnupdate.setEnabled(true);
        } else {
            btnupdate.setEnabled(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        closebtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        txtold = new javax.swing.JPasswordField();
        txtnew = new javax.swing.JPasswordField();
        txtconfirmpass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        checkboxpass = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/small-page-background.png"))); // NOI18N

        jLabel7.setForeground(new java.awt.Color(237, 234, 234));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/small-page-background.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 6, 233));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/change Password.png"))); // NOI18N
        jLabel1.setText("Change Password ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, -1, -1));

        closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/close.png"))); // NOI18N
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 6, 233));
        jLabel2.setText("Old Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, 30));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 6, 233));
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, 30));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 6, 233));
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, 30));

        btnupdate.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(51, 6, 233));
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/save.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        clearbtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(51, 6, 233));
        clearbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/clear.png"))); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        txtold.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtoldKeyReleased(evt);
            }
        });
        getContentPane().add(txtold, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 250, 30));

        txtnew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnewKeyReleased(evt);
            }
        });
        getContentPane().add(txtnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 250, -1));

        txtconfirmpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtconfirmpassKeyReleased(evt);
            }
        });
        getContentPane().add(txtconfirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 250, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));
        getContentPane().add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 250, -1));

        checkboxpass.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        checkboxpass.setForeground(new java.awt.Color(0, 0, 153));
        checkboxpass.setText("Show Passwords");
        checkboxpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxpassActionPerformed(evt);
            }
        });
        getContentPane().add(checkboxpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/small-page-background.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        //new ChangePassword().setVisible(true);
        //new loginPage().setVisible(true);
    }//GEN-LAST:event_closebtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ChangePassword(UserEmail).setVisible(true);
//        txtold.setText("");
//        txtconfirmpass.setText("");
//        txtnew.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void txtoldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtoldKeyReleased
        // TODO add your handling code here:
        validatefields();
    }//GEN-LAST:event_txtoldKeyReleased

    private void txtnewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewKeyReleased
        // TODO add your handling code here:
        validatefields();
    }//GEN-LAST:event_txtnewKeyReleased

    private void txtconfirmpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconfirmpassKeyReleased
        // TODO add your handling code here:
        validatefields();
    }//GEN-LAST:event_txtconfirmpassKeyReleased

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        String Email = txtmail.getText();
        String OldPassword = txtold.getText();
        String NewPassword = txtnew.getText();
        Userdao.ChangePassword(Email, OldPassword, NewPassword);
        setVisible(false);
        new ChangePassword(UserEmail).setVisible(true);
    }//GEN-LAST:event_btnupdateActionPerformed

    private void checkboxpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxpassActionPerformed
        // TODO add your handling code here:
        if (checkboxpass.isSelected()) {
            txtnew.setEchoChar((char) 0);
            txtconfirmpass.setEchoChar((char) 0);
            txtold.setEchoChar((char) 0);

        } else {
            txtnew.setEchoChar(('*'));
            txtconfirmpass.setEchoChar(('*'));
            txtold.setEchoChar(('*'));
        }
    }//GEN-LAST:event_checkboxpassActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnupdate;
    private javax.swing.JCheckBox checkboxpass;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton closebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField txtconfirmpass;
    private javax.swing.JTextField txtmail;
    private javax.swing.JPasswordField txtnew;
    private javax.swing.JPasswordField txtold;
    // End of variables declaration//GEN-END:variables
}