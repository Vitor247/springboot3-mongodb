package com.vitorcamilodev.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vitorcamilodev.mongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
