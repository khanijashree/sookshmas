package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class student_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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

String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "test";
String userid = "root";
String password = "root";
 HttpSession se=null;
       
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
      out.write("<html>\n");
      out.write("<title>Student_Home</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/lib/w3-theme-blue.css\">\n");
      out.write("<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans'>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" >\n");
      out.write("  \n");
      out.write("<style>\n");
      out.write("html, body, h1, h2, h3, h4, h5 {font-family: \"Open Sans\", sans-serif}\n");
      out.write("form.example input[type=text] {\n");
      out.write("  padding: 10px;\n");
      out.write("  font-size: 17px;\n");
      out.write("  border: 1px solid grey;\n");
      out.write("  float: left;\n");
      out.write("  width: 80%;\n");
      out.write("  background: #f1f1f1;\n");
      out.write("}\n");
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
      out.write(" <!--Navbar !-->\n");
      out.write("<div class=\"w3-top\">\n");
      out.write(" <div class=\"w3-bar w3-theme-d2 w3-left-align w3-large\">\n");
      out.write("  <a class=\"w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-theme-d2\" href=\"javascript:void(0);\" onclick=\"openNav()\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large w3-theme-d4\"><i class=\"fa fa-home w3-margin-right\"></i>Logo</a>\n");
      out.write("  <a href=\"./apply_exam.jsp\" class=\"w3-bar-item w3-button w3-hover-white w3-padding-large\" >Apply For Exam</a>\n");
      out.write("\n");
      out.write("         \n");
      out.write("  \n");
      out.write("  \n");
      out.write("   <div class=\"w3-dropdown-hover w3-hide-small w3-right w3-bar-item w3-button\" style=\"float:right;\">\n");
      out.write("    <button class=\"w3-button w3-padding-large\" title=\"MY account\"><i class=\"fa fa-user\"></i></button>\n");
      out.write("    <div class=\"w3-dropdown-content w3-card-4 w3-bar-block\" style=\"width:200px\">\n");
      out.write(" \n");
      out.write("            <a href=\"EditForm.jsp\" class=\"w3-bar-item w3-button w3-hover-blue\">Profile</a>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">Settings</a>\n");
      out.write("      <a href=\"contact.jsp\" class=\"w3-bar-item w3-button w3-hover-blue\">Contact us</a>\n");
      out.write("     \n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">Log out</a>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write(" \n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write("</div><!--\n");
      out.write("\n");
      out.write(" Navbar -->\n");
      out.write("<div class=\"w3-top\">\n");
      out.write(" <div class=\"w3-bar w3-theme-d2 w3-left-align w3-large\">\n");
      out.write("  <a class=\"w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-theme-d2\" href=\"javascript:void(0);\" onclick=\"openNav()\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large w3-theme-d4\"><i class=\"fa fa-home w3-margin-right\"></i>Logo</a>\n");
      out.write("  <div class=\"w3-dropdown-hover w3-hide-small w3-right w3-bar-item w3-button\" style=\"float:right;\">\n");
      out.write("    <button class=\"w3-button w3-padding-large\" title=\"MY account\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\" style=\"margin-right: 5px;\"></i>");
      out.print(session.getAttribute("uname"));
      out.write("\n");
      out.write("           </button>\n");
      out.write("    <div class=\"w3-dropdown-content w3-card-4 w3-bar-block\" style=\"width:150px\">\n");
      out.write("      <a href=\"javascript:void(0)\" class=\"w3-bar-item w3-button w3-hover-blue w3-left-align\" onclick=\"document.getElementById('id01').style.display='block'\">Profile</a>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">Settings</a>\n");
      out.write("<!--      <a href=\"contact.jsp\" class=\"w3-bar-item w3-button w3-hover-blue\">Contact us</a>\n");
      out.write("     -->\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button w3-hover-blue\">Log out</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!--Modal that pops up when you click on \"New Message\" !-->\n");
      out.write("<div id=\"id01\" class=\"w3-modal\" style=\"z-index:4\">\n");
      out.write("  <div class=\"w3-modal-content w3-animate-zoom\">\n");
      out.write("    <div class=\"w3-container w3-padding w3-blue\">\n");
      out.write("       <span onclick=\"document.getElementById('id01').style.display='none'\"\n");
      out.write("       class=\"w3-button w3-blue w3-right w3-xxlarge\"><i class=\"fa fa-remove\"></i></span>\n");
      out.write("      <h2>Apply for exam</h2>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-panel\">\n");
      out.write("\n");
      out.write("      <label>Name</label>\n");
      out.write("      <input class=\"w3-input w3-border w3-margin-bottom\" type=\"text\">\n");
      out.write("      <label>Usn</label>\n");
      out.write("      <input class=\"w3-input w3-border w3-margin-bottom\" type=\"text\">\n");
      out.write("      <label>Department</label>\n");
      out.write("      <input class=\"w3-input w3-border w3-margin-bottom\" type=\"text\">\n");
      out.write("      <label>Sem</label><br>\n");
      out.write("      <select  name=\"sem\">\n");
      out.write("                <option value=\"1st\">1st</option>\n");
      out.write("                <option value=\"2nd\">2nd</option>\n");
      out.write("                <option value=\"3rd\">3rd</option>\n");
      out.write("                <option value=\"4th\">4th</option>\n");
      out.write("                <option value=\"5ht\">5th</option>\n");
      out.write("                <option value=\"6th\">6th</option>\n");
      out.write("                <option value=\"7th\">7th</option>\n");
      out.write("                <option value=\"8th\">8th</option>\n");
      out.write("\n");
      out.write("              </select></br>\n");
      out.write("      <label>Back logs</label>\n");
      out.write("      <input class=\"w3-input w3-border w3-margin-bottom\" type=\"text\">\n");
      out.write("\n");
      out.write("      <div class=\"w3-section\">\n");
      out.write("        <a class=\"w3-button w3-blue\" onclick=\"document.getElementById('id01').style.display='none'\">Cancel  <i class=\"fa fa-remove\"></i></a>\n");
      out.write("        <a class=\"w3-button w3-light-grey w3-right\" onclick=\"document.getElementById('id01').style.display='none'\">Submit<i class=\"fa fa-paper-plane\"></i></a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
      out.write("<!--         <p class=\"w3-center\"><img src=\"\" class=\"w3-circle\" style=\"height:106px;width:106px\" alt=\"Avatar\"></p>\n");
      out.write("        -->\n");
      out.write("         <h4 class=\"w3-center\"><i class=\"fa fa-user-circle\" aria-hidden=\"true\" style=\"margin-right: 5px;\"></i>");
      out.print(session.getAttribute("uname"));
      out.write("\n");
      out.write("           </h4>\n");
      out.write("         <hr>\n");
      out.write("         <p><i class=\"fa fa-pencil fa-fw w3-margin-right w3-text-theme\"></i> Student</p>\n");
      out.write("           <p><i class=\"fa fa-university fa-fw w3-margin-right w3-text-theme\"></i> Jain Institute Of Technology</p>\n");
      out.write("         \n");
      out.write("         <p><i class=\"fa fa-home fa-fw w3-margin-right w3-text-theme\"></i> Davanagere, India</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- End Left Column -->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Middle Column -->\n");
      out.write("   <div class=\"w3-col m9\">\n");
      out.write("\n");
      out.write("      <div class=\"w3-container w3-card w3-white w3-round w3-margin\"><br>\n");
      out.write("\n");
      out.write("        <!-- <span class=\"w3-right w3-opacity\">1 min</span>\n");
      out.write("        <h4>Examination Department</h4><br>\n");
      out.write("        <hr class=\"w3-clear\">\n");
      out.write("        <p>For Math exam on 02/10/2020 (Friday)</p>\n");
      out.write("        <p>you have been alloted in </p>\n");
      out.write("          <p>main block <b>Room No:213</b><br>\n");
      out.write("             1st row 2nd column <b>Seat No:23</b>\n");
      out.write("          </p>\n");
      out.write("          <div class=\"w3-row-padding\" style=\"margin:0 -16px\">\n");
      out.write("            <div class=\"w3-half\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3-half\">\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         ");

try{
    
    
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement(); 
//or  Branch_id = '" + se.getAttribute("branchid") + "'//
String sql ="(select * from message where type='student' )";
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
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"w3-container w3-card w3-white w3-round w3-margin\"><br>\n");
      out.write("        <span class=\"w3-right w3-opacity\">5 days ago</span>\n");
      out.write("        <h4>some person</h4><br>\n");
      out.write("        <hr class=\"w3-clear\">\n");
      out.write("        <p>examination details </p>\n");
      out.write("         <p>your examination time table is scheduled and will be posted in the events</p>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"w3-container w3-card w3-white w3-round w3-margin\"><br>\n");
      out.write("\n");
      out.write("        <span class=\"w3-right w3-opacity\">10 days ago</span>\n");
      out.write("        <h4>Admin</h4><br>\n");
      out.write("        <hr class=\"w3-clear\">\n");
      out.write("        <p>Examination details</p>\n");
      out.write("        <p>your exams will start from the 02/10/2020 </p>\n");
      out.write("      </div>-->\n");
      out.write("\n");
      out.write("    <!-- End Middle Column -->\n");
      out.write("    </div>\n");
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
      out.write("<footer class=\"w3-container w3-theme-d3 w3-padding-16\" style=\" position: fixed; left: 0; bottom:0; height:10%;width: 100%; color: white;text-align: center; \">  \n");
      out.write("    <p> Jain institute of technology , Davanagere</p>\n");
      out.write("</footer>         \n");
      out.write("         \n");
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
      out.write("<script>\n");
      out.write("var openInbox = document.getElementById(\"myBtn\");\n");
      out.write("openInbox.click();\n");
      out.write("\n");
      out.write("function w3_open() {\n");
      out.write("  document.getElementById(\"mySidebar\").style.display = \"block\";\n");
      out.write("  document.getElementById(\"myOverlay\").style.display = \"block\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function w3_close() {\n");
      out.write("  document.getElementById(\"mySidebar\").style.display = \"none\";\n");
      out.write("  document.getElementById(\"myOverlay\").style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function myFunc(id) {\n");
      out.write("  var x = document.getElementById(id);\n");
      out.write("  if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("    x.className += \" w3-show\";\n");
      out.write("    x.previousElementSibling.className += \" w3-blue\";\n");
      out.write("  } else {\n");
      out.write("    x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("    x.previousElementSibling.className =\n");
      out.write("    x.previousElementSibling.className.replace(\" w3-blue\", \"\");\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var openTab = document.getElementById(\"firstTab\");\n");
      out.write("openTab.click();\n");
      out.write("</script>\n");
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
