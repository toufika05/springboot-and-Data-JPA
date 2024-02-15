package com.toufika.spring_boot_webapplication.dao;


import java.util.List;

import com.toufika.spring_boot_webapplication.model.Student;

public interface MydaoInterface {
	
	void save(Student st);
	List<Student> view();
	Student edit(int id);
	void update(Student st);
	void delete(int id);

	
}
