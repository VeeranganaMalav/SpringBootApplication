package com.example.springbootdemo;

import com.example.springbootdemo.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	@Autowired
	private IEmployeeRepository employeeRepository;

	/*@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Veerangana");
		employee.setLastName("Malav");
		employee.setEmailId("veerangana@yahoo.in");
		employeeRepository.save(employee);
	}*/

	@Override
	public void run(String... args) throws Exception{

	}
}
