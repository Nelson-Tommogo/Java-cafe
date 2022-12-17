/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccessobjects;

import java.sql.*;
/**
 *
 * @author TOMMOGO
 */
public class Connectioprovider {
    public static Connection getCon(){
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","genius");
    return con;
}catch(Exception e){
    return null;
}
      
     //* @param args the command line arguments
     //*/
    }}