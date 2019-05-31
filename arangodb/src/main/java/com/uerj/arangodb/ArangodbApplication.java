package com.uerj.arangodb;

import com.uerj.arangodb.runner.CrudRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ArangodbApplication {

	public static void main(String[] args) {
		final Class<?>[] runner = new Class<?>[] { CrudRunner.class, ArangodbApplication.class};
		SpringApplication.run(runner, args);
	}

}
