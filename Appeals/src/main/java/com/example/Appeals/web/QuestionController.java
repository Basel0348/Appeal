package com.example.Appeals.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Appeals.domin.Question;
import com.example.Appeals.domin.QuestionRepository;


@RestController
public class QuestionController {
	@Autowired
    private QuestionRepository repository;

	  @RequestMapping("/questions")
      public Iterable<Question> getQuestions() {
		  return repository.findAll();

      } 

}
