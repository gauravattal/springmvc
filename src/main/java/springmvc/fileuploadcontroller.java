package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class fileuploadcontroller {

	@RequestMapping("/upload")
	public String showuploadfile()
	{
		return "fileform";
	}
	
	
	@RequestMapping(value ="/uploadfile",method = RequestMethod.POST)
	 public String fileupload(@RequestParam(" ") CommonsMultipartFile file)
	 {
		 
		 System.out.println("file upload handler");
		  System.out.println(file.getName());
		  System.out.println(file.getOriginalFilename());
		  System.out.println(file.getSize());
		  System.out.println(file.getContentType());
		 
		 
		
		return "filesuccess";
	 }
	
	
	
}
