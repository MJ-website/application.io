package com.academy;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ApplicationServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String fullname = request.getParameter("fullname");
        String dob = request.getParameter("dob");
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        String email = request.getParameter("email");
        
        String parentName = request.getParameter("parentName");
        String relationship = request.getParameter("relationship");
        String parentContact = request.getParameter("parentContact");

        String experience = request.getParameter("experience");
        String clubName = request.getParameter("clubName");
        String role = request.getParameter("role");
        String battingStyle = request.getParameter("battingStyle");
        String bowlingStyle = request.getParameter("bowlingStyle");

        String medical = request.getParameter("medical");
        String emergencyContact = request.getParameter("emergencyContact");

        String applicantSign = request.getParameter("applicantSign");
        String date = request.getParameter("date");
        String guardianSign = request.getParameter("guardianSign");

        out.println("<html><body>");
        out.println("<h1>Application Submitted Successfully!</h1>");
        out.println("<h3>Applicant: " + fullname + "</h3>");
        out.println("<p>Thank you for applying to our Cricket Academy. We will contact you soon.</p>");
        out.println("</body></html>");
    }
}
