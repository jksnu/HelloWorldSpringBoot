package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
	private int techId;
	private int techName;
	
	public int getTechId() {
		return techId;
	}
	public void setTechId(int techId) {
		this.techId = techId;
	}
	public int getTechName() {
		return techName;
	}
	public void setTechName(int techName) {
		this.techName = techName;
	}
	public void display() {
		System.out.println("This is Technology class object");
	}
	
}
