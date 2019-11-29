package com.example.Appeals.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Appeals.domin.Appeal;
import com.example.Appeals.domin.AppealRepository;
import com.example.Appeals.domin.Learner;

@RestController
public class AppealController{
	@Autowired
	private AppealRepository appealrepository;
	
	
	@RequestMapping("/appeals")
    public Iterable<Appeal> getappeals() {
		  return appealrepository.findAll();

    } 
	

}