package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index() {
		return "HELLO WORLD!!! GOT EDITED !!! YOU CAN'T SEE ME NOW :) \n Told You na LOL !!!";
	}
	
}
