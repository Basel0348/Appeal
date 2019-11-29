package com.example.Appeals.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Appeals.domin.Learner;
import com.example.Appeals.domin.LearnerRepository;
import com.example.Appeals.domin.Question;
import com.example.Appeals.domin.QuestionRepository;

public class LearnerController {
	@Autowired
    private LearnerRepository learnerrepository;

	  @RequestMapping("/learners")
      public Iterable<Learner> getlearners() {
		  return learnerrepository.findAll();

      } 

}
