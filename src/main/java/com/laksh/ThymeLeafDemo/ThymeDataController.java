package com.laksh.ThymeLeafDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laksh.ThymeLeafDemo.entities.User;

//SERVICE LAYER-part1, it will connect to client//
//data controller//

//@RestController
@Controller
public class ThymeDataController {

	@Autowired
	ThymeService service;
	
//	@GetMapping("/user")
//	public List<User> getAllusers(){
//		return service.getAll();
//		
//	}

	
	
	/*
	 * We will return the name of html page ->dyanamic page( jispe contents change
	 * honge)
	 * kyuki hume batana h springboot ko ki
	 * sare users ki list is(output.html) page pr display karni hai!
	 */
	@GetMapping("/user")
	public String getAllusers(Model model){
		 List<User> data=service.getAll();
		 
//		 model.addAttribute("message","hello);
		 model.addAttribute("dataOfUsers",data);
		return "output.html";
	}
	

}
