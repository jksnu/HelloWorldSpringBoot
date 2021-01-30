package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseCustomer {
	@Id
	private String cid;	
	private String cname;
	private String cemail;
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	@Override
	public String toString() {
		return "CourseCustomer [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + "]";
	}
}
