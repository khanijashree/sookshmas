/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class getSubjectsToForm {

    Connection con;
    Statement st;
    ResultSet rs;

    public getSubjectsToForm() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public ArrayList getRegularSubjects(int branch, int sem, int scheme){
        ArrayList<subjects> subList = new ArrayList<>();
        try {
            st = con.createStatement();
            
            String query = "select subject_id,name from subject where Branch_id =" + branch + " and sem =" + sem + " and scheme =" + scheme;
            System.out.println(query);
            rs = st.executeQuery(query);
            
            while (rs.next()) {
                subjects sub = new subjects();
                sub.setRegSubId(rs.getInt("subject_id"));
                sub.setRegSubName(rs.getString("name"));
                subList.add(sub);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return subList;
    }
}
