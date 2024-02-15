package com.toufika.spring_boot_webapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.toufika.spring_boot_webapplication.dao.MydaoInterface;
import com.toufika.spring_boot_webapplication.model.MyModel;
import com.toufika.spring_boot_webapplication.model.Student;

@Component
public class Mynewservice implements MyServiceInterface{
   
	@Autowired
	MydaoInterface mydao;
	
	public void save(Student st) {
		mydao.save(st);
	}
	public List<Student> view() {
		return mydao.view();
		
	}
	public Student edit(int id) {
		return mydao.edit(id);
	}
	public void update(Student st) {
		mydao.update(st);
	}
	
	public void delete(int id) {
		mydao.delete(id);
	}
	
	
	
	/*
	public void read(MyModel model1){
		mydao.read(model1);
	}
	public void update(MyModel model1) {
		mydao.update(model1);
	}
	
	public void delete(MyModel model1) {
		mydao.delete(model1);
	}
	*/
}
