package com.harsha.project.percivia;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface KeywordRepository extends MongoRepository<KeyWord, String>{

}
