package com.src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form1
 */
public class Form1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<form action=\"./form2\" method=\"get\">\r\n" + 
				"username : "+request.getParameter("uname")+"<input type=\"hidden\" name=\"uname\" value="+request.getParameter("uname")+"/><br>\r\n" + 
				"password : "+request.getParameter("pwd")+"<input type=\"hidden\" name=\"pwd\" value="+request.getParameter("pwd")+"/><br>\r\n" + 
				"emailid : "+request.getParameter("email")+"<input type=\"hidden\" name=\"emid\" value="+request.getParameter("emid")+"/><br>\r\n" + 
				"mobileno : "+request.getParameter("mob")+"<input type=\"hidden\" name=\"mob\" value="+request.getParameter("mob")+"><br>\r\n" + 
				"<input type=\"submit\" value=\"confirm\"/>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</form>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
