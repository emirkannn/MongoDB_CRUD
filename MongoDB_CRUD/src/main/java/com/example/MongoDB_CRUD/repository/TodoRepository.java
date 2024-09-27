package com.example.MongoDB_CRUD.repository;

import com.example.MongoDB_CRUD.model.TodoDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends MongoRepository<TodoDTO, Long> {
}
