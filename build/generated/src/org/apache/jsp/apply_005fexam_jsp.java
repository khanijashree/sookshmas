package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.subjects;
import model.getSubjectsToForm;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import java.util.*;

public final class apply_005fexam_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Apply for exam</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/lib/w3-theme-blue.css\">\n");
      out.write("        <link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Open+Sans'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .topnav {\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a {\n");
      out.write("                float: left;\n");
      out.write("                color: #f2f2f2;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 19px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- \n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("                    jQuery.validator.addMethod(\"checkemail\", function (value, element) {\n");
      out.write("                        return /^(([^<>()[\\]\\\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/.test(value) || /^[0-9]{10}$/.test(value);\n");
      out.write("                    }, \"Please enter the email format as abc@gmail.com\");\n");
      out.write("                    $(document).ready(function () {\n");
      out.write("                        $(\"#signupform\").validate({\n");
      out.write("                            rules: {\n");
      out.write("                                 usn: {\n");
      out.write("                                    required: true,\n");
      out.write("                                    minlength: 4\n");
      out.write("                                },\n");
      out.write("                                name: {\n");
      out.write("                                    required: true,\n");
      out.write("                                    minlength: 4\n");
      out.write("                                },\n");
      out.write("                                branch: {\n");
      out.write("                                    required: true,\n");
      out.write("                                    minlength: 3,\n");
      out.write("                                    maxlength: 3\n");
      out.write("                                },\n");
      out.write("                                scheme: {\n");
      out.write("                                    required: true,\n");
      out.write("                                   \n");
      out.write("                                    maxlength: 4\n");
      out.write("                                },\n");
      out.write("                                \n");
      out.write("                                email: {\n");
      out.write("                                    required: true,\n");
      out.write("                                    checkemail: true\n");
      out.write("                                },\n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("                               \n");
      out.write("                            },\n");
      out.write("                            messages: {\n");
      out.write("                                name: {\n");
      out.write("                                    required: \"Enter your name\",\n");
      out.write("                                    minlength: \"Please enter atleast 4 characters\"\n");
      out.write("                                },\n");
      out.write("                                email: {\n");
      out.write("                                    required: \"Enter your email\"\n");
      out.write("        \n");
      out.write("                                },\n");
      out.write("                                branch: {\n");
      out.write("                                    required: \"Enter your respective branch\",\n");
      out.write("                                    minlength: \"Please enter your branch with 3 characters(eg:CSE)\",\n");
      out.write("                                    maxlength: \"Please enter you branch with 3 characters (eg:CSE) \"\n");
      out.write("                                },\n");
      out.write("                               \n");
      out.write("                               \n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("        \n");
      out.write("                    });\n");
      out.write("                </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("        -->\n");
      out.write("        <div class=\"w3-top\">\n");
      out.write("            <div class=\"w3-bar w3-theme-d2 w3-left-align w3-large\">\n");
      out.write("                <a class=\"w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-theme-d2\" href=\"javascript:void(0);\" onclick=\"openNav()\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                <a href=\"./student_home.jsp\" class=\"w3-bar-item w3-button w3-padding-large w3-theme-d4\"><i class=\"fa fa-home w3-margin-right\"></i>Logo</a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div></br></br></br>\n");
      out.write("        <!--<form action='next' method='post'>-->\n");
      out.write("        <div >\n");
      out.write("            <div class=\"w3-row-padding\">\n");
      out.write("                <div class=\"w3-col m12\">\n");
      out.write("                    <div class=\"w3-card-4\">\n");
      out.write("                        <div class=\"w3-container w3-blue\">\n");
      out.write("                            <h2>Student Details</h2>\n");
      out.write("                        </div></br></br>\n");
      out.write("                        <form class=\"w3-container\">\n");
      out.write("\n");
      out.write("                            <div class=\"w3-row-padding\">\n");
      out.write("                                <div class=\"w3-col m1\">\n");
      out.write("\n");
      out.write("                                    <label class=\"w3-text-blue\">Name</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-col m4\">\n");
      out.write("                                    <input class=\"w3-input w3-border w3-blue\" type=\"text\" placeholder=\"Name\" name=\"name\" style=\"border-radius: 12px;\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-col m2\">\n");
      out.write("                                    <h2></h2>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-col m1\">\n");
      out.write("                                    <label class=\"w3-text-blue\">USN</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-col m4\">\n");
      out.write("                                    <input class=\"w3-input w3-border w3-blue\" type=\"text\" id=\"usn\"   value='' placeholder=\"USN\" name=\"usn\" style=\"border-radius: 12px;\">\n");
      out.write("                                </div>\n");
      out.write("                            </div></br>\n");
      out.write("\n");
      out.write("                            <div class=\"w3-row-padding\">\n");
      out.write("                                <div class=\"w3-col m1\">\n");
      out.write("                                    <label class=\"w3-text-blue\">Branch</label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"w3-col m4\">\n");
      out.write("\n");
      out.write("                                    <select class=\"w3-select w3-border w3-blue\" id=\"branch\" name=\"branch\" style=\"border-radius: 12px;\">\n");
      out.write("                                        <option value=\"\" disabled selected>Branch</option>\n");
      out.write("                                        <option value=\"1\">Computer Science and Engineering</option>\n");
      out.write("                                        <option value=\"5\">Mechanical Engineering</option>\n");
      out.write("                                        <option value=\"4\">Electrical Engineering</option>\n");
      out.write("                                        <option value=\"3\">Electronics Engineering</option>\n");
      out.write("                                        <option value=\"2\">Civil Engineering</option>\n");
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-col m2\">\n");
      out.write("                                    <h2></h2>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-col m1\">\n");
      out.write("                                    <label class=\"w3-text-blue\">Sem</label>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"w3-col m4\">\n");
      out.write("                                    <select class=\"w3-select w3-border w3-blue\" id=\"sem\" name=\"sem\" style=\"border-radius: 12px;\">\n");
      out.write("                                        <option value=\"\" disabled selected>Semester</option>\n");
      out.write("                                        <option value=\"1\">1st Semester</option>\n");
      out.write("                                        <option value=\"2\">2nd Semester</option>\n");
      out.write("                                        <option value=\"3\">3rd Semester</option>\n");
      out.write("                                        <option value=\"4\">4th Semester</option>\n");
      out.write("                                        <option value=\"5\">5th Semester</option>\n");
      out.write("                                        <option value=\"6\">6th Semester</option>\n");
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div></br>\n");
      out.write("\n");
      out.write("                            <div class=\"w3-row-padding\">\n");
      out.write("                                <div class=\"w3-col m1\">\n");
      out.write("                                    <label class=\"w3-text-blue\">E-mail</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-col m4\">\n");
      out.write("                                    <input class=\"w3-input w3-border w3-blue\" id=\"email\" name=\"email\" type=\"text\" placeholder=\"Mail-id\" style=\"border-radius: 12px;\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-col m2\">\n");
      out.write("                                    <h2></h2>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-col m1\">\n");
      out.write("                                    <label class=\"w3-text-blue\">Scheme</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-col m4\">\n");
      out.write("                                    <select class=\"w3-select w3-border w3-blue\" id=\"scheme\" name=\"scheme\" style=\"border-radius: 12px;\">\n");
      out.write("                                        <option value=\"\" disabled selected>Scheme</option>\n");
      out.write("                                        <option value=\"2017\">2017</option>\n");
      out.write("                                        <option value=\"2018\">2018</option>\n");
      out.write("                                        <option value=\"2019\">2019</option>\n");
      out.write("                                        <option value=\"2020\">2020</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" id=\"next\" name=\"next\"  class=\"w3-button w3-theme w3-left\">next</button>\n");
      out.write("                            </div></br>\n");
      out.write("\n");
      out.write("                        </form></br>\n");
      out.write("                    </div></br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                        $(document).ready(function () {\n");
      out.write("                            $(\"#save_data\").click(function () {\n");
      out.write("                                alert(\"succeess\");\n");
      out.write("                                $.ajax({\n");
      out.write("                                    url: \"apply_exam.jsp\",\n");
      out.write("                                    type: \"post\",\n");
      out.write("                                    data: {\n");
      out.write("                                        //name:$('#name').val(),\n");
      out.write("                                        usn: $('#usn').val(),\n");
      out.write("                                        sem: $('#sem').val(),\n");
      out.write("                                        branch: $('#branch').val(),\n");
      out.write("                                        //email:$('#email').val(),\n");
      out.write("                                        scheme: $('#scheme').val(),\n");
      out.write("                                        success: function (data) {\n");
      out.write("                                            alert(data);\n");
      out.write("                                        }\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("                            });\n");
      out.write("                        });\n");
      out.write("                    </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                        String name = request.getParameter("name");
                        String usn = request.getParameter("usn");
                        String branch = request.getParameter("branch");
                        String sem = request.getParameter("sem");
                        String email = request.getParameter("email");
                        String scheme = request.getParameter("scheme");
                        try {

                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
                            Statement st = conn.createStatement();
                            int i = st.executeUpdate("insert into form(usn,sem,branch_id,scheme)values('" + usn + "','" + sem + "','" + branch + "','" + scheme + "')");
                            out.println("Data is successfully inserted!");
                        } catch (Exception e) {
                            System.out.print(e);
                            e.printStackTrace();
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"w3-card-4\">\n");
      out.write("                        <div class=\"w3-container w3-blue\">\n");
      out.write("                            <h2>Subject Details</h2>\n");
      out.write("                        </div></br></br>\n");
      out.write("<!--                        <form class=\"w3-container\" action=\"\">-->\n");
      out.write("\n");
      out.write("                            <table class=\"w3-table-all\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Subject Code</th>\n");
      out.write("                                    <th>Subject Name</th>\n");
      out.write("                                        ");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                ");

                                    Connection con = null;
                                    PreparedStatement ps = null;
                                    ResultSet rs = null;
                                    Statement st = null;
                                    try {
                                        Class.forName("com.mysql.jdbc.Driver");
                                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
                                        st = con.createStatement();

                                        String query = "select subject_id,name from subject where length(subject_id)=6 and Branch_id =" + request.getParameter("branch") + " and sem =" + request.getParameter("sem") + " and scheme =" + request.getParameter("scheme");
                                        System.out.println(query);
                                        rs = st.executeQuery(query);

                                        while (rs.next()) {


                                
      out.write("\n");
      out.write("                                <tr> <td><input type=\"text\"  name=\"subcode\" id=\"subcode\" value='");
      out.print(rs.getString("subject_id"));
      out.write("'>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td><input type=\"text\"  name=\"subname\" id=\"subname\" value='");
      out.print(rs.getString("name"));
      out.write("'>\n");
      out.write("                                    </td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                ");

                                        }
                                    } catch (Exception r) {
                                        System.out.print(r);
                                    }
                                
      out.write("\n");
      out.write("\n");
      out.write("                                <!--    <tr>\n");
      out.write("                                   <td></td>\n");
      out.write("                                   <td></td>\n");
      out.write("                                   <td></td>\n");
      out.write("                                 </tr>\n");
      out.write("                                 \n");
      out.write("                                 <tr>\n");
      out.write("                                   <td><input type=\"text\"  name=\"subcode\" id=\"subcode2\" placeholder=\"2nd subject code\">\n");
      out.write("                                 </td>\n");
      out.write("                                   <td><input type=\"text\"  name=\"subcode\" id=\"subname2\" placeholder=\"2nd subject\">\n");
      out.write("                                 </td>\n");
      out.write("                                   \n");
      out.write("                                 </tr>\n");
      out.write("                                 <tr>\n");
      out.write("                                   <td></td>\n");
      out.write("                                   <td></td>\n");
      out.write("                                   <td></td>\n");
      out.write("                                 </tr>\n");
      out.write("                                 <tr>\n");
      out.write("                                   <td><input type=\"text\"  name=\"subcode\" id=\"subcode\" placeholder=\"3rd subject code\">\n");
      out.write("                                 </td>\n");
      out.write("                                   <td><input type=\"text\"  name=\"subcode\" id=\"subcode\" placeholder=\"3rd subject\">\n");
      out.write("                                 \n");
      out.write("                                   </td>\n");
      out.write("                                 </tr>\n");
      out.write("                                 <tr>\n");
      out.write("                                   <td></td>\n");
      out.write("                                   <td></td>\n");
      out.write("                                   <td></td>\n");
      out.write("                                 </tr>\n");
      out.write("                                 <tr>\n");
      out.write("                                   <td><input type=\"text\"  name=\"subcode\" id=\"subcode\" placeholder=\"4th subject code\">\n");
      out.write("                                 </td>\n");
      out.write("                                   <td><input type=\"text\"  name=\"subcode\" id=\"subcode\" placeholder=\"4th subject\">\n");
      out.write("                                 </td>\n");
      out.write("                                 </tr>\n");
      out.write("                                 <tr>\n");
      out.write("                                   <td></td>\n");
      out.write("                                   <td></td>\n");
      out.write("                                   <td></td>\n");
      out.write("                                 </tr>\n");
      out.write("                                 <tr>\n");
      out.write("                                   <td><input type=\"text\"  name=\"subcode\" id=\"subcode\" placeholder=\"5th subject code\">\n");
      out.write("                                 </td>\n");
      out.write("                                 <td><input type=\"text\"  name=\"subcode\" id=\"subcode\" placeholder=\"5th subject\">\n");
      out.write("                                 </td>\n");
      out.write("                               \n");
      out.write("                                 </tr>\n");
      out.write("                                 <tr>\n");
      out.write("                                   <td></td>\n");
      out.write("                                   <td></td>\n");
      out.write("                                   <td></td>\n");
      out.write("                                 </tr>\n");
      out.write("                                 <tr>\n");
      out.write("                                   <td><input type=\"text\"  name=\"subcode\" id=\"subcode\" placeholder=\"6th subject code\">\n");
      out.write("                                 </td>\n");
      out.write("                                   <td><input type=\"text\"  name=\"subcode\" id=\"subcode\" placeholder=\"6th subject\">\n");
      out.write("                                </td>\n");
      out.write("                                 </tr>-->\n");
      out.write("                            </table></br>\n");
      out.write("                            <button type=\"button\" id=\"next\" class=\"w3-button w3-theme w3-left\">confirm subjects</button>\n");
      out.write("<!--                        </form></br>-->\n");
      out.write("                    </div></br>\n");
      out.write("\n");
      out.write("                    <div class=\"w3-card-4\">\n");
      out.write("                        <div class=\"w3-container w3-blue\">\n");
      out.write("                            <h2>Electives</h2>\n");
      out.write("                        </div></br></br>\n");
      out.write("<!--                        <form class=\"w3-container\" action=\"/action_page.php\">-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"w3-row-padding\">\n");
      out.write("                                <div class=\"w3-col m1\">\n");
      out.write("                                    <label class=\"w3-text-blue\">Elective-1</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-col m4\">\n");
      out.write("                                    <select class=\"w3-select w3-border w3-blue\" name=\"option\" style=\"border-radius: 12px;\">\n");
      out.write("                                        <option value=\"\" disabled selected>Choose Elective</option>\n");
      out.write("                                        ");

                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
                                                st = con.createStatement();

                                                String query = "select * from subject where length(subject_id)=7 and subject_id like '%" + (request.getParameter("sem") + "5") + "%' and sem = 5";
                                                System.out.println(query);
                                                rs = st.executeQuery(query);

                                                while (rs.next()) {

                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print( rs.getInt("subject_id"));
      out.write('"');
      out.write('>');
      out.print( rs.getString("name"));
      out.write("</option>\n");
      out.write("                                        <!--                                                <option value=\"2\">Option 2</option>\n");
      out.write("                                                                                          <option value=\"3\">Option 3</option>-->\n");
      out.write("                                        ");
}
                                            } catch (Exception e) {
                                                System.out.print(e);
                                            }
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-col m2\">\n");
      out.write("                                    <h2></h2>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-col m1\">\n");
      out.write("                                    <label class=\"w3-text-blue\">Elective-2</label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"w3-col m4\">\n");
      out.write("                                    <select class=\"w3-select w3-border w3-blue\" name=\"option\" style=\"border-radius: 12px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <option value=\"\" disabled selected>Choose Elective</option>\n");
      out.write("                                        ");

                                            try {
                                                Class.forName("com.mysql.jdbc.Driver");
                                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
                                                st = con.createStatement();

                                                String query = "select * from subject where length(subject_id)=7 and subject_id like '%" + (request.getParameter("sem") + "6") + "%' and sem = 5";
                                                System.out.println(query);
                                                rs = st.executeQuery(query);

                                                while (rs.next()) {

                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        <option value=\"");
      out.print( rs.getInt("subject_id"));
      out.write('"');
      out.write('>');
      out.print( rs.getString("name"));
      out.write("</option>\n");
      out.write("                                       \n");
      out.write("\n");
      out.write("                                        ");
                                               }
                                            } catch (Exception e) {
                                                System.out.print(e);
                                            }
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div></br>\n");
      out.write("                        <!--</form>-->\n");
      out.write("                    </div></br>\n");
      out.write("\n");
      out.write("                   \n");
      out.write("                    <p><a href='' onclick=\"callServlet()\" id=\"submit\" class=\"w3-btn w3-blue w3-right\">Submit</a></p></br>\n");
      out.write("                </div>\n");
      out.write("            </div></br>\n");
      out.write("        </div>\n");
      out.write("    <!--</form>-->\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer class=\"w3-container w3-theme-d3 w3-padding-16\">\n");
      out.write("            <h5>Footer</h5>\n");
      out.write("        </footer>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function callServlet(){\n");
      out.write("                var branch = $('#branch').val();\n");
      out.write("                var sem = $('#sem').val();\n");
      out.write("                var usn = $('#usn').val();\n");
      out.write("                var scheme = $('#scheme').val();\n");
      out.write("                var url = \"next?branch=\"+branch+\"&sem=\"+sem+\"&usn=\"+usn+\"&scheme=\"+scheme;\n");
      out.write("                $('#submit').attr('href', url);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </body>\n");
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
