package catlabs.api.CatlabsApi;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class FeedController {
    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private FoodRepository foodRepository;

    @RequestMapping("/test")
    public List<Food> index() {
        List<Food> foodList = (List<Food>) this.foodRepository.findAll();
        Collections.shuffle(foodList);
        return foodList.subList(0, 5);
        /* Faker faker = new Faker();
        return faker.food().ingredient(); */
    }

    @RequestMapping("/feedDB")
    public List<Animal> feedDB() {
        Faker faker = new Faker();

        this.foodRepository.deleteAll();
        List<Food> foods = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Food food = new Food(faker.food().ingredient());
            foods.add(food);
            this.foodRepository.save(food);
        }

        this.animalRepository.deleteAll();
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            List<Food> animalFoods = foods;
            Collections.shuffle(animalFoods);
            Animal animal = new Animal(
                    faker.pokemon().name(),
                    faker.number().numberBetween(1, 20),
                    faker.number().numberBetween(1, 20),
                    faker.number().numberBetween(1, 20),
                    animalFoods.subList(0, 5));
            animals.add(animal);

            this.animalRepository.save(animal);
        }
        return animals;
    }
}
