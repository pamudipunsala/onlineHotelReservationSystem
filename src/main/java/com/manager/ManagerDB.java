package com.manager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ManagerDB {
	private static boolean success; 
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	public static List<Manager> validate(String m_username, String m_password){
		
		ArrayList <Manager> mg = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from managerdetails where m_username='"+m_username+"' and m_password='"+m_password+"'";
			rs = st.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String address = rs.getString(4);
				String username = rs.getString(5);
				String pwd = rs.getString(6);				
			
				Manager m = new Manager(id, name, phone, address, username, pwd);
				mg.add(m);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return mg;
	}
	
	public static boolean insertMgrDetails(int mid, String mname, String mpnumber, String maddress, String userName, String pwd) {
			
		boolean success = false;
			
		try {
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "insert into managerdetails values(0, '"+mname+"', '"+mpnumber+"', '"+maddress+"', '"+userName+"', '"+pwd+"')";
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
	
	public static boolean updateMagrDtl(String mid, String mname, String mpnumber, String maddress, String userName, String pwd) {
		
		try {
		
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "update managerdetails set m_name='"+mname+"', m_pnum='"+mpnumber+"', m_address='"+maddress+"', m_username= '"+userName+"', m_password= '"+pwd+"'"+"where m_id='"+mid+"'";
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
	
	public static List<Manager> getManagerDtl(String id){
		int cid = Integer.parseInt(id);
		ArrayList<Manager> mg = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "select * from managerdetails where m_id='"+cid+"'";
			rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int mid = rs.getInt(1);
				String mname = rs.getString(2);
				String mphone = rs.getString(3);
				String maddress = rs.getString(4);
				String muserName = rs.getString(5);
				String mpassword = rs.getString(6);
				
				Manager m = new Manager(mid, mname, mphone, maddress, muserName, mpassword);
				mg.add(m);
			}			
		}catch(Exception e){
			e.printStackTrace();
		}
		return mg;
	}
	
	public static boolean deleteManager(String mid) {
		
		int id = Integer.parseInt(mid);
		
		try {
			
			con = DBConnect.getConnection();
			st = con.createStatement();
			String sql = "delete from managerdetails where m_id='"+id+"'";
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
