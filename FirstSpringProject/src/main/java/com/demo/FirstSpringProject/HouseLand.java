package com.demo.FirstSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HouseLand implements Property{
	
	@Autowired
	ExtraRoom room;
	
	public HouseLand() {
		System.out.println(" houseland object called");
	}
	

	public void area() {
		System.out.println("Land Area");
		room.roomName();
	} 
}
