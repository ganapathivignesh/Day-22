package com.src;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Retrievedata
 */
public class Retrievedata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Retrievedata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   response.setContentType("text/html");
		   PrintWriter out = response.getWriter();
		   try {
			Class.forName("com.mysql.jdbc.Driver");
			
			 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","psgvicky");
			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery("select * from t1");
			  while(rs.next())
			  {
				  out.println("uname:"+rs.getString("uname"));
				  out.println("pwd:"+rs.getString("pwd"));
				  out.println("email:"+rs.getString("mail"));
				  out.println("mob:"+rs.getString("mob"));
			  }
			  rs.close();
		         stmt.close();
		         con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
