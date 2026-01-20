//Md Aftab Raza Ansari 12005279 jfs 3
//code 16
//DataBase Connectivity | My SQL Workbench Installation
//connection establistment and insertion 




              //////SQL code////
create database books;         
use booksdb;

create table books (
    book_id int primary key,
    title varchar(255),
    author varchar(255),
    piece int
);
 
select * from books;




                ///////Java code//////
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;                
public class Test0{
    public static void main(String[] args){
        //lab1 establishing connection with mysql server
        try{
            //step1: load the driver
            Class.forName("com.mysql.c.jdbc.Driver");
            //step2: create the connection object
            String connectionURL="jdbc:mysql://localhost/booksdb";
            
            Connection conn = DriverManager.getConnection(connectionURL,"root","<passwordhere>");


            //step3: prepare the insert Statement
            int bid = 102;
            String bookTitle ="Sql Essentials";
            String author = "Jerry Rig";
            int price = 295;
            
            String insertQuery="insert into bools values(%d,'%s','%s',%d)",bid,bookTitle,author,price);
            
            //step4: Create the statement interface object
            Statement stmt = conn.createStatement();
            stmt.execute(insertQuery);
            stmt.close();
            conn.close();
            //System.out.println("Connected to Server Successfully!!!");
        }
        catch(Exception e){
            e.printStackTrace();
            
            
        }
    }
    
}
              
