package com.pabba.employeeCRUD;

import com.pabba.employeeCRUD.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class EmployeeCrudApplication implements CommandLineRunner {


	@Value("${my.variable}")
	private String env_Variable;
	//  private final DataService dataService;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
//     System.out.println(dataService.getData());
		System.out.println("application we are in "+ env_Variable);
	}
}