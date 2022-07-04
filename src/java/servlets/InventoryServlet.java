
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import models.HomeItem;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InventoryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        String path = getServletContext().getRealPath("/WEB-INF/homeitems.txt");
        
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        String itemInfo = br.readLine();
        
        String[] columns = itemInfo.split("\t");
        String category = columns[0];
        String item = columns[1];
        String priceString = columns[2];
        int price = Integer.parseInt(priceString);
        

        HomeItem newItem = new HomeItem(category, item, price);
        request.setAttribute("newItem", newItem);
        
        getServletContext().getRequestDispatcher("/WEB-INF/inventory.jsp").forward(request, response);
   
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String category = request.getParameter("title");
        String item = request.getParameter("contents");
        String priceString = request.getParameter("priceString");
        int price = Integer.parseInt(priceString);
        
        String path = getServletContext().getRealPath("/WEB-INF/homeitems.txt");
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));
        
        pw.println(category + " ," + item + " ," + price);
        pw.close();       
 
        HomeItem newItem = new HomeItem(category, item, price);
        request.setAttribute("newItem", newItem);
        getServletContext().getRequestDispatcher("/WEB-INF/inventory.jsp").forward(request, response);

    }

}