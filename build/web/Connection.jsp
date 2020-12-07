

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>

      <%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
 
<html>
   <head>
      <title>SELECT Operation</title>
   </head>

   <body>
       <form action="" method="POST">
   <select name="branch" id="branch_id" onchange="this.form.submit()">
       <label class="w3-text-blue">Branch</label>
   <option value="0">branch</option>

   <%
       Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;
Statement st = null;
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

        String dbname = "test";
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/";
        
        
       try{
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url+dbname, username , password);
  
        st = con.createStatement();

        String query = "select * from branch;";
        rs = st.executeQuery(query);
       
        while(rs.next()){
          //  System.out.println(rs.getString("city"));
            %>
            <option value="<%= rs.getInt("Branch_id")%>"><%=rs.getString("Name")%></option>
            <%
        }
    }catch(Exception e){
        System.out.println(e);
    }
   %>
   </select>
   <select>
       <option value="0">Select Sem</option>
       <%
           try{
               Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection(url+dbname, username , password);

               st = con.createStatement();
               String query = "select * from restaurant where l_id = "+request.getParameter("location")+";";
               System.out.println(query);
               rs = st.executeQuery(query);
               
               while(rs.next()){
        %>
                  <option value="<%= rs.getInt("rid")%>"
                          
                    <%
                        if(request.getParameter("location")!=null){
                            if(rs.getInt("l_id") == Integer.parseInt(request.getParameter("location"))){
                                out.print("selected");
                            }
                        }
                    %>
                          
                  ><%=rs.getString("rname")%></option>
        <%   
               }
           }catch(Exception e){
               System.out.println(e);
           }
       %>
   </select>
   </form>
   </body>
</html> 