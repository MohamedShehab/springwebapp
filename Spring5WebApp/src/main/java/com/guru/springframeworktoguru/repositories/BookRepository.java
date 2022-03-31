package com.guru.springframeworktoguru.repositories;

import com.guru.springframeworktoguru.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {
}
