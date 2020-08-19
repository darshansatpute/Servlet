package com.darshan.assi2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Name
 */
@WebServlet("/Name")
public class Name extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		String nameUp=name.toLowerCase();
		String nameLow=name.toUpperCase();
		
		System.out.println("Original name :"+name);
		System.out.println("Uppercase :"+nameUp);
		System.out.println("LowerCase: "+nameLow);
		


}
}