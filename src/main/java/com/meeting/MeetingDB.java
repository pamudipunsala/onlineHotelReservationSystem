package com.meeting;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.manager.DBConnect;

public class MeetingDB {
	private static boolean success; 
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	
	public static List<Meeting> validate(String mtid, String pcode){		
		ArrayList <Meeting> mt = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from meetingdetails where meetingid='"+mtid+"' and meetingpcode='"+pcode+"'";
			rs = st.executeQuery(sql);
			
			if(rs.next()) {
				String id = rs.getString(1);
				String pcd = rs.getString(2);
				String dt = rs.getString(3);
				String tm = rs.getString(4);				
			
				Meeting m = new Meeting(id, pcd, dt, tm);
				mt.add(m);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return mt;
	}
	
	public static boolean insertMeetingDtl(String mtid, String mpcd, String dt, String tm) {
		
		boolean success = false;
			
		try {
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "insert into meetingdetails values('"+mtid+"', '"+mpcd+"', '"+dt+"', '"+tm+"')";
			int rs = st.executeUpdate(sql);
				
			if(rs > 0) {
				success = true;
			}
			else {
				success = false;
			}
				
		}catch(Exception e) {
				e.printStackTrace();
		}
			
		return success;
	}
	
	public static boolean updateMeetingDtl(String mtid, String mpcd, String dt, String tm) {
		
		try {
		
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "update meetingdetails set meetingid='"+mtid+"', meetingpcode='"+mpcd+"', date='"+dt+"', time= '"+tm+"'"+"where meetingid='"+mtid+"'";
			int rs = st.executeUpdate(sql);
			
			if(rs > 0) {
				success = true;
			}
			else {
				success = false;
			}
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return success;
	}

	public static List<Meeting> getMeetingDtl(String mtid){
		ArrayList<Meeting> mt = new ArrayList<>();
	
		try {
		
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from meetingdetails where meetingid='"+mtid+"'";
			rs = st.executeQuery(sql);
		
			while(rs.next()) {
				String id = rs.getString(1);
				String pcode = rs.getString(2);
				String date = rs.getString(3);
				String time = rs.getString(4);
			
				Meeting m = new Meeting(id, pcode, date, time);
				mt.add(m);
			}			
		}catch(Exception e){
			e.printStackTrace();
		}
		return mt;
	}
	
	public static boolean deleteMeeting(String mtid) {
		
		try {
			
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "delete from meetingdetails where meetingid='"+mtid+"'";
			int rs = st.executeUpdate(sql);
			
			if(rs > 0) {
				success = true;
			}
			else {
				success = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return success;
	}
}
