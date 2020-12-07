
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
import model.student;

@WebServlet(name = "update", urlPatterns = {"/update"})
public class update extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        try {
            if (session.getAttribute("uname") != null && request.getParameter("submit") != null) {
                String name = request.getParameter("name");
                String branch = request.getParameter(" branch");
                
                String phone= request.getParameter("phone");
                String email = request.getParameter("email");
                String pw = request.getParameter("pw");
                
                student u = new student(session);
                
                String status = u.update(name,branch, phone, email,pw);
                if (status.equals("success")) {
                    request.setAttribute("status", "Profile successfully Updated");
                    RequestDispatcher rd1 = request.getRequestDispatcher("student_home.jsp");
                    rd1.forward(request, response);
                } else {
                    request.setAttribute("status", "Updation failure");
                    RequestDispatcher rd1 = request.getRequestDispatcher("EditForm.jsp");
                    rd1.forward(request, response);
                }
            }
        } catch (Exception e) {

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

}
