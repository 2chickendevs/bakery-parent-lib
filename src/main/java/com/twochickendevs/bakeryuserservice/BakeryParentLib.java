package com.chickendev.bakeryuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class BakeryParentLib {

	static void main(String[] args) {
		SpringApplication.run(BakeryLibParent.class, args);
	}

}
