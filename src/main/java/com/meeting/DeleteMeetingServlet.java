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
 * Servlet implementation class DeleteMeetingServlet
 */
@WebServlet("/delete")
public class DeleteMeetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		boolean success;
		
		success = MeetingDB.deleteMeeting(id);
		
		if(success == true) {
			RequestDispatcher rd = request.getRequestDispatcher("meetinginsertdtl.jsp");
			rd.forward(request, response);
		}
		else {
			List<Meeting> meetingdtl = MeetingDB.getMeetingDtl(id);
			request.setAttribute("meetingdtl", meetingdtl);
			
			RequestDispatcher rd = request.getRequestDispatcher("meetinginsertdtl.jsp");
			rd.forward(request, response);
		}
	}

}
