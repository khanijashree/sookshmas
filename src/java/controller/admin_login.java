/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Admin_Login;

/**
 *
 * @author user
 */
@WebServlet(name = "admin_login", urlPatterns = {"/admin_login"})
public class admin_login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        //HttpSession session = null;
                Admin_Login reg = new Admin_Login(session);
                
        

          try
            {  
              
               
                                // public String getParameter(String name):is used to obtain the value of a parameter by name
              //  String usn = request.getParameter("usn");
                String name = request.getParameter("name");
                
                
//                int admin_id = Integer.parseInt(request.getParameter("admin_id"));
               // String scheme = request.getParameter("scheme");
//                String phone = request.getParameter("phone");
//                String email  = request.getParameter("email");
//                String pw = request.getParameter("pw");
////              
                        if (request.getParameter("admin_login") != null) {
                String email = request.getParameter("email");
                String pw = request.getParameter("pw");
                String status = reg.admin_login(email, pw);
                if (status.equals("success")) {
                     request.setAttribute("status", "Login success");
                    RequestDispatcher rd1 = request.getRequestDispatcher("admin_home.jsp");

                    rd1.forward(request, response);

                } else if (status.equals("failure")) {
                    request.setAttribute("status", "Login failed");
                    RequestDispatcher rd1 = request.getRequestDispatcher("admin_login.jsp");
                    rd1.forward(request, response);
                }
                        
            } else if (request.getParameter("logout") != null) {
                session.invalidate();
                RequestDispatcher rd1 = request.getRequestDispatcher("index.jsp");
                rd1.forward(request, response);
            } 
        } 
catch (Exception e) {
            e.printStackTrace();
        }

    }

   
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static class session {

        private static void invalidate() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public session() {
        }
    }

}


