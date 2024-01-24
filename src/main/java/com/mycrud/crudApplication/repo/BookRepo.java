package com.mycrud.crudApplication.repo;

import com.mycrud.crudApplication.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepo extends  JpaRepository<Book, Integer> {
}
