package com.toufika.spring_boot_webapplication.service;

import java.util.List;

import com.toufika.spring_boot_webapplication.model.MyModel;
import com.toufika.spring_boot_webapplication.model.Student;

public interface MyServiceInterface {
	void save(Student st);
	List<Student> view();
	Student edit(int id);
	void update(Student st);
	void delete(int id);

}
