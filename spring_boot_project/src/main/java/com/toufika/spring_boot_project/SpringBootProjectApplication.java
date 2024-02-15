package com.toufika.spring_boot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);
		
      PersonRepo repo = context.getBean(PersonRepo.class);
		
      
      //create
		Person  dto=new Person();
		dto.setName("riya");
		repo.save(dto);
		
		//read
		Person p = repo.findById(1).orElse(null);
		System.out.println(p.getName());
		
		//update
		Person person = repo.findById(1).orElse(null);
		person.setName("Asfaque");
		repo.save(person); //save perform save or update
		
		//delete
		repo.deleteById(1);
		
	}

}
