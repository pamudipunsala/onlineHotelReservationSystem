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
 * Servlet implementation class MeetingUpdateServlet
 */
@WebServlet("/update")
public class MeetingUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("mtid");
		String code = request.getParameter("mpcode");
		String date = request.getParameter("dt");
		String time = request.getParameter("tm");
		
		boolean success;
		
		success = MeetingDB.updateMeetingDtl(id, code, date, time);
		
		if(success == true) {
			List<Meeting> meetingdtl = MeetingDB.getMeetingDtl(id);
			request.setAttribute("meetingdtl", meetingdtl);
			
			RequestDispatcher rd = request.getRequestDispatcher("meetingaccount.jsp");
			rd.forward(request, response);
		}
		else {
			List<Meeting> meetingdtl = MeetingDB.getMeetingDtl(id);
			request.setAttribute("meetingdtl", meetingdtl);
			
			RequestDispatcher rd2 = request.getRequestDispatcher("meetingaccount.jsp");
			rd2.forward(request, response);
		}
	}

}
