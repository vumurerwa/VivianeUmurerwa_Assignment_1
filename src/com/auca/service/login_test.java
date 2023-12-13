package com.auca.service;

import java.io.IOException;
import java.net.http.HttpResponse;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class login_test extends HttpServlet {
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) {
	    String username, password;
	    username = req.getParameter("username");
	    password = req.getParameter("password");

	    try {
	    if (!("admin".equals(username) && "admin".equals(password))) {
	        // Redirect to Forgot Password page
	        
				res.sendRedirect("forgot_password.html");
			
	    } else {
	        // Successful login logic
	        // redirect to a welcome page
	        res.sendRedirect("welcome.html");
	    	}
	    } catch (IOException e) {
			e.printStackTrace();
		}
	}


}
