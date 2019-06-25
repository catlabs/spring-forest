package catlabs.api.CatlabsApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CatlabsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatlabsApiApplication.class, args);
	}

	@Bean
	public Query query(AnimalRepository animalRepository, FoodRepository foodRepository) {
		return new Query(animalRepository, foodRepository);
	}
}
