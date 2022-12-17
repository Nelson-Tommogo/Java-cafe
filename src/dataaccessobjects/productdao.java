/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccessobjects;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.product;
import java.sql.*;
/**
 *
 * @author TOMMOGO
 */
public class productdao {
    public static void save(product Product){
        String query="insert into Product(Name,Category,Price)values('"+Product.getName()+"','"+Product.getCategory()+"','"+Product.getPrice()+"')";
        databaseoperation.setDataorDelete(query, "Product Added Successfully");
    }
    public static ArrayList<product> getAllRecords(){
        ArrayList<product> arrayList=new ArrayList<>();
        try{
            ResultSet rs=databaseoperation.getData("select *from Product");
            while(rs.next()){
                product Product=new product();
                Product.setID(rs.getInt("ID"));
                Product.setName(rs.getString("Name"));
                //Product.setCategory(rs.getString("Category"));
                Product.setCategory(rs.getString("Category"));
                Product.setPrice(rs.getString("Price"));
                arrayList.add(Product);
            }
        }catch(Exception e){
            //JOptionPane.showInputDialog(null, e);
           System.out.println(e);
        }
        return arrayList;
    }
    public static void update(product Product){
        String Query="update Product set Name='"+Product.getName()+"',Category='"+Product.getCategory()+"',Price='"+Product.getPrice()+"'where ID='"+Product.getID()+"'";
        databaseoperation.setDataorDelete(Query, "Product Updated Successfully");
    }
    public static void Delete(String ID){
        String Query="delete from Product where ID='"+ID+"'";
        databaseoperation.setDataorDelete(Query, "Product Deleted Successfully");
    }
    public static ArrayList<product> getAllRecordsByCategory(String Category){
        ArrayList<product> arrayList=new ArrayList<>();
        try{
            ResultSet rs=databaseoperation.getData("select *from Product where Category='"+Category+"'");
            while(rs.next()){
                product Product=new product();
                Product.setName(rs.getString("Name"));
                arrayList.add(Product);
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return arrayList;
    }
    public static ArrayList<product> FilterProductByName(String Name,String Category){
        ArrayList<product> arrayList=new ArrayList<>();
        try{
            ResultSet rs=databaseoperation.getData("select *from Product where Name='%"+Name+"%',and Category ='"+Category+"'");
            while(rs.next()){
                product Product=new product();
                Product.setName(rs.getString("Name"));
                arrayList.add(Product);
            }
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
        return arrayList;
    }
    public static product getProductByName(String Name){
        product  Product=new product();
        try{
            ResultSet rs=databaseoperation.getData("select *from Product where Name='"+Name+"'");
            while(rs.next()){
                Product.setName(rs.getString(2));
                Product.setCategory(rs.getString(3));
                Product.setPrice(rs.getString(4));
            }
        }
    catch(Exception e){
        JOptionPane.showConfirmDialog(null, e);
    }
        return Product;
}
}