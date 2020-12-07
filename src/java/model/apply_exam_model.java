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
public class apply_exam_model {
   
        private Connection con;
      
PreparedStatement ps;
    
    private HttpSession se;
   
    public  apply_exam_model(HttpSession session) {
        try { 
            
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            se = session;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String exam(String usn,int sem,int branch,int scheme) {
        
      
           String a ="";
        try {
            Statement st = con.createStatement();
            String query = "insert into form(usn,sem, branch_id,scheme) values('"+usn+"',"+sem+","+branch+","+scheme+");";
            st.executeUpdate(query);
            
//            System.out.println("insert into form(" +usn+ "," + sem + "," + branch + "," + scheme+ ");");
            
            a = "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
        
    }

  //To change body of generated methods, choose Tools | Templates.
    }

