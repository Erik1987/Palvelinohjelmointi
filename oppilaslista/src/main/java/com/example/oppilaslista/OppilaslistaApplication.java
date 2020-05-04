package com.example.oppilaslista;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.oppilaslista.domain.Student;
import com.example.oppilaslista.domain.StudentRepository;



@SpringBootApplication
public class OppilaslistaApplication {
	private static final Logger log = LoggerFactory.getLogger(OppilaslistaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(OppilaslistaApplication.class, args);
	}
	@Bean
	public CommandLineRunner studentDemo(StudentRepository repository) {
		return (args) -> {
			log.info("save a couple of students");
			repository.save(new Student("John", "Johnson", "john@john.com"));
			repository.save(new Student("Katy", "Kateson", "kate@kate.com"));	
			
			log.info("fetch all students");
			for (Student student : repository.findAll()) {
				log.info(student.toString());
			}

		};
	}
	
}
