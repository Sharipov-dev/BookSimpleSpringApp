package com.mycrud.crudApplication;

import com.mycrud.crudApplication.model.Book;
import com.mycrud.crudApplication.repo.BookRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);

	}

}
