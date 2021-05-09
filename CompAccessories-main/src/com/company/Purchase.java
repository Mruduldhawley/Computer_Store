package com.company;
import java.io.*;
import java.sql.*;
class Purchase {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","manager");
            Statement stmt = con.createStatement();

            String q1 = "Select * from Products";
            ResultSet rs = stmt.executeQuery(q1);
            System.out.println("ID\t\tName\t\tPrice\t\tQuantity");
            while(rs.next()){
                System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t\t"+rs.getString(4));
            }
            con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
