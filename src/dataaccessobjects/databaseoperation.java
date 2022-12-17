/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccessobjects;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author TOMMOGO
 */

public class databaseoperation {
    public static void setDataorDelete(String Query,String msg){
        try{
        Connection con= Connectioprovider.getCon();
        Statement st=con.createStatement();
        st.executeUpdate(Query);
        if (!msg.equals(""))
            JOptionPane.showMessageDialog(null, msg); 
        }
        catch(Exception e){
            //JOptionPane.showConfirmDialog(null, e, "message", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static ResultSet getData(String query) {
        try{
            Connection con=Connectioprovider.getCon();
            Statement st=con.createStatement();
            //JOptionPane.showMessageDialog(null,query, query, 0);
            ResultSet rs= st.executeQuery(query);
            return rs;
        }catch(Exception e){
           JOptionPane.showConfirmDialog(null, e, "message", JOptionPane.ERROR_MESSAGE);
           //JOptionPane.showMessageDialog(null,"", query, 0);
           //System.out.println(e);
           return null;
        }
            
//To change body of generated methods, choose Tools | Templates.
    
}}