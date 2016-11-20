package com.androidxu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	/*request first goes to dispatcherServlet and it redirects to controller class. 
	Here @Controller depicts that this is our controller class. 
	@RequestMapper is used to map incoming http request to handler method(hello() 
	in above controller).
	So hello() method of HelloWorldController.java will 
	handle GET request from dispatcher
	*/
	
	@RequestMapping("/helloworld")
	public ModelAndView Hello()
	{
		System.out.print("Hello World");
		String HelloWorldMessage ="Hello World Spring!";
		return new ModelAndView("hello","message",HelloWorldMessage);
	}

}
