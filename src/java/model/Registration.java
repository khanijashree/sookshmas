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
public class Registration {
        private Connection con;
    private Object branch_id;
       public enum status{
           existed,success,failure
       };
    

    HttpSession se;
    public Registration(HttpSession hs) {
        try { 
            
            Class.forName("com.mysql.jdbc.Driver"); // load the drivers
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            // connection with data base
            se=hs;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String Registration(String usn,String name,String branch,String scheme,String phone, String email,String pw) {
        PreparedStatement ps;
        String status = ""; 
      
                
        try {
            Statement st = null;
            ResultSet rs = null;
            st = con.createStatement();
            rs = st.executeQuery("select * from student where phone='" + phone + "' or email='" + email + "';");
            boolean b = rs.next();
            if (b) {
                status = "existed";
            } else {
                
                
                ps = (PreparedStatement) con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
                
                ps.setString(1, usn);
                 ps.setString(2, name);
                 ps.setString(3, branch);
                 ps.setString(4, scheme);
                ps.setString(5,phone);
                 ps.setString(6,email);
                ps.setString(7, pw);
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
  

   /*+ public user getInfo() {
        Statement st = null;
        ResultSet rs = null;
         user s = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select * from student where usn = '" + se.getAttribute("id") + "'");
            boolean b = rs.next();
            if (b == true) {
                s = new user();
                s.setusn(rs.getString("usn"));
                s.setname(rs.getString("name"));
                s.setbranch(rs.getString("branch"));
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
    
        */

    public status login(String email, String pw) {
         status status1 = null;
         String  id = "";
        String name = "";
        int branchid = 0;
                 //id = "";
        
      
        try {
              System.out.println("start");
            Statement st = con.createStatement();
            ResultSet rs = null;

            rs = st.executeQuery("select * from student where email='" + email + "' and pw='" + pw + "';");
           //boolean b = rs.next();
              System.out.println("end");
            if (rs.next()) {
                System.out.println("if");
               id = rs.getString("usn");
                name = rs.getString("name");
             se.setAttribute("uname", name);
               
//             id = rs.getString("slno");
//                name = rs.getString("name");
               branchid= rs.getInt("branch_id");
                se.setAttribute("uname", name);
                se.setAttribute("branchid", branchid);
//                se.setAttribute("id", id);
                
                  
                se.setAttribute("ubranch",branch_id);
                System.out.println("end");
                //se.setAttribute("email", email);
                //se.setAttribute("id", id);
                status1=status.success;
            } else {
                status1=status.failure;
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




