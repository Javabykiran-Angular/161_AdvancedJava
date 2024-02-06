package com.tka.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		///System.out.println("U in do get Method");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		System.out.println("U r in do Post method...");
		
		String username= request.getParameter("username");
		System.out.println("Username is  "+username);
		
		String password= request.getParameter("password");
		
		System.out.println("Password is  "+password);
		
		StudentDao dao=new StudentDao();
		
		Student s= dao.checkUser(username, password);
		
		PrintWriter pw= response.getWriter();
		
		if(s!=null) {
			System.out.println("Valid User...");
			
			pw.print("Valid User...");
			
		}else {
			System.out.println("Invalid User...");
			pw.print("Invalid User...");
		}
		
		pw.close();
		
		
		
	}

}
