package com.cukhoaimon.webbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import  com.cukhoaimon.webbackend.data.ToDo;

public interface ToDoRepository extends MongoRepository<ToDo, String> {
}
