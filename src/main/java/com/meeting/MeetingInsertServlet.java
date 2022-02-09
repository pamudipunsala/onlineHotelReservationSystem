package com.meeting;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class MeetingInsertServlet
 */
@WebServlet("/arrange")
public class MeetingInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mtid = request.getParameter("mtid");
		String mpcode = request.getParameter("mpcode");
		String dt = request.getParameter("dt");
		String tm = request.getParameter("tm");
		
		boolean success;
		
		success = MeetingDB.insertMeetingDtl(mtid, mpcode, dt, tm);
		
		if(success == true) {
			RequestDispatcher rd = request.getRequestDispatcher("meetingaccount.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher rd2 = request.getRequestDispatcher("meetingaccount.jsp");
			rd2.forward(request, response);
		}
	}

}
