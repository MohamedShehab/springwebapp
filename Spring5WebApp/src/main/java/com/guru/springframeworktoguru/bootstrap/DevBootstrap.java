package com.guru.springframeworktoguru.bootstrap;

import com.guru.springframeworktoguru.model.Author;
import com.guru.springframeworktoguru.model.Book;
import com.guru.springframeworktoguru.model.Publisher;
import com.guru.springframeworktoguru.repositories.AuthorRepository;
import com.guru.springframeworktoguru.repositories.BookRepository;
import com.guru.springframeworktoguru.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;


    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    public void initData(){

        Publisher publisher = new Publisher();
        publisher.setName("Foo");
        publisherRepository.save(publisher);

        Author eric = new Author("Eric","Evans");
        Book book = new Book("Domain Driven Design","1234",publisher);
        eric.getBooks().add(book);
        book.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(book);

        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE With No EJb","852852",publisher);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(noEJB);

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }
}
