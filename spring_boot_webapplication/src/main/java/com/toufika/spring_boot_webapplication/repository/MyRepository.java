package com.toufika.spring_boot_webapplication.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.toufika.spring_boot_webapplication.model.MyModel;
import com.toufika.spring_boot_webapplication.model.Student;

public interface MyRepository extends JpaRepository<Student,Integer>{

}
