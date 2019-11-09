package com.example.Appeals;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.example.Appeals.domin.Question;
import com.example.Appeals.domin.QuestionRepository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages={"com.example.Appeals.domain","com.example.Appeals.web"})
@EnableAutoConfiguration


public class AppealsApplication {
	
	
	@Autowired 
    private QuestionRepository repository;
	public static void main(String[] args) {
		//coment
		SpringApplication.run(AppealsApplication.class, args);
	}
	@Bean
    CommandLineRunner runner(){
      return args -> {
        // Save demo data to database
        repository.save(new Question("Q457", "English_Exam", 1));
        repository.save(new Question("Q78", "English_Exam", 2));    
         repository.save(new Question("Q51", "English_Exam", 3));
      };
    } 


}
