package com.toufika.diff_pack_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.toufika.controller.MyController;
import com.toufika.model.MyModel;

@SpringBootApplication
@ComponentScan(basePackages= {"com.toufika.model","com.toufika.controller"})

///if the classes like controller ,model and other classes are in different packages then we have to use componentscan annotation to declare the base packages
// otherwise we get error to run the application

public class DiffPackExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DiffPackExampleApplication.class, args);
		
		MyModel model = context.getBean(MyModel.class);
		System.out.println(model);
		
		MyController controller = context.getBean(MyController.class);
		System.out.println(controller);
		
		
	}

}
