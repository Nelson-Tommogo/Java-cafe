/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccessobjects;

import javax.swing.JOptionPane;

/**
 *
 * @author TOMMOGO
 */
public class tableclass {

    public static void main(String[] args) {
        try {
            String UserTable = "create table Users(Name char(100) PRIMARY KEY,Email char(100),Phone varchar(100),Address char(100),Password varchar(100),SecurityQuestion varchar(100),Answer varchar(100),Status varchar(100),UNIQUE(Email))";
            databaseoperation.setDataorDelete(UserTable, "User Table Created Successfully");
            String User1 = "insert into Users(Name,Email,Phone,Address,Password,SecurityQuestion,Answer,Status)values('Tommogo Nelson','nelsontommogo@gmail.com','0769606910','Nyeri','itsme','Whats your favuorite car?','Mercedes','true')";
            databaseoperation.setDataorDelete(User1, "Admin Details Added Successfully");
            String CategoryTable = "create table Category(ID int AUTO_INCREMENT primary key,Name char(50))";
            databaseoperation.setDataorDelete(CategoryTable, "Category Table Created Successfully");
            String ProductTable = "create table Product(ID int AUTO_INCREMENT primary key,Name varchar(50),Category varchar(50),Price varchar(50))";
            databaseoperation.setDataorDelete(ProductTable, "Product Table Created Successfully");
            String Product = "insert into Product(Name,Category,Price)values('Sugar','Sony','280')";
            databaseoperation.setDataorDelete(Product, "Product Added Successfully");
            String Bill = "insert into Bill(ID,Name,Phone,Email,Date,Total,CreatedBy)values('1','Nelson Tommogo','0759735505','nelsontommogo9@gmail.com','Today','1200','Common Genius')";
            databaseoperation.setDataorDelete(Bill, "Bill Added Successfully");
            
            String BillTable = "create table Bill(ID int primary key,Name char(50),Phone Varchar(50),Email varchar(50),Date varchar(50),Total varchar(200),CreatedBy varchar(50))";
            databaseoperation.setDataorDelete(BillTable, "Bill Table Created Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        /**/    }
}
