/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import javax.swing.JOptionPane;
import model.User;
import dataaccessobjects.Userdao;

/**
 *
 * @author TOMMOGO
 */
public class ForgotPassword extends javax.swing.JFrame {

    private String dbAnswer = null;
    private String Email = null;

    /**
     * Creates new form ForgotPassword
     */
    public ForgotPassword() {
        initComponents();
        btnupdate.setEnabled(true);
        btnsearch.setEnabled(false);
        txtsecq.setEditable(false);

    }

    public void clear() {
        btnupdate.setEnabled(false);
        btnsearch.setEnabled(false);
        txtmail.setEditable(true);
        txtmail.setText("");
        txtsecq.setText("");
        txtanswer.setText("");
        txtnewpass.setText("");
    }

    public void validateEmail() {
        Email = txtmail.getText();
        if (!Email.equals("")) {
            btnsearch.setEnabled(true);
        } else {
            btnsearch.setEnabled(false);
        }
    }

    public void validateFiels() {
        String Password = txtnewpass.getText();
        String Answer = txtanswer.getText();
        String SecurityQuestion = txtsecq.getText();
        if (!Password.equals("") && !Answer.equals("") && !SecurityQuestion.equals("")) {
            btnsearch.setEnabled(true);
        } else {
            btnsearch.setEnabled(false);
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

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        txtsecq = new javax.swing.JTextField();
        txtanswer = new javax.swing.JTextField();
        txtnewpass = new javax.swing.JPasswordField();
        btnupdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        btnsignup = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        checkboxpass = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/cafehome.jpg"))); // NOI18N

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/order5.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Forgot Password?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Security Question");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Answer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("New Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        txtmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 153, -1));

        txtsecq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsecqKeyReleased(evt);
            }
        });
        getContentPane().add(txtsecq, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 153, -1));

        txtanswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtanswerKeyReleased(evt);
            }
        });
        getContentPane().add(txtanswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 153, -1));

        txtnewpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnewpassKeyReleased(evt);
            }
        });
        getContentPane().add(txtnewpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 153, -1));

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/save.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 326, -1, -1));

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/clear.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 326, -1, -1));

        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/exit.png"))); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 326, -1, -1));

        btnsignup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsignup.setText("SignUp");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/login.png"))); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 395, -1, -1));

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/search.png"))); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 40, 30));

        checkboxpass.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        checkboxpass.setForeground(new java.awt.Color(255, 255, 255));
        checkboxpass.setText("Show Password");
        checkboxpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxpassActionPerformed(evt);
            }
        });
        getContentPane().add(checkboxpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/order5.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-310, -160, 880, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new signuppage().setVisible(true);
    }//GEN-LAST:event_btnsignupActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new loginPage().setVisible(true);
    }//GEN-LAST:event_btnloginActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        int y = JOptionPane.showConfirmDialog(null, "Confirm you want to exit!!?", "Thank you", JOptionPane.YES_NO_OPTION);
        if (y == 0) {
            System.exit(0);

        }
    }//GEN-LAST:event_exitbtnActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        clear();
//        txtmail.setText("");
//        txtsecq.setText("");
//        txtanswer.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmailKeyReleased
        // TODO add your handling code here:
        validateEmail();
    }//GEN-LAST:event_txtmailKeyReleased

    private void txtsecqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsecqKeyReleased
        // TODO add your handling code here:
        validateFiels();
    }//GEN-LAST:event_txtsecqKeyReleased

    private void txtanswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanswerKeyReleased
        // TODO add your handling code here:
        validateFiels();
    }//GEN-LAST:event_txtanswerKeyReleased

    private void txtnewpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewpassKeyReleased
        // TODO add your handling code here:
        validateFiels();
    }//GEN-LAST:event_txtnewpassKeyReleased

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
       //User user=null;
       //dbAnswer=user.getAnswer();
        String Answer = txtanswer.getText();
        String NewPassword = txtnewpass.getText();
        if (Answer.equals((dbAnswer))) {
            Userdao.update(Email, NewPassword);
            clear();
            setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">Incorrect Answer</b></html>", "Message", JOptionPane.ERROR_MESSAGE);
        }
        setVisible(false);
        new loginPage().setVisible(true);
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        Email = txtmail.getText();
        User user = null;
        user = Userdao.getSecurityQuestion(Email);
        if (user == null) {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">Incorrect Email Address</b></html>", "Message", JOptionPane.ERROR_MESSAGE);

        } else {
            btnsearch.setEnabled(false);
            txtmail.setEditable(false);
            dbAnswer = user.getAnswer();
            txtsecq.setText(user.getSecurityQuestion());
            validateFiels();
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkboxpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxpassActionPerformed
        // TODO add your handling code here:
        if(checkboxpass.isSelected()){
            txtnewpass.setEchoChar((char)0);
            
        }
        else{
            txtnewpass.setEchoChar(('*'));}
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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnsignup;
    private javax.swing.JButton btnupdate;
    private javax.swing.JCheckBox checkboxpass;
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtanswer;
    private javax.swing.JTextField txtmail;
    private javax.swing.JPasswordField txtnewpass;
    private javax.swing.JTextField txtsecq;
    // End of variables declaration//GEN-END:variables
}