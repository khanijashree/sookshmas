package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin_header.jsp");
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\">\n");
      out.write("        <script type = \"text/javascript\" src = \"https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" >\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        ul {\n");
      out.write("            list-style-type: none;\n");
      out.write("            /*width:100%;*/\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 10px;\n");
      out.write("            overflow: hidden;\n");
      out.write("            background-color: #123969;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        li {\n");
      out.write("            float: right;\n");
      out.write("        }\n");
      out.write("        li a {\n");
      out.write("            display: block;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 14px 16px;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        li a:hover {\n");
      out.write("            background-color: #111;\n");
      out.write("        }\n");
      out.write("        .uname{\n");
      out.write("            margin-top: 14px;\n");
      out.write("            color: white;\n");
      out.write("            margin-right: 10px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("     </head>\n");
      out.write("    <body style=\"margin: 0;\">\n");
      out.write("       \n");
      out.write("        <ul>\n");
      out.write("<!--           \n");
      out.write("\n");
      out.write("            <li><a href=\"register?logout=yes\">Logout</a></li>\n");
      out.write("            <li><a href=\"EditForm.jsp\">Edit</a></li>\n");
      out.write("               \n");
      out.write("            <li><a href=\"DeleteUser.jsp\">Delete</a></li>-->\n");
      out.write("<!--            <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("            -->\n");
      out.write("            <li><a href=\"admin_login.jsp\">Login</a></li>\n");
      out.write("        \n");
      out.write("            <li><a class=\"active\" href=\"home.jsp\">Home</a></li>\n");
      out.write("            <li style=\"float:left\"><img src=\"images/maillogo.jpg\"></li>\n");
      out.write("        </ul>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            jQuery.validator.addMethod(\"checkemail\", function(value, element) {\n");
      out.write("                return /^(([^<>()[\\]\\\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/.test(value) || /^[0-9]{10}$/.test(value);\n");
      out.write("            }, \"Please enter the email format as abc@gmail.com\");\n");
      out.write("\n");
      out.write("            jQuery(document).ready(function($) {\n");
      out.write("                $(\"#login\").validate({\n");
      out.write("                    rules: {\n");
      out.write("                        email: {\n");
      out.write("                            required: true,\n");
      out.write("                            checkemail: true\n");
      out.write("                        },\n");
      out.write("                        pw: {\n");
      out.write("                            required: true,\n");
      out.write("                            minlength: 6\n");
      out.write("                        },\n");
      out.write("                    },\n");
      out.write("                    messages: {\n");
      out.write("                        email: {\n");
      out.write("                            required: \"Please enter the email.\",\n");
      out.write("                        },\n");
      out.write("                        pw: {\n");
      out.write("                            required: \"Please enter the password.\",\n");
      out.write("                            minlength: \"Please enter the password greater than or equal to 6.\",\n");
      out.write("                        },\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            .error{\n");
      out.write("                color:red;\n");
      out.write("            }\n");
      out.write("            .button{\n");
      out.write("                padding: 5px;\n");
      out.write("                width: 6%;\n");
      out.write("                background: cornflowerblue;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #msg\n");
      out.write("            {\n");
      out.write("                background: green;\n");
      out.write("                color:black;\n");
      out.write("                border: 1px solid green;\n");
      out.write("                width:24%;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 25px;\n");
      out.write("                padding: 5px;\n");
      out.write("            }\n");
      out.write("            td input{\n");
      out.write("                display:block;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("\n");
      out.write("        ");
 if (request.getAttribute("status") != null) {
      out.write("\n");
      out.write("        <div id=\"msg\">  ");
      out.print( request.getAttribute("status"));
      out.write("</div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("        <form method=\"POST\" id=\"login\" action=\"admin_login\">\n");
      out.write("            <font color=\"blue\" size=\"4\">\n");
      out.write("            <h2> Login  </h2>\n");
      out.write("            </font>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"container \">\n");
      out.write("                <div class=\"form-group col-md-4\">\n");
      out.write("                    <label >Email address</label>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" placeholder=\"Enter email\"  name=\"email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-4\">\n");
      out.write("                    <label >Password</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\"  placeholder=\"Enter Password\" name=\"pw\">\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" name=\"admin_login\">Submit</button>\n");
      out.write("                <div style=\"text-align: center; margin-top: 15px;\">\n");
      out.write("                    <a href=\"forgotpass.jsp\">Forgot password?</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("<footer class=\"w3-container w3-theme-d3 w3-padding-16\" style=\" position: fixed; height:10%;left: 0; bottom:0; width: 100%; background-color: #123969; color: white;text-align: center; \">  \n");
      out.write("    <p> Jain institute of technology , Davanagere</p>\n");
      out.write("</footer>         \n");
      out.write("           \n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
