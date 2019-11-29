package com.example.Appeals.domin;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@SpringBootApplication

	@Entity
public class Learner {
	@Autowired 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	 private long id;
	private String UserName,  Password,  IdNumber,  FirstName,  LastName, TestletOriginalId, TestletTitle;
	private boolean IsAppealed;
	private Date LastAppealDate;
	public Learner() {}
	public Learner(String UserName, String IdNumber, boolean IsAppealed) {
		super();
    	this.UserName=UserName;
    	this.IdNumber=IdNumber;
    	this.IsAppealed= IsAppealed;
		
	}
    public Learner(String UserName, String Password, String IdNumber, String FirstName, String LastName, String TestletOriginalId, String TestletTitle, boolean  IsAppealed, Date  LastAppealDate )
    {
    	super();
    	this.UserName=UserName;
    	this.Password=Password;
    	this.IdNumber= IdNumber;
    	this.FirstName= FirstName;
    	this.LastName= LastName;
    	this.TestletOriginalId= TestletOriginalId;
    	this.TestletTitle= TestletTitle;
    	this.IsAppealed= IsAppealed;
    	this.LastAppealDate= LastAppealDate;
    	
    	
     }
      public long getid() {
  		return id;
  	}

}
