package com.helloexample.HelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloWorldTest {
	@RequestMapping("/")
	@ResponseBody
 public String home(){
	 return "Hello World from Spring Boot";
 
	}
	@RequestMapping("/mounika")
	@ResponseBody
 public String hello(){
	 return "Hello Mounika! Welcome";
 }

}
