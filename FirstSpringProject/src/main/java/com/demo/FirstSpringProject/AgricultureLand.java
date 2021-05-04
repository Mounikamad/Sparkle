package com.demo.FirstSpringProject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") 
public class AgricultureLand implements Property {

  public void area() {
	  System.out.println("Agriculture Land");
  }
}
