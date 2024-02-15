package com.toufika.spring_boot_project;

import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepo extends JpaRepository<Person,Integer> {

}
