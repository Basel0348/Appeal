package com.example.Appeals.domin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface QuestionRepository extends CrudRepository <Question, Long> {

}
