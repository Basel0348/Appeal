package com.example.Appeals.domin;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

@Entity
public class Appeal {
	@Autowired 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String LearnerId, LearnerFirstName, LearnerLastName, QuestionId, TestletOriginalId, Notes,Answer, bibliography, IdNumber;
    private int QuestionNumer;
    public Appeal() {}
    public Appeal(String LearnerId, String LearnerFirstName,String LearnerLastName,String QuestionId,
    		String TestletOriginalId, String  Notes, String  Answer, String bibliography,String IdNumber,  int QuestionNumer )
    {
    	super();
    	this.LearnerId=LearnerId;
    	this.LearnerFirstName=LearnerFirstName;
    	this.LearnerLastName=LearnerLastName;
    	this.TestletOriginalId=TestletOriginalId;
    	this.QuestionId=QuestionId;
    	this.Notes=Notes;
    	this.Answer=Answer;
    	this.bibliography=bibliography;
    	this.IdNumber=IdNumber;

     }
    public long getid() {
  		return id;
  	}
    public String getLearnerId() {
    	return LearnerId;
    }
    public String getLearnerFirstName() {
    	return LearnerFirstName;
    }
    public String getLearnerLastName() {
    	return LearnerLastName;
    }
    public String getQuestionId() {
    	return QuestionId;
    }
    public String getTestletOriginalId() {
    	return TestletOriginalId;
    }
    public String getNotes() {
    	return Notes;
    }
    public String getAnswer() {
    	return Answer;
    }
    public String getbibliography() {
    	return bibliography;
    }
    public String getIdNumber() {
    	return IdNumber;
    }
    public int getQuestionNumer() {
    	return QuestionNumer;
    }
  

}
