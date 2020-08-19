package com.darshan.assi3;

import java.io.IOException;
import java.math.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Number")
public class Number extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num=Integer.parseInt(request.getParameter("number"));
		System.out.println("number is:"+num);
		
		      calculations(num);
		
			}


	private void calculations(int num) {
		
		System.out.println("Squre of number is"+(num*num));
		System.out.println("qube of number is"+(num*num*num));
		System.out.println("Table of"+ num+"as follow");
		int i=1;
		while(i<=10)
		{
			System.out.println(i*num);
			i++;
		}
		
			
	}
}
