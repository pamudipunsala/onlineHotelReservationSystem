package com.meeting;

public class Meeting {
	private String mtid;
	private String pcode;
	private String dt;
	private String tm;
	
	public Meeting(String mtid, String pcode, String dt, String time) {
		super();
		this.mtid = mtid;
		this.pcode = pcode;
		this.dt = dt;
		this.tm = time;
	}
	public String getMtid() {
		return mtid;
	}

	public String getPcode() {
		return pcode;
	}

	public String getDt() {
		return dt;
	}

	public String getTm() {
		return tm;
	}	
}
