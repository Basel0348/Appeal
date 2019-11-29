package com.example.Appeals.domin;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface AppealRepository extends CrudRepository <Appeal, Long> {
	

}
