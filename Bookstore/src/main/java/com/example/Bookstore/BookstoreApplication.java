package com.example.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.Bookstore.domain.Book;
import com.example.Bookstore.domain.BookRepository;
import com.example.Bookstore.domain.Category;
import com.example.Bookstore.domain.CategoryRepository;
import com.example.Bookstore.domain.User;
import com.example.Bookstore.domain.UserRepository;

// git add .
// git commit -m "adding more junk"
// git push -u origin master

@SpringBootApplication
public class BookstoreApplication {

	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner BookstoreDemo(BookRepository brepository, CategoryRepository crepository,
			UserRepository urepository) {
		return (args) -> {
			log.info("save a couple of books");

			crepository.save(new Category("Education"));
			crepository.save(new Category("Novel"));
			crepository.save(new Category("Fantasy"));
			crepository.save(new Category("Sci-Fi"));
			crepository.save(new Category("E-book"));

			brepository.save(new Book("Java Ohjelmointi - Perusteet", "Matti Ohjelmoinen", 2019, "1212-1212", 29.39,
					crepository.findByName("Education").get(0)));
			brepository.save(new Book("Spring Thymeleaf - Perusteet", "Huono Opettaja", 2018, "3453-4565", 89.39,
					crepository.findByName("Education").get(0)));

			// Create users: admin/admin user/user
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);
			//System.out.println(urepository.findById((Long.parseLong(1 +""))));

			// log.info("fetch all books");
			// for (Book book : brepository.findAll()) {
			// log.info(book.toString());
			// }

		};
	}

}
