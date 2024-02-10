package com.shivraj.docker.compose;

import com.shivraj.docker.compose.modal.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
