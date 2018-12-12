package escort;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")


public class AdminController {
	
	@RequestMapping(method = RequestMethod.POST, value = "/users" )
	@ResponseBody
		public String createUser(@RequestBody String user) {
			System.out.println("Adding user" +user);
			return "created";
	}

}
