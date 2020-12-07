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
import model.Faculty_Registration;


@WebServlet(name = "faculty_register", urlPatterns = {"/faculty_register"})
public class faculty_register extends HttpServlet {

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
        //HttpSession session = request.getSession();
        Faculty_Registration reg = new Faculty_Registration(session);
                
        
        try  {
            
            if (request.getParameter("register") != null) 
            { 
                String fac_id = request.getParameter("fac_id");
                String name = request.getParameter("name");
                String email  = request.getParameter("email");
                String branch = request.getParameter("branch");
                String phone = request.getParameter("phone");
                String pw = request.getParameter("pw");
                String cp = request.getParameter("cp");
               
                if (pw.equals(cp)) 
                {
                    String status = reg.Faculty_Registration(fac_id,name,email,branch,phone,pw);

                    if (status.equals("existed")) {
                        
                        request.setAttribute("status", "Existed record");
                    
                        RequestDispatcher rd1 = request.getRequestDispatcher("faculty_login.jsp" );
                        rd1.forward(request, response);
                  
                    } else if (status.equals("success")) {
                        System.out.println("Successful registered");
                        request.setAttribute("status", "Successfully Registered");
                        
                         RequestDispatcher rd1 = request.getRequestDispatcher("faculty_login.jsp" );
                        rd1.forward(request, response);
                    } else if (status.equals("failure")) {
                             request.setAttribute("status", "Registration failed");
                         RequestDispatcher rd1 = request.getRequestDispatcher("faculty_register.jsp" );
                        rd1.forward(request, response);
                    }
                    
                }

            }else if (request.getParameter("faculty_login") != null) {
                String email = request.getParameter("email");
                String pw = request.getParameter("pw");
                String status = reg.faculty_login(email, pw);
                if (status.equals("success")) {
                     request.setAttribute("status", "Login success");
                    RequestDispatcher rd1 = request.getRequestDispatcher("Faculty_home.jsp");

                    rd1.forward(request, response);

                } else if (status.equals("failure")) {
                    request.setAttribute("status", "Login failed");
                    RequestDispatcher rd1 = request.getRequestDispatcher("faculty_login.jsp");
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

    
}
