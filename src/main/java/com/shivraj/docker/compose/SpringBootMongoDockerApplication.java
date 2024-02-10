package com.shivraj.docker.compose;

import com.shivraj.docker.compose.modal.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class SpringBootMongoDockerApplication {

	@Autowired
	private BookRepository bookRepository;

	@PostMapping
	public Book saveBook(@RequestBody Book book) {
		return bookRepository.save(book);
	}

	@GetMapping("/findAll")
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDockerApplication.class, args);
	}

}
