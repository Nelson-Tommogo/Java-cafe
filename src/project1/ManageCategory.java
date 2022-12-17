/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import javax.swing.JOptionPane;
import model.Category;
import dataaccessobjects.CategoryDao;
import dataaccessobjects.databaseoperation;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author TOMMOGO
 */
public class ManageCategory extends javax.swing.JFrame {

    /**
     * Creates new form ManageCategory
     */
    public ManageCategory() {
        initComponents();
        btnsave.setEnabled(false);
    }

    public void validatefields() {
        String Category = txtName.getText();
        if (!Category.equals("")) {
            btnsave.setEnabled(true);
        } else {
            btnsave.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exitbtn = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/small-page-background.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/category.png"))); // NOI18N
        jLabel1.setText("Manage Category ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 31, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("View Category ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Add New Category ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/close.png"))); // NOI18N
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, -1, -1));

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(102, 0, 0));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/save.png"))); // NOI18N
        btnsave.setText("Save ");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(102, 0, 0));
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/clear.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 196, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 293, 169));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("*Click on Row to Delete Category");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/search.png"))); // NOI18N
        jButton1.setText("Search ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 170, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/small-page-background.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new HomePage().setVisible(true);
//        int y = JOptionPane.showConfirmDialog(null, "Confirm you want to exit!!?", "Thank you", JOptionPane.YES_NO_OPTION);
//        if (y == 0) {
//            System.exit(0);
//
//        }
    }//GEN-LAST:event_exitbtnActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        validatefields();
    }//GEN-LAST:event_txtNameKeyReleased

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        Category category = new Category();
        category.setName(txtName.getText());
        CategoryDao.save(category);
        setVisible(false);
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnsaveActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        ArrayList<Category> List = CategoryDao.getAllRecords();
        Iterator<Category> itr = List.iterator();
        while (itr.hasNext()) {
            Category categoryobj = itr.next();
            dtm.addRow(new Object[]{categoryobj.getID(), categoryobj.getName()});
        }
//ResultSet rs=databaseoperation.getData("select *from product");
//        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
//        model.setRowCount(0);
//        try{
//            while (rs.next()){
//                model.addRow(new Object[]{rs.getString(1),rs.getString(2),});
//                //rs.close();
//            }
//            rs.close();
//        }
//        catch(SQLException e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//        
    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int Index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String ID = model.getValueAt(Index, 0).toString();
        String Name = model.getValueAt(Index, 1).toString();
        int y = JOptionPane.showConfirmDialog(null, "Confirm you want to Delete!!?" + Name + "Category", "Selected", JOptionPane.YES_NO_OPTION);
        if (y == 0) {
            CategoryDao.Delete(ID);
            setVisible(false);
            new ManageCategory().setVisible(true);

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnclearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String NameorID = txtsearch.getText();
        ResultSet rs = databaseoperation.getData("select *from category where Name like '%" + NameorID + "%' or ID like '%" + NameorID+ "%'");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try {
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2),});

            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton exitbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
