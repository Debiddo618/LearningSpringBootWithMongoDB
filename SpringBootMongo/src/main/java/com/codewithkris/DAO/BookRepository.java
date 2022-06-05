package com.codewithkris.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.codewithkris.Entity.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
