package com.manager;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ManagerInsertDtlServlet
 */
@WebServlet("/insertDtl")
public class ManagerInsertDtlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mname = request.getParameter("mname");
		String mpno = request.getParameter("pnum");
		String maddress = request.getParameter("add");
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		boolean success;
		
		success = ManagerDB.insertMgrDetails(0, mname, mpno, maddress, username, password);
		
		if(success == true) {
			RequestDispatcher rd = request.getRequestDispatcher("manageraccount.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd2 = request.getRequestDispatcher("manageraccount.jsp");
			rd2.forward(request, response);
		}
	}

}

