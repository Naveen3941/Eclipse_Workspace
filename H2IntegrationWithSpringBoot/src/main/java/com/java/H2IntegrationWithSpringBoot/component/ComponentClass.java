package com.java.H2IntegrationWithSpringBoot.component;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

//@Component
public class ComponentClass {
	
	public String  msg;
    
	
	public String getMsg() {
		return msg;
	}


	
	@Required
	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("+++++++++++++++++++"+msg);
	}




	


	

	/*public  ComponentClass() {
		System.out.println("constructor  in component.................");
	}
	
   @PostConstruct
	
	private void pauss() {
		System.out.println("Post Constructor in coponent.................");
	}*/
  

}
