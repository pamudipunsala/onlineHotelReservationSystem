package com.meeting;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MeetingServlet
 */
@WebServlet("/view")
public class MeetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mtid = request.getParameter("mtid");
		String pcode = request.getParameter("pcd");
		
		try {
		List<Meeting> meetingdtl = MeetingDB.validate(mtid, pcode);
		request.setAttribute("meetingdtl", meetingdtl);
		}
		catch(Exception e){
			e.getStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("meetingaccount.jsp");
		rd.forward(request, response);
	}

}
