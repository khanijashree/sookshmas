/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;
/**
 *
 * @author user
 */
public class Admin_Login{
       Connection con;
    

    HttpSession se;
    public Admin_Login(HttpSession hs) {
        try {
           se=hs;
            Class.forName("com.mysql.jdbc.Driver"); // load the drivers
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            // connection with data base

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public String Admin_Login(String name,String adminid,String phone, String email,String pw) {
//        PreparedStatement ps;
//        String status = ""; 
//        
//                
//        try {
//            Statement st = null;
//            ResultSet rs = null;
//            st = con.createStatement();
//            rs = st.executeQuery("select * from admin where phone='" + phone + "' or email='" + email + "';");
//            boolean b = rs.next();
//            if (b) {
//                status = "existed";
//            } else {
//                
//                
//                ps = (PreparedStatement) con.prepareStatement("insert into admin values(?,?,?,?,?)");
//                
//                ps.setString(1, name);
//                 ps.setString(2, adminid);
//                // ps.setString(3, branch);
//                // ps.setString(4, scheme);
//                ps.setString(3,phone);
//                 ps.setString(4,email);
//                ps.setString(5, pw);
//                int a = ps.executeUpdate();
//                if (a > 0) {
//                    status = "success";
//                    se.setAttribute(admin_id, admin);
//                } else {
//                    status = "failure";
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println(status);
//        return status;
//    }
//  

    public user getInfo() {
        Statement st = null;
        ResultSet rs = null;
         user s = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select * from admin where adminid= '" + se.getAttribute("id") + "'");
            boolean b = rs.next();
            if (b == true) {
                s = new user();
                s.setname(rs.getString("name"));
               // s.setbranch(rs.getString("branch"));
                s.setphone(rs.getString("phone"));
                s.setemail(rs.getString("email"));
                s.setpw(rs.getString("pw"));
               
                
            } else {
                s = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
    
        

    public String admin_login(String email, String pw) {
        String status1 = "";
        int id ;
        String name = "", emails = "";

        try {
            Statement st = null;
            ResultSet rs = null;
            st = con.createStatement();

            rs = st.executeQuery("select * from admin where email='" + email + "' and pw='" + pw + "';");
            boolean b = rs.next();
            if (b == true) {
                id = rs.getInt("adminid");
                name = rs.getString("name");
                emails= rs.getString("email");
                se.setAttribute("aname", name);
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
            se.setAttribute("aname", name);
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




