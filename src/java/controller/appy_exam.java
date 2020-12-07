/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.apply_exam_model;
import model.getSubjectsToForm;
import model.subjects;
import model.uploadmessage;

/**
 *
 * @author user
 */
@WebServlet(name = "next", urlPatterns = {"/next"})
public class appy_exam extends HttpServlet {
    
      
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
         
        HttpSession session = request.getSession();
           
        try {
//           int id = (int) session.getAttribute("id");
//           apply_exam_model umsg = new apply_exam_model(session);
//            System.out.println(request.getParameter("next"));
//           if(request.getParameter("next")!=null){
//               
//               String status = umsg.exam(request.getParameter("usn"),request.getParameter("sem"),Integer.parseInt(request.getParameter("branch")),Integer.parseInt(request.getParameter("scheme")));
//               System.out.println(status);
//               
//               if(status=="success")
////               request.getRequestDispatcher("admin_home.jsp").forward(request, response);// 
//                   request.setAttribute("status", "posted successfully");
//                   response.sendRedirect("admin_home.jsp"); 
//           }
apply_exam_model model = new apply_exam_model(request.getSession());
if(request.getParameter("submit") != null){
    String usn= request.getParameter("usn");
                int sem = Integer.parseInt(request.getParameter("sem"));
                int branch_id = Integer.parseInt(request.getParameter("branch"));
                int scheme= Integer.parseInt(request.getParameter("scheme"));
                System.out.println(branch_id);
                model.exam(usn, sem,branch_id, scheme);
}
               
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
