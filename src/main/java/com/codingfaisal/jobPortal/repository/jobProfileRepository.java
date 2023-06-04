package com.codingfaisal.jobPortal.repository;

import com.codingfaisal.jobPortal.model.jobProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface jobProfileRepository extends MongoRepository<jobProfile, String> {
}
