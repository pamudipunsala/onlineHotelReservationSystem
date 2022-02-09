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
 * Servlet implementation class UpdateManagerServlet
 */
@WebServlet("/updateDtl")
public class UpdateManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String mid = request.getParameter("mid");
		String mname = request.getParameter("mname");
		String mphone = request.getParameter("pnum");
		String maddress = request.getParameter("add");
		String musername = request.getParameter("uname");
		String mpassword = request.getParameter("pwd");
		
		boolean success;
		
		success = ManagerDB.updateMagrDtl(mid, mname, mphone, maddress, musername, mpassword);
		
		if(success == true) {
			List<Manager> mDtl = ManagerDB.getManagerDtl(mid);
			request.setAttribute("mDtl", mDtl);
			
			RequestDispatcher rd = request.getRequestDispatcher("manageraccount.jsp");
			rd.forward(request, response);
		}
		else {
			List<Manager> mDtl = ManagerDB.getManagerDtl(mid);
			request.setAttribute("mDtl", mDtl);
			
			RequestDispatcher rd2 = request.getRequestDispatcher("manageraccount.jsp");
			rd2.forward(request, response);
		}
	}

}
