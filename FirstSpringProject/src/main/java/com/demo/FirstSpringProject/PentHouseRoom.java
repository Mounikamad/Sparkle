package com.demo.FirstSpringProject;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@Primary
public class PentHouseRoom implements ExtraRoom {

	
public void PentHouseRoom() {
	System.out.println(" penthouse object called");
}
	public void roomName() {
		System.out.println("PentHouseRoom is Suhana");
		
	}

}
