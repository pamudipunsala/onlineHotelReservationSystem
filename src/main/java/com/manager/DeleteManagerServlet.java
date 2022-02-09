package com.manager;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteManagerServlet
 */
@WebServlet("/deleteDtl")
public class DeleteManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("mid");
		boolean success;
		
		success = ManagerDB.deleteManager(id);
		
		if(success == true) {
			RequestDispatcher rd = request.getRequestDispatcher("managerinsertdetails.jsp");
			rd.forward(request, response);
		}
		else {
			List<Manager> mDtl = ManagerDB.getManagerDtl(id);
			request.setAttribute("mDtl", mDtl);
			
			RequestDispatcher rd = request.getRequestDispatcher("manageraccount.jsp");
			rd.forward(request, response);
		}
	}

}
