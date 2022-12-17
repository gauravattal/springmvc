package springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import Service.UserService;
import entity.user;

@Controller
public class maincontroller {
	
	@Autowired
	public UserService userservice;

	
	@RequestMapping("/contact")
	public String showform()
	{    
		
		/*
		 * String s = "khjghg"; int i = Integer.parseInt(s);
		 * System.out.println(s.length());
		 */
		 return "contact";
	}
	
	/*
	 * @RequestMapping(path="/processform",method = RequestMethod.POST) public
	 * String handleform(HttpServletRequest request) { String email =
	 * request.getParameter("email"); System.out.println(email); String password =
	 * request.getParameter("password"); System.out.println(password); return
	 * "Success"; }
	 */
	
	/*
	 * @RequestMapping(path="/processform",method = RequestMethod.POST) public
	 * String handleform(@RequestParam("email") String email,@RequestParam String
	 * password,Model model) { System.out.println(email);
	 * System.out.println(password);
	 * 
	 * model.addAttribute("email"); model.addAttribute("password");
	 * 
	 * return "Success"; }
	 */
	
	
	@RequestMapping(path="/processform",method = RequestMethod.POST)
	public String handleform(@ModelAttribute user user , Model Model)
	{
		
	 userservice.save(user);
     return "Success";
		}
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionhandler()
	{
		return "null_page";
	}
	
	
	@ExceptionHandler(value = NumberFormatException.class)
	public String numberformatexceptionhandler()
	{
		System.out.println("number format exception");
		return "null_page";
	}
}
