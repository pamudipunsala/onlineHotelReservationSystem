package com.manager;

public class Manager {
	private int mid;
	private String mName;
	private String mpnumber;
	private String maddress;
	private String userName;
	private String password;
	
	public Manager(int mid, String mName, String mpnumber, String maddress, String userName, String password) {
		this.mid = mid;
		this.mName = mName;
		this.mpnumber = mpnumber;
		this.maddress = maddress;
		this.userName = userName;
		this.password = password;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getMpnumber() {
		return mpnumber;
	}

	public void setMpnumber(String mpnumber) {
		this.mpnumber = mpnumber;
	}

	public String getMaddress() {
		return maddress;
	}

	public void setMaddress(String maddress) {
		this.maddress = maddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
