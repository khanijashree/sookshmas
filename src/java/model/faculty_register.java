/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class faculty_register {
    
 
        Connection con;
    

    HttpSession se;
    public faculty_register() {
        try {

            Class.forName("com.mysql.jdbc.Driver"); // load the drivers
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            // connection with data base

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String faculty_register(String name,String email,String branch,String phone, String pw) {
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
                
                
                ps = (PreparedStatement) con.prepareStatement("insert into student values(0,?,?,?,?,?,?,?)");
                
                ps.setString(1, name);
                 
                 ps.setString(2, email);
                  ps.setString(3, branch);
                 ps.setString(4, phone);
                 
                ps.setString(5, pw);
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
            rs = st.executeQuery("select * from faculty where slno= '" + se.getAttribute("id") + "'");
            boolean b = rs.next();
            if (b == true) {
                s = new user();
                s.setname(rs.getString("name"));
                s.setbranch(rs.getString("emial"));
                s.setphone(rs.getString("branch"));
                s.setemail(rs.getString("phone"));
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

            rs = st.executeQuery("select * from student where email='" + email + "' and pw='" + pw + "';");
            boolean b = rs.next();
            if (b == true) {
                id = rs.getString("slno");
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





    
    

