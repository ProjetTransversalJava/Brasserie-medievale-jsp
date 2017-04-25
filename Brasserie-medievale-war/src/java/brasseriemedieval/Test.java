/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brasseriemedieval;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author daky
 */
public class Test extends HttpServlet {
    
    Article testArticle = new Article("12", "article", "24");
    
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{     
	       
        request.setAttribute("prix", testArticle.getPrix());
        request.setAttribute("id", testArticle.getIdArticle());
        request.setAttribute("article", testArticle.getNomArticle());
        request.setAttribute("parametre",request.getParameter("parametre"));
        
        this.getServletContext().getRequestDispatcher( "/WEB-INF/index.jsp" ).forward( request, response );
    }
}


