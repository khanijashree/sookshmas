package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class admin_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/upload.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "test";
String userid = "root";
String password = "root";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<title>Admin_Home</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/lib/w3-theme-blue.css\">\n");
      out.write("<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans'>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("html, body, h1, h2, h3, h4, h5 {font-family: \"Open Sans\", sans-serif}\n");
      out.write("form.example input[type=text] {\n");
      out.write("  padding: 10px;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: 1px solid rgb(151, 140, 140);\n");
      out.write("  float: left;\n");
      out.write("  width: 80%;\n");
      out.write("  background: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("      .footer {\n");
      out.write("            position: fixed;\n");
      out.write("            left: 0;\n");
      out.write("            bottom: 0;\n");
      out.write("            width: 100%;\n");
      out.write("            background-color: #123969;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("form.example button {\n");
      out.write("  float: left;\n");
      out.write("  width: 20%;\n");
      out.write("  padding: 10px;\n");
      out.write("  background: #2196F3;\n");
      out.write("  color: white;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: 1px solid grey;\n");
      out.write("  border-left: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form.example button:hover {\n");
      out.write("  background: #0b7dda;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form.example::after {\n");
      out.write("  content: \"\";\n");
      out.write("  clear: both;\n");
      out.write("  display: table;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body class=\"w3-theme-l5\">\n");
      out.write("\n");
      out.write("<!-- Navbar -->\n");
      out.write("<div class=\"w3-top\">\n");
      out.write(" <div class=\"w3-bar w3-theme-d2 w3-left-align w3-large\">\n");
      out.write("      <a class=\"w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-theme-d2\" href=\"javascript:void(0);\" onclick=\"openNav()\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("      <a href=\"#admin_home.jsp\" class=\"w3-bar-item w3-button w3-padding-large w3-theme-d4\"><i class=\"fa fa-home w3-margin-right\"></i>Logo</a>\n");
      out.write("      <a href=\"./Allot_seat.jsp\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\"><i class=\"fa fa-users\"></i>Allot Seat</a>\n");
      out.write("     <div class=\"w3-dropdown-hover w3-hide-small w3-bar-item w3-button w3-hover-white\">\n");
      out.write("        <button class=\"w3-button w3-padding-large w3-hide-small w3-padding-large w3-hover-white\">Manage Subjects</button>\n");
      out.write("        <div class=\"w3-dropdown-content w3-card-4 w3-bar-block\" style=\"width:250px\">\n");
      out.write("          <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">Edit Subject</a>\n");
      out.write("          <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">Delete Subject</a>\n");
      out.write("          <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">Add Subject</a>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("     <div class=\"w3-dropdown-hover w3-hide-small w3-bar-item w3-button w3-hover-white\" style=\"float:right;\">\n");
      out.write("    <button class=\"w3-button w3-padding-large w3-hide-small w3-padding-large w3-hover-white\" title=\"MY account\"></i><i class=\"fa fa-user-circle\" aria-hidden=\"true\" style=\"margin-right: 5px;\"></i>");
      out.print(session.getAttribute("aname"));
      out.write("\n");
      out.write("           </button>\n");
      out.write("    <div class=\"w3-dropdown-content w3-card-4 w3-bar-block\" style=\"width:200px\">\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">Profile</a>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">Settings</a>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">Log out</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Navbar on small screens -->\n");
      out.write("<div id=\"navDemo\" class=\"w3-bar-block w3-theme-d2 w3-hide w3-hide-large w3-hide-medium w3-large\">\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">Link 1</a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">Link 2</a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">Link 3</a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">My Profile</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Page Container -->\n");
      out.write("<div class=\"w3-container w3-content\" style=\"max-width:1400px;margin-top:80px\">\n");
      out.write("  <!-- The Grid -->\n");
      out.write("  <div class=\"w3-row\">\n");
      out.write("    <!-- Left Column -->\n");
      out.write("    <div class=\"w3-col m3\">\n");
      out.write("      <!-- Profile -->\n");
      out.write("      <div class=\"w3-card w3-round w3-white\">\n");
      out.write("        <div class=\"w3-container\">\n");
      out.write("         <h4 class=\"w3-center\">My Profile</h4>\n");
      out.write("<!--         <p class=\"w3-center\"><img src=\"/images/photo.jpeg\" class=\"w3-circle\" style=\"height:106px;width:106px\" alt=\"Avatar\"></p>\n");
      out.write("         -->\n");
      out.write("        <h4 class=\"w3-center\"> <i class=\"fa fa-user-circle\" aria-hidden=\"true\" style=\"margin-right: 5px;\"></i>");
      out.print(session.getAttribute("aname"));
      out.write("\n");
      out.write("           \n");
      out.write("         </h4>\n");
      out.write("         <hr>\n");
      out.write("<p><i class=\"fa fa-pencil fa-fw w3-margin-right w3-text-theme\"></i> Admin</p>\n");
      out.write("         \n");
      out.write("         <p><i class=\"fa fa-university fa-fw w3-margin-right w3-text-theme\"></i> Jain Institute Of Technology</p>\n");
      out.write("         <p><i class=\"fa fa-map-marker fa-fw w3-margin-right w3-text-theme\"></i> Davanagere, India</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        <br>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- End Left Column -->\n");
      out.write("\n");
      out.write("    <!-- Middle Column -->\n");
      out.write("    <div class=\"w3-col m9\">\n");
      out.write("\n");
      out.write("      <div class=\"w3-row-padding\">\n");
      out.write("        <div class=\"w3-col m12\">\n");
      out.write("          <div class=\"w3-card w3-round w3-white\">\n");
      out.write("            <div class=\"w3-container w3-padding\">\n");
      out.write("                <h3 class=\"w3-opacity\">post an event</h3><hr>\n");
      out.write("                <label>Upload image/file</label><br>\n");
      out.write("    <form name=\"imageupload\" method=\"post\" action=\"upload\" enctype=\"multipart/form-data\">\n");
      out.write("  \n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("      <head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("  \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("              \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            function IsEmpty() {\n");
      out.write("                var imgs = document.getElementById('file').value;\n");
      out.write("                if (imgs == null || imgs == \"\" || imgs == \"null\") {\n");
      out.write("                } else {\n");
      out.write("                    document.imageupload.action = \"upload\";\n");
      out.write("                    document.imageupload.submit();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("                ");
if(session.getAttribute("id")!=null){
      out.write("\n");
      out.write("                  <input type=\"file\" id=\"file\" name=\"image\"/>\n");
      out.write("                  \n");
      out.write("           \n");
      out.write("                 ");
}
      out.write(" \n");
      out.write("         \n");
      out.write("                   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("                    <button type=\"submit\" class=\"w3-button w3-theme w3-right \" name=\"Upload\" onclick=\"return IsEmpty()\">upload</button>\n");
      out.write("                </form>\n");
      out.write("               <br><br>\n");
      out.write("               <form action=\"postmsg\" method=\"post\">\n");
      out.write("                    <label for=\"subject\">Message</label></br>\n");
      out.write("                \n");
      out.write("              </br><textarea id=\"message\" name=\"message\" placeholder=\"Write something..\" style=\"height:100px; width:100%\" contenteditable=\"true\" class=\"w3-border w3-padding\"></textarea></br></br>\n");
      out.write("                \n");
      out.write("                    <div class=\"w3-row-padding\">\n");
      out.write("                        <div class=\"w3-col m4\">\n");
      out.write("                            <label for =\"type\">select type</label></br>\n");
      out.write("                            <select id=\"type\" name=\"type\" style=\"width:250px\">\n");
      out.write("                                <option value=\"faculty\">FACULTY</option>\n");
      out.write("                                <option value=\"student\">STUDENT</option>\n");
      out.write("                                <option value=\"all\">All</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("              \n");
      out.write("                        <div class=\"w3-col m4\">\n");
      out.write("                            <label for=\"branch\">Select Branch</label></br>\n");
      out.write("                            <select id=\"branch\" name=\"branch\" style=\"width:250px\">\n");
      out.write("                              <option value=\"1\">Computer Science</option>\n");
      out.write("                              <option value=\"5\">Mechanical</option>\n");
      out.write("                              <option value=\"3\">Electronics</option>\n");
      out.write("                              <option value=\"2\">Civil</option>\n");
      out.write("                              <option value=\"4\">Electrical</option>\n");
      out.write("                              <option value=\"6\">All</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                                    </br>  </br></br>                    </br> </br>\n");
      out.write("\n");
      out.write("                        <button type=\"button\" class=\"w3-button w3-theme w3-left\">Cancel</button>\n");
      out.write("                        <button type=\"submit\" id=\"post\" class=\"w3-button w3-theme w3-right \" name=\"but1\"  >Post</button>\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("               </div>\n");
      out.write("             </form> \n");
      out.write("                    </div>\n");
      out.write("                      </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("\n");
      out.write("                 \n");
      out.write("             \n");
      out.write("               \n");
      out.write("                   \n");
      out.write("<!--\n");
      out.write("session.getAttribute(\"id\");\n");
      out.write("String message =request.getParameter(\"message\");\n");
      out.write("String type=request.getParameter(\"type\");\n");
      out.write("String Branch_id=request.getParameter(\"branch\");\n");
      out.write(" \n");
      out.write("try\n");
      out.write("{\n");
      out.write("      \n");
      out.write("\n");
      out.write(" Class.forName(\"com.mysql.jdbc.Driver\");\n");
      out.write("Connection con = DriverManager.getConnection(\"jdbc:mysql://localhost:3306/test\", \"root\", \"root\");\n");
      out.write("Statement st=con.createStatement();\n");
      out.write("   PreparedStatement ps;\n");
      out.write("     ps = (PreparedStatement) con.prepareStatement(\"insert into message(0,?,?,?,?,now())\");\n");
      out.write("   System.out.println(\"insert into message(\"+message+\",\"+type+\",\"+Branch_id+\",\"+ session.getAttribute(\"id\")+\",\"+\"now(),);\");\n");
      out.write("                  \n");
      out.write("//                 ps.setString(1, session.getAttribute(\"id\").toString());\n");
      out.write("//            ps.setString(2, session.getAttribute(\"uname\").toString());\n");
      out.write("//            //ps.setString(3, link);\n");
      out.write("                 ps.setString(1, message);\n");
      out.write("                 ps.setString(2, type);\n");
      out.write("                 ps.setString(3, Branch_id);\n");
      out.write("                 ps.setString(4, session.getAttribute(\"id\").toString());\n");
      out.write("           \n");
      out.write("              // ps.setString(4,session.getAttribute(\"id\").toString());\n");
      out.write("                \n");
      out.write("\n");
      out.write("int i=ps.executeUpdate();\n");
      out.write("//st.executeUpdate(\"insert into users(first_name,last_name,city_name,email)values('\"+first_name+\"','\"+last_name+\"','\"+city_name+\"','\"+email+\"')\")\n");
      out.write("//in t =st.executeUpdate(\"insert into message(admin_message,type,Branch_id,year) values('\"+admin_message+\"','\"+type+\"','\"+Branch_id+'\",'\"+year+\"')\");\n");
      out.write("//     \"select subject_id,name from subject where Branch_id =\"+request.getParameter(\"branch\")+\" and sem =\"+request.getParameter(\"sem\")+\" and scheme =\"+request.getParameter(\"scheme\");\n");
      out.write("//                    System.out.println(query);\n");
      out.write("-->                 \n");
      out.write("<!--}\n");
      out.write("catch(Exception e)\n");
      out.write("{\n");
      out.write("System.out.print(e);\n");
      out.write("e.printStackTrace();\n");
      out.write("}-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("      <div class=\"w3-container w3-card w3-white w3-round w3-margin\">\n");
      out.write("\n");
      out.write("<!--        <span class=\"w3-right w3-opacity\">1 min</span>\n");
      out.write("        \n");
      out.write("        <h4>Examination Department</h4><br>\n");
      out.write("        <hr class=\"w3-clear\">\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        \n");
      out.write("       <p>For Math exam on 02/10/2020 (Friday)</p>\n");
      out.write("               <p> </p>\n");
      out.write("        <p>you have been alloted in </p>\n");
      out.write("          <p>main block <b>Room No:</b><br>\n");
      out.write("             1st row 2nd column <b>Seat No:23</b>\n");
      out.write("          </p>\n");
      out.write("          <div class=\"w3-row-padding\" style=\"margin:0 -16px\">\n");
      out.write("            <div class=\"w3-half\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3-half\">\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("   -->\n");
      out.write("           \n");
      out.write("          ");

try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from message";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<!--\n");
      out.write("  <span class=\"w3-right w3-opacity\">=resultSet.getString(\"now()\")%></span>-->\n");
      out.write("   <h4>note for ");
      out.print(resultSet.getString("type"));
      out.write("'s</h4>\n");
      out.write("       <hr class=\"w3-clear\">\n");
      out.write("   <div class=\"w3-container w3-card w3-white w3-round w3-margin\"><br>");
      out.print(resultSet.getString("message"));
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("\n");

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write(" </div>\n");
      out.write("           \n");
      out.write("<!--           <div class=\"w3-container w3-card w3-white w3-round w3-margin\"><br>\n");
      out.write("        <span class=\"w3-right w3-opacity\">5 days ago</span>\n");
      out.write("        <h4></h4><br>\n");
      out.write("        <hr class=\"w3-clear\">\n");
      out.write("       \n");
      out.write("         <p></p>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("\n");
      out.write("      <div class=\"w3-container w3-card w3-white w3-round w3-margin\"><br>\n");
      out.write("\n");
      out.write("        <span class=\"w3-right w3-opacity\">10 days ago</span>\n");
      out.write("        \n");
      out.write("        <p id=\"demo\"></p>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("<!--        <hr class=\"w3-clear\">\n");
      out.write("        <p>Examination details</p>\n");
      out.write("        <p>your exams will start from the 02/10/2020 </p>-->\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("    <!-- End Middle Column -->\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- End Grid -->\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<!-- End Page Container -->\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"w3-container w3-theme-d3 w3-padding-16\" style=\" position: fixed; height:10%;left: 0; bottom:0; width: 100%; background-color: #123969; color: white;text-align: center; \">  \n");
      out.write("    <p> Jain institute of technology , Davanagere</p>\n");
      out.write("</footer>         \n");
      out.write("           \n");
      out.write("           \n");
      out.write("            \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Accordion\n");
      out.write("function myFunction(id) {\n");
      out.write("  var x = document.getElementById(id);\n");
      out.write("  if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("    x.className += \" w3-show\";\n");
      out.write("    x.previousElementSibling.className += \" w3-theme-d1\";\n");
      out.write("  } else {\n");
      out.write("    x.className = x.className.replace(\"w3-show\", \"\");\n");
      out.write("    x.previousElementSibling.className =\n");
      out.write("    x.previousElementSibling.className.replace(\" w3-theme-d1\", \"\");\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Used to toggle the menu on smaller screens when clicking on the menu button\n");
      out.write("function openNav() {\n");
      out.write("  var x = document.getElementById(\"navDemo\");\n");
      out.write("  if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("    x.className += \" w3-show\";\n");
      out.write("  } else {\n");
      out.write("    x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>////\n");
      out.write("////var openInbox = document.getElementById(\"myBtn\");\n");
      out.write("////openInbox.click();\n");
      out.write("////\n");
      out.write("////function w3_open() {\n");
      out.write("////  document.getElementById(\"mySidebar\").style.display = \"block\";\n");
      out.write("////  document.getElementById(\"myOverlay\").style.display = \"block\";\n");
      out.write("////}\n");
      out.write("////\n");
      out.write("////function w3_close() {\n");
      out.write("////  document.getElementById(\"mySidebar\").style.display = \"none\";\n");
      out.write("////  document.getElementById(\"myOverlay\").style.display = \"none\";\n");
      out.write("////}\n");
      out.write("////\n");
      out.write("////function myFunc(id) {\n");
      out.write("////  var x = document.getElementById(id);\n");
      out.write("////  if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("////    x.className += \" w3-show\";\n");
      out.write("////    x.previousElementSibling.className += \" w3-blue\";\n");
      out.write("////  } else {\n");
      out.write("////    x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("////    x.previousElementSibling.className =\n");
      out.write("////    x.previousElementSibling.className.replace(\" w3-blue\", \"\");\n");
      out.write("////  }\n");
      out.write("////}\n");
      out.write("////////\n");
      out.write("////var openTab = document.getElementById(\"firstTab\");\n");
      out.write("////openTab.click();\n");
      out.write("////</script>\n");
      out.write(" \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
