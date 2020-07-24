package com.paytm.learnwebapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.paytm.learnwebapp.model.TrialUser;

@Repository
public interface TrialUserRepo extends CrudRepository<TrialUser, String>{

	
}
