/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import javax.swing.JOptionPane;

/**
 *
 * @author TOMMOGO 
 */
public class HomePage extends javax.swing.JFrame {

    public String Email;

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    public HomePage(String UserEmail) {
        initComponents();
        Email = UserEmail;
        if (!Email.equals("tommogobsd@gmail.com")) {
            btnCategory.setVisible(false);
            btnNewp.setVisible(false);
            btnvedp.setVisible(false);
            btnverify.setVisible(false);
            //jButton9.setVisible(false);
            
        }
        //else
            //jButton9.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnNewp = new javax.swing.JButton();
        btnvedp = new javax.swing.JButton();
        btnverify = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(153, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/logout.png"))); // NOI18N
        jButton7.setText("Log Out");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        jButton8.setBackground(new java.awt.Color(153, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/add to cart.png"))); // NOI18N
        jButton8.setText("Place Order");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 140, 50));

        jButton9.setBackground(new java.awt.Color(153, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/generate bill & print.png"))); // NOI18N
        jButton9.setText("View Bills &Orders Placed Details");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, 50));

        exitbtn.setBackground(new java.awt.Color(153, 0, 0));
        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/exit.png"))); // NOI18N
        exitbtn.setText("Exit ");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, -1, 50));

        jButton11.setBackground(new java.awt.Color(153, 0, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/change Security Question.png"))); // NOI18N
        jButton11.setText("Change Security Question");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, -1, 50));

        jButton12.setBackground(new java.awt.Color(153, 0, 0));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/change Password.png"))); // NOI18N
        jButton12.setText("Change Password ");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, 50));

        btnCategory.setBackground(new java.awt.Color(102, 0, 0));
        btnCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/category.png"))); // NOI18N
        btnCategory.setText("Manage Category");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, -1, -1));

        btnNewp.setBackground(new java.awt.Color(102, 0, 0));
        btnNewp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/new product.png"))); // NOI18N
        btnNewp.setText("New Product");
        btnNewp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewpActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, -1, -1));

        btnvedp.setBackground(new java.awt.Color(102, 0, 0));
        btnvedp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnvedp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/view edit delete product.png"))); // NOI18N
        btnvedp.setText("View,Edit&Delete Product");
        btnvedp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvedpActionPerformed(evt);
            }
        });
        getContentPane().add(btnvedp, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, -1, -1));

        btnverify.setBackground(new java.awt.Color(102, 0, 0));
        btnverify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnverify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/verify users.png"))); // NOI18N
        btnverify.setText("Verify");
        btnverify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverifyActionPerformed(evt);
            }
        });
        getContentPane().add(btnverify, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 610, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/order5.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        int y = JOptionPane.showConfirmDialog(null, "Confirm you want to exit!!?", "Thank you", JOptionPane.YES_NO_OPTION);
        if (y == 0) {
            System.exit(0);        // TODO add your handling code here:
        }
    }//GEN-LAST:event_exitbtnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //setVisible(false);
        int y = JOptionPane.showConfirmDialog(null, "Confirm you want to Log Out!!?", "Thank you", JOptionPane.YES_NO_OPTION);
        if (y == 0) {
            setVisible(false);
            new loginPage().setVisible(true);        // TODO add your handling code here:
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
//        int y = JOptionPane.showConfirmDialog(null, "Change or Forget Password!!??", "Thank you", JOptionPane.YES_NO_OPTION);
//        if (y == 0) {
new ChangePassword().setVisible(true);
//        }
        
        //new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        // TODO add your handling code here:
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnNewpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewpActionPerformed
        // TODO add your handling code here:
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_btnNewpActionPerformed

    private void btnvedpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvedpActionPerformed
        // TODO add your handling code here:
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnvedpActionPerformed

    private void btnverifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverifyActionPerformed
        // TODO add your handling code here:
        new VerifyUser().setVisible(true);
    }//GEN-LAST:event_btnverifyActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new PlaceOrder(Email).setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        new ViewBills().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        new ChangesecurityQuestion().setVisible(true);
       
       
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(() -> {
            new HomePage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnNewp;
    private javax.swing.JButton btnvedp;
    private javax.swing.JButton btnverify;
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}