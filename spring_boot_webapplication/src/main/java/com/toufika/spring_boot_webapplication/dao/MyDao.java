package com.toufika.spring_boot_webapplication.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.toufika.spring_boot_webapplication.model.MyModel;
import com.toufika.spring_boot_webapplication.model.Student;
import com.toufika.spring_boot_webapplication.repository.MyRepository;

@Component
public class MyDao implements MydaoInterface{

	@Autowired
	MyRepository repo;
	
	public void save(Student st) {
		repo.save(st);
	}
	public List<Student> view(){
		List<Student> findall = repo.findAll();
		return findall;
	}

	public Student edit(int id) {
		Student student = repo.findById(id).orElse(null);
		return student;
	}
	public void update(Student st) {
		
		Student student = repo.findById(st.getId()).orElse(null);
		student.setName(st.getName());
		student.setPassword(st.getPassword());
		student.setAge(st.getAge());
		student.setAddress(st.getAddress());
		
		repo.save(student);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	
		
	}
	/*
	public void read(MyModel model){
		MyModel myModel = repo.findById(1).orElse(null);
		System.out.println(myModel.getName());
	}
	
	public void update(MyModel model) {
		MyModel model2 = repo.findById(3).orElse(null);
		model2.setName("Asfaque");
		repo.save(model2);
	}
	public void delete(MyModel model) {
		repo.deleteById(4);
	}
	*/

