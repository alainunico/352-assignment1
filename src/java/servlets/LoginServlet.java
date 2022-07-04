/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alain Unico
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
     HttpSession session = request.getSession();
     
     if(request.getParameter("logout") != null){
         session.invalidate();
         request.setAttribute("message", "You have been successfully logged out.");
     } else{
         if(session.getAttribute("username") != null){
             response.sendRedirect("inventory");
             return;
         }
     }
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
    }
     
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");
     
        if(!userName.isEmpty() && !passWord.isEmpty() ){
                session.setAttribute("username", userName);
                response.sendRedirect("inventory");
                return;
}       else{
           request.setAttribute("message", "Please input valid credentials."); 
        }   
    
    getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    return;
    }
   
    
    
    

}

