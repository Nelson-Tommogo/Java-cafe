/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccessobjects;
import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author TOMMOGO
 */
public class Userdao {
    public static void save(User user){
//        String query="insert into Users values('"+user.getName()+"','"+user.getEmail()+"','"+user.getPhone()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurityQuestion()+"','"+user.getAnswer()+"','false')";
//        databaseoperation.setDataorDelete(query, "Regestered Successfully ....Wait for admin approval");
//        String Query="INSERT INTO Users VALUES('"+user.getName()+"','"+user.getEmail()+"','"+user.getPhone()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurityQuestion()+"','"+user.getAnswer()+"','false')";
//        databaseoperation.setDataorDelete(Query, "Registered successfully...wait for admin approval");
String Query="INSERT INTO users VALUES('"+user.getName()+"','"+user.getEmail()+"','"+user.getPhone()+"','"+user.getAddress()+"','"+user.getPassword()+"','"+user.getSecurityQuestion()+"','"+user.getAnswer()+"','false')";
            databaseoperation.setDataorDelete(Query, "Registered Succusfully wait for Admin Approval");
}
    public static User Login(String Email,String Password){
        User user=null;
        try{
            ResultSet rs=databaseoperation.getData("select *from Users where Email='"+Email+"' and Password='"+Password+"'");
            while(rs.next()){
                user=new User();
                user.setStatus(rs.getString("Status"));
            }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                return user;
                    
                    }
        return user;
    }
    public static User getSecurityQuestion(String Email){
        User user=null;
        try{
            ResultSet rs=databaseoperation.getData("select *from Users where Email='"+Email+"'");
            while(rs.next()){
                user=new User();
                user.setSecurityQuestion(rs.getString("SecurityQuestion"));
                user.setAnswer(rs.getString("Answer"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    public static void update(String Email,String NewPassword){
        String query="update Users set Password='"+NewPassword+"' where Email='"+Email+"'";
        databaseoperation.setDataorDelete(query, "Password Changed Successfully");
       
    }
    public static ArrayList<User> getAllRecords(String Email){
        ArrayList<User> arrayList=new ArrayList<>();
        try{
            ResultSet rs=databaseoperation.getData("select *from Users where Email='%"+Email+"%'");
            while(rs.next()){
                User user=new User();
                //user.setID(rs.getString("ID"));
                user.setName(rs.getString("Name"));
                user.setEmail(rs.getString("Email"));
                user.setPhone(rs.getString("Phone"));
                user.setAddress(rs.getString("Address"));
                user.setSecurityQuestion(rs.getString("Securityquestion"));
                user.setStatus(rs.getString("Status"));
                arrayList.add(user);
                databaseoperation.setDataorDelete(Email, "Details Changed Successfully");
            }
        
            
    }
    catch(Exception e){
        JOptionPane.showConfirmDialog(null, e);
    }
        return arrayList;

    }
    public static void Changestatus(String Email,String Status){
        String Query="update user set Status='"+Status+"' where email='"+Email+"'";
        databaseoperation.setDataorDelete(Query, "Status Changed Successfully");
    }
    public static void ChangePassword(String Email,String OldPassword,String NewPassword){
        try{
            ResultSet rs=databaseoperation.getData("select*from Users where Email='"+Email+"'and Password='"+OldPassword+"'");
            if(rs.next()){
                update(Email, NewPassword);
            }
                else{
                        JOptionPane.showMessageDialog(null, "Old Password is Wrong");
                        }
            
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            //Logger.getLogger(Userdao.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public static void ChangeSecurityQuestion(String Email,String Password,String SecurityQuestion,String Answer){
        try{
            ResultSet rs=databaseoperation.getData("select *from Users where Email='"+Email+"' and Password ='"+Password+"'");
            if (rs.next()){
                Update(Email, SecurityQuestion, Answer);
            }
            else{
                JOptionPane.showConfirmDialog(null, "Password is Wrong!!!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public static void Update(String Email,String SecurityQuestion,String Answer){
        String Query="update Users set SecurityQuestion ='"+SecurityQuestion+"',Answer='"+Answer+"' where Email='"+Email+"'";
        databaseoperation.setDataorDelete(Query, "Security Question Changed Successfully");
    }

}