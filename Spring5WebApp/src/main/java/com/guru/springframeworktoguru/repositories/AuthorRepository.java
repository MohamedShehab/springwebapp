package com.guru.springframeworktoguru.repositories;

import com.guru.springframeworktoguru.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
