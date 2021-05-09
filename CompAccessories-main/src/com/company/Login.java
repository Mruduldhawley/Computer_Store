package com.company;

import java.util.*;
import java.sql.*;
class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String uname = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
            Statement stmt = con.createStatement();

            String q1 = "Select * from Users where username = '" + uname + "' and password = '" + password + "'";
            ResultSet rs = stmt.executeQuery(q1);
            if(rs.next()) {
                System.out.println("Welcome " + rs.getString(1));
            }
            else {
                System.out.println("Wrong password or username");
            }
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
