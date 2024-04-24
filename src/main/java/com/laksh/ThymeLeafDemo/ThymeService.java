package com.laksh.ThymeLeafDemo;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.laksh.ThymeLeafDemo.entities.User;
import com.laksh.ThymeLeafDemo.repository.UserRepository;

//SERVICE LAYER-part2, this will process the data and give it to Datacontroller ->client//
//Data collision//

@Service
public class ThymeService {

	@Autowired
	UserRepository repo;

	
	public List<User> getAll() {
		List<User> data = repo.findAll();
		return data;
	}
	
	
	
	

}
