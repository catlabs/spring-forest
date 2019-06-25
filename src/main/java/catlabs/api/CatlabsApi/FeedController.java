package catlabs.api.CatlabsApi;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class FeedController {
    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private FoodRepository foodRepository;

    @RequestMapping("/test")
    public String index() {
        Faker faker = new Faker();
        return faker.food().ingredient();
    }

    @RequestMapping("/feedDB")
    public List<Animal> feedDB() {
        this.animalRepository.deleteAll();
        Faker faker = new Faker();
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Animal animal = new Animal(
                    faker.pokemon().name(),
                    faker.number().numberBetween(1, 20),
                    faker.number().numberBetween(1, 20),
                    faker.number().numberBetween(1, 20),
                    (List<Food>) this.foodRepository.findAll());
            animals.add(animal);

            this.animalRepository.save(animal);
        }

        // this.foodRepository.deleteAll();
        /* List<Food> foods = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Food food = new Food(faker.food().ingredient());
            foods.add(food);
            this.foodRepository.save(food);
        }*/
        return animals;
    }
}
