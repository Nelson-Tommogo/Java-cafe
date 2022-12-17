/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccessobjects;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;
import model.Bill;

/**
 *
 * @author TOMMOGO
 */
public class BillDao {
    public static String getID(){
        int ID=1;
        try{
            ResultSet rs=databaseoperation.getData("select max(ID) from Bill");
            if(rs.next()){
                ID=rs.getInt(1);
                ID=ID+1;
            }
    }
    catch(Exception e)
    {
        JOptionPane.showConfirmDialog(null, e);
    }
        return String.valueOf(ID);
}
    public static void save(Bill bill){
        String query="insert into bill values('"+bill.getID()+"','"+bill.getName()+"','"+bill.getPhone()+"','"+bill.getEmail()+"','"+bill.getDate()+"','"+bill.getTotal()+"','"+bill.getCreatedBy()+"',)";
        databaseoperation.setDataorDelete(query, "Bill details Added Successfully");
    }
    public static ArrayList<Bill>getAllRecordsByInc(String Date){
        ArrayList<Bill> arrayList=new ArrayList<>();
        try{
            ResultSet rs=databaseoperation.getData("select *from Bill where date like'%"+Date+"%'");
            while (rs.next()){
                Bill bill=new Bill();
                bill.setID(rs.getInt("ID"));
                bill.setName(rs.getString("Name"));
                bill.setPhone(rs.getString("Phone"));
                bill.setEmail(rs.getString("Email"));
                bill.setDate(rs.getString("Date"));
                bill.setTotal(rs.getString("Total"));
                bill.setCreatedBy(rs.getString("Created BY"));
            }
//           
        }
    
catch(Exception e){
        JOptionPane.showConfirmDialog(null, e);
        
        
    }return arrayList;
    }
        public static ArrayList<Bill>getAllRecordsByDesc(String Date){
        ArrayList<Bill> arrayList=new ArrayList<>();
        try{
            ResultSet rs=databaseoperation.getData("select *from Bill where date like'%"+Date+"%' Order By ID DESC");
            while (rs.next()){
                Bill bill=new Bill();
                bill.setID(rs.getInt("ID"));
                bill.setName(rs.getString("Name"));
                bill.setPhone(rs.getString("Phone"));
                bill.setEmail(rs.getString("Email"));
                bill.setDate(rs.getString("Date"));
                bill.setTotal(rs.getString("Total"));
                bill.setCreatedBy(rs.getString("Created BY"));
            }
//           
        }
    
catch(Exception e){
        JOptionPane.showConfirmDialog(null, e);
        
        
    }return arrayList;
    }
}
