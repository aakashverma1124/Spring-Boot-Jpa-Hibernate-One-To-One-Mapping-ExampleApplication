package com.example.onetoonemapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.onetoonemapping.models.Instructor;
import com.example.onetoonemapping.models.InstructorDetail;
import com.example.onetoonemapping.repository.InstructorRepository;

@SpringBootApplication
public class SpringBootJpaOneToOneHibernateMappingExampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaOneToOneHibernateMappingExampleApplication.class, args);
	}
	
	@Autowired
    private InstructorRepository instructorRepository;

    @Override
    public void run(String...args) throws Exception {

        Instructor instructor = new Instructor("Aakash", "Verma", "t_aakash.verma@india.nec.com");

        InstructorDetail instructorDetail = new InstructorDetail("Java Guides", "Taking Photographs");

        // associate the objects
        instructor.setInstructorDetail(instructorDetail);

        instructorRepository.save(instructor);
    }

}
