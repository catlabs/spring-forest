package catlabs.api.CatlabsApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CatlabsApiApplication {

	@Autowired
	private AnimalRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(CatlabsApiApplication.class, args);
	}

	@Bean
	public Query query(AnimalRepository animalRepository) {
		return new Query(animalRepository);
	}
}
