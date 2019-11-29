package com.example.Appeals.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Appeals.domin.Learner;
import com.example.Appeals.domin.LearnerRepository;
import com.example.Appeals.domin.Question;
import com.example.Appeals.domin.QuestionRepository;

@RestController
public class LearnerController {
	@Autowired
    private LearnerRepository learnerrepository;

	  @RequestMapping("/learners")
      public Iterable<Learner> getLearners() {
		  return learnerrepository.findAll();

      } 

}
