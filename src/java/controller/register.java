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
import model.Registration;
import model.Registration.status;
import model.student;

/**
 *
 * @author user
 */
@WebServlet(name = "register", urlPatterns = {"/register"})
public class register extends HttpServlet {

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
                Registration reg = new Registration(session);
                
        
        try  {
            
                        if (request.getParameter("register") != null) 
            {  
              
               
                                // public String getParameter(String name):is used to obtain the value of a parameter by name
                String usn = request.getParameter("usn");
                String name = request.getParameter("name");
                
                
                String branch = request.getParameter("branch");
                String scheme = request.getParameter("scheme");
                String phone = request.getParameter("phone");
                String email  = request.getParameter("email");
                String pw = request.getParameter("pw");
                String cp = request.getParameter("cp");
                
                
                if (pw.equals(cp)) 
                {
                    String status = reg.Registration(usn,name,branch,scheme,phone,email, pw);

                    if (status.equals("existed")) {
                        
                        request.setAttribute("status", "Existed record");
                    
                        RequestDispatcher rd1 = request.getRequestDispatcher("login.jsp" );
                        rd1.forward(request, response);
                  
                    } else if (status.equals("success")) {
                        System.out.println("Successful registered");
                        request.setAttribute("status", "Successfully Registered");
                        
                         RequestDispatcher rd1 = request.getRequestDispatcher("login.jsp" );
                        rd1.forward(request, response);
                    } else if (status.equals("failure")) {
                             request.setAttribute("status", "Registration failed");
                         RequestDispatcher rd1 = request.getRequestDispatcher("register.jsp" );
                        rd1.forward(request, response);
                    }
                    
            }

}
                        else if (request.getParameter("login") != null) {
                String email = request.getParameter("email");
                String pw = request.getParameter("pw");
                status status = reg.login(email, pw);
                if (status==Registration.status.success){
                     request.setAttribute("status", "Login success");
                    RequestDispatcher rd1 = request.getRequestDispatcher("student_home.jsp");

                    rd1.forward(request, response);

                } else if (status==Registration.status.failure) {
                    request.setAttribute("status", "Login failed");
                    RequestDispatcher rd1 = request.getRequestDispatcher("login.jsp");
                    rd1.forward(request, response);
                }
                        
            } else if (request.getParameter("logout") != null) {
                session.invalidate();
                RequestDispatcher rd1 = request.getRequestDispatcher("index.jsp");
                rd1.forward(request, response);
            } 
        } catch (Exception e) {
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

