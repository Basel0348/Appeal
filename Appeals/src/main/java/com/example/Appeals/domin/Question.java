package com.example.Appeals.domin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;



	@Entity
    public class Question {
      @Id
      @GeneratedValue(strategy=GenerationType.AUTO)
      private long id;
      private String QuestionId, TestlestOriginalId;
      private int QuestionOrder;
      
     public Question() {}
    public Question(String QuestionId, String TestlestOriginalId, int Order )
    {
    	super();
    	this.QuestionId=QuestionId;
    	this.TestlestOriginalId=TestlestOriginalId;
    	this.QuestionOrder=QuestionOrder;
     }
      public long getid() {
  		return id;
  	}
      
      public String getQuestionId() {
    	  return QuestionId;
      }
      
      public String getTestlestOriginalId() {
    	  return TestlestOriginalId;
      }
      
      public int getQuestionOrder() {
    	  return QuestionOrder;
      }
      public interface QuestionRepository extends CrudRepository <Question, Long> {

      }

    }
	
	
	



