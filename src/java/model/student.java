

package model;

import java.sql.*;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

public class student{

    private Connection con;
    HttpSession se;

    public student(HttpSession session) {
        try {

            Class.forName("com.mysql.jdbc.Driver"); // load the drivers
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            // connection with data base
            se = session;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

    public user getInfo() {
        Statement st = null;
        ResultSet rs = null;
         user s = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select * from student where slno= '" + se.getAttribute("id") + "'");
            boolean b = rs.next();
            if (b == true) {
                s = new user();
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
    
        

    public String login(String email, String pw) {
        String status1 = "", id = "";
        String name = "", emails = "";

        try {
            Statement st = null;
            ResultSet rs = null;
            st = con.createStatement();

            rs = st.executeQuery("select * from student where email='" + email + "' and password='" + pw + "';");
            boolean b = rs.next();
            if (b == true) {
                id = rs.getString("slno");
                name = rs.getString("name");
                emails = rs.getString("email");
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


