package com.example.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.Bookstore.domain.Book;
import com.example.Bookstore.domain.BookRepository;
import com.example.Bookstore.domain.Category;


@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest  {

    @Autowired
    private BookRepository repository;

    
    @Test
    public void createNewBook() {
    	Book book = new Book("Junk For Junkyard", "Mr. Junk", 2019, "3242-1212", 0.39, new Category("Test"));
    	repository.save(book);
    	assertThat(book.getId()).isNotNull();
    }    

}
