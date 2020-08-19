package com.darshan.assi1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Math
 */
@WebServlet("/Math")
public class Math extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		int num1=Integer.parseInt(request.getParameter("number1"));
		int num2 =Integer.parseInt(request.getParameter("number2"));
		
		System.out.println("num1:"+num1 +"\nnum2:"+num2);
		 
		 calculation(num1,num2);
		//?number1=3&number2=5
		
	}
	
	private void calculation(int num1, int num2) {
		
		System.out.println("Addition of two numbers is     "+ (num1+num2));
		System.out.println("substarction is                "+ (num1-num2));
		System.out.println("Multiplication is              "+(num1*num2));
		System.out.println("Division is                    "+ (num1/num2));
		
	}

	
	
}
