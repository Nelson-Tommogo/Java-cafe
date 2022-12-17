/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccessobjects;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;

/**
 *
 * @author TOMMOGO
 */
public class CategoryDao {
    public static void save(Category category){
        String query="insert into Category(Name)values('"+category.getName()+"')";
        databaseoperation.setDataorDelete(query, "Category Added Successfully");
    }
    public static ArrayList<Category>getAllRecords(){
        ArrayList<Category> arrayList=new ArrayList<>();
        try{
            ResultSet rs=databaseoperation.getData("select *from Category");
            while(rs.next()){
                Category category=new Category();
                category.setID(rs.getInt("ID"));
                category.setName(rs.getString("Name"));
                arrayList.add(category);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    public static void Delete(String ID){
        String query="delete from Category where id='"+ID+"'";
        databaseoperation.setDataorDelete(query, "Category Deleted Succcessfully");
    }
}