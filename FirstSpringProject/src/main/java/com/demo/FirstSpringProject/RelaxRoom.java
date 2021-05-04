package com.demo.FirstSpringProject;

import org.springframework.stereotype.Component;

@Component

public class RelaxRoom implements ExtraRoom {
	
	public void PentHouseRoom() {
		System.out.println(" relaxroom object called");
	}
	
	public void roomName() {
		System.out.println("RelaxRoom called");		
	}
	
	

}
