package com.company;

import java.util.*;
import java.sql.*;
class SignUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String fullName = sc.nextLine();

        System.out.print("Enter Username: ");
        String uname = sc.nextLine();

        System.out.print("Enter Email-id: ");
        String email = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        System.out.print("Enter Address: ");
        String addr = sc.nextLine();

        System.out.print("Enter Contact No.: ");
        String num = sc.nextLine();

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","manager");
            Statement stmt = con.createStatement();
            String q1 = "insert into Users values('" + fullName + "','" + uname + "','" + email + "','" + pass + "','" + addr + "','" + num + "')";
            int x = stmt.executeUpdate(q1);
            if(x > 0) {
                System.out.println("Registered Successfully");
            }
            else {
                System.out.println("Unsuccessful, Please try again");
            }
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
