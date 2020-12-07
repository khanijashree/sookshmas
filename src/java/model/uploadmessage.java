/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import javax.servlet.http.HttpSession;



public class uploadmessage {
 PreparedStatement ps;
    private Connection con;
    private HttpSession se;

    public uploadmessage(HttpSession session) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            se = session;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

    public String Insertmessage(String message,String type,int Branch_id,int id) {

        String a = "";
        try {
//String message =request.getParameter("message");
//String type=request.getParameter("type");
//String Branch_id=request.getParameter("branch");
//            ps = (PreparedStatement) con.prepareStatement("insert into message(0,?,?,?,?);");
            Statement st = con.createStatement();
            String query = "insert into message(message, type, Branch_id, admin_id) values('"+message+"','"+type+"',"+Branch_id+","+id+");";
            st.executeUpdate(query);
            
            System.out.println("insert into message(" + message + "," + type + "," + Branch_id + "," + id + ");");
            
            a = "success";
//           
//          
//            ps.setString(1, message);
//            ps.setString(2, type);
//            ps.setInt(3, Branch_id );
////            
//            ps.setInt(4, id);
//
//            // ps.setString(4,session.getAttribute("id").toString());
//            int i = ps.executeUpdate();
//            if(i>0){
//            a="success";
//            
//            }
            
//st.executeUpdate("insert into users(first_name,last_name,city_name,email)values('"+first_name+"','"+last_name+"','"+city_name+"','"+email+"')")
//('"+admin_message+"','"+type+"','"+Branch_id+'",'"+year+"')");
//     "select subject_id,name from subject where Branch_id ="+request.getParameter("branch")+" and sem ="+request.getParameter("sem")+" and scheme ="+request.getParameter("scheme");
//                    System.out.println(query);

        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();
        }
        System.out.println(a+"in model");
        return a;
    }

}
