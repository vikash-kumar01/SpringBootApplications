package com.rockstar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

     @RequestMapping("/test")
     @ResponseBody
	 public String handleTest(){
		 
		return "My First Project using STS" ; 
	 }
}