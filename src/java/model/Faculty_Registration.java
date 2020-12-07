/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author user
 */
public class Faculty_Registration {
   

        Connection con;
        HttpSession se;
    
    public Faculty_Registration(HttpSession hs) {
        try {

            Class.forName("com.mysql.jdbc.Driver"); // load the drivers
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            // connection with data base
            se=hs;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String Faculty_Registration(String fac_id,String name,String email,String branch,String phone, String pw) {
        PreparedStatement ps;
        String status = ""; 
      
                
        try {
            Statement st = null;
            ResultSet rs = null;
            st = con.createStatement();
            rs = st.executeQuery("select * from faculty where phone='" + phone + "' or email='" + email + "';");
            boolean b = rs.next();
            if (b) {
                status = "existed";
            } else {
                
                
                ps = (PreparedStatement) con.prepareStatement("insert into faculty values(?,?,?,?,?,?)");
                
                ps.setString(1, fac_id);
                ps.setString(2, name);
                 
                 ps.setString(3, email);
                  ps.setString(4, branch);
                 ps.setString(5, phone);
                 
                ps.setString(6, pw);
                int a = ps.executeUpdate();
                if (a > 0) {
                    status = "success";
                } else {
                    status = "failure";
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(status);
        return status;
    }
  

    public user getInfo() {
        Statement st = null;
        ResultSet rs = null;
         user s = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select * from faculty where fac_id= '" + se.getAttribute("id") + "'");
            boolean b = rs.next();
            if (b == true) {
                s = new user();
                s.setname(rs.getString("name"));
                
                s.setemail(rs.getString("email"));
                s.setbranch(rs.getString("branch"));
                s.setphone(rs.getString("phone"));
                s.setpw(rs.getString("pw"));
               
                
            } else {
                s = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
    
        

    public String faculty_login(String email, String pw) {
        String status1 = "", id = "";
        String name = "", emails = "";

        try {
            Statement st = null;
            ResultSet rs = null;
            st = con.createStatement();

            rs = st.executeQuery("select * from faculty where email='" + email + "' and pw='" + pw + "';");
            boolean b = rs.next();
            if (b == true) {
                id = rs.getString("fac_id");
                System.out.println(id);
                name = rs.getString("name");
                emails= rs.getString("email");
                se.setAttribute("uname", name);
                se.setAttribute("email", email);
                se.setAttribute("id", id);
                status1 = "success";
            } else {
                status1 = "failure";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("returning status " +status1);
        return status1;
        
    }






public String update(String name, String branch,String phone,String email,String pw) {
        String status = "";
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            st.executeUpdate("update student set name='" + name + "',branch='" + branch + "',phone='" + phone + "',email='" + email + "',pw='" + pw + "' where slno= '" + se.getAttribute("id") + "' ");
            se.setAttribute("uname", name);
            status = "success";
        } catch (Exception e) {
            status = "failure";
            e.printStackTrace();
        }

        return status;
    }

public String delete(int id) {
        int count = 0;
        Statement st = null;
        String status = "";
        try {
            st = con.createStatement();
            count = st.executeUpdate("delete from student where slno='" + id + "'");
            if (count > 0) {
                status = "success";
            } else {
                status = "failure";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}






