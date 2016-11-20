package com.androidxu.Controller;

@Controller
public class HelloWorldController {
	
	/*request first goes to dispatcherServlet and it redirects to controller class. 
	Here @Controller depicts that this is our controller class. 
	@RequestMapper is used to map incoming http request to handler method(hello() 
	in above controller).
	So hello() method of HelloWorldController.java will 
	handle GET request from dispatcher
	*/
	@RequestMapping("/helloWorld")
	public ModelAndView Hello()
	{
		String HelloWorldMessage ="Hello World Spring!";
		return new ModelAndView("hello","World",HelloWorldMessage);
	}

}
