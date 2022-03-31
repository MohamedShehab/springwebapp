package com.guru.springframeworktoguru.repositories;

import com.guru.springframeworktoguru.model.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
