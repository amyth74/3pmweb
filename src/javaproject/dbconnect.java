/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author achar
 */
public class dbconnect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");//load driver
        } catch (Exception e) {
        }
        Connection con=null;
        Statement st=null;
        try {
            //getting the connection of database
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicedb","root","acharya74");
        } catch (Exception e) {
        }
        String sql="insert into course (c_id,title,price,duration) values(104,'oracle','140000','3months')";
        try {
            //executing the sql sstatement
            st=con.createStatement();
            st.execute(sql);
            System.out.println("query executed");
        } catch (Exception e) {
        }
        
    }
    
}
