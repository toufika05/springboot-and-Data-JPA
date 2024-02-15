package com.toufika.spring_boot_webapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.toufika.spring_boot_webapplication.model.MyModel;
import com.toufika.spring_boot_webapplication.model.Student;
import com.toufika.spring_boot_webapplication.service.MyServiceInterface;

@Controller // stereo type annotation(controller,autowired,component )
public class Mycontroller {

	// @RequestMapping(value='/',method=RequestMethod.GET)

	@Autowired
	MyServiceInterface myservice;
	
	@GetMapping("/")
	public String m1() {
		return "index";
	}
	@GetMapping("/reg")
    public String registration(@ModelAttribute Student st) {
    	System.out.println(st);
    	myservice.save(st);
    	return "resp1";
    	
    }
	@GetMapping("/view")
	public ModelAndView view() {
		List<Student> list=myservice.view();
		System.out.println(list);
		return new ModelAndView("resp2","msg",list);
	}
	 @GetMapping("/edit/{id}")   
	public ModelAndView edit(@PathVariable int id) {
		Student student = myservice.edit(id);
		return new ModelAndView("resp3","edit",student);
	}

	 @GetMapping("/update")
	public String Update(@ModelAttribute Student st) {
		System.out.println("Update:"+ st);
		myservice.update(st);
		return "resp4";
	}
	 
	 @GetMapping("/delete/{id}")   	
	 public String delete(@PathVariable int id) {
		 myservice.delete(id);
		 return "resp5";
	 }
	
	/*
	 * @GetMapping("/") public String welcome() { return "index"; }
	 * 
	 */
	/*
	 * @GetMapping("/") public String welcome(Model model) {
	 * model.addAttribute("msg", "Hello guys,welcome to spring boot web app");
	 * return "index"; }
	 */

	/*
	 * @GetMapping("/") public String crudoperation() { MyModel model1=new
	 * MyModel(); myservice.save(model1); myservice.read(model1);
	 * myservice.update(model1); return "index"; }
	 */
}
