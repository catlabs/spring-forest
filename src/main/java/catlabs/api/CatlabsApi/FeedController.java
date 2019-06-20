package catlabs.api.CatlabsApi;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FeedController {
    @Autowired
    private AnimalRepository repository;

    @RequestMapping("/test")
    public String index(){
        Faker faker = new Faker();
        return faker.rockBand().name();
    }

    @RequestMapping("/feedDB")
    public List<Animal> feedDB(){
        this.repository.deleteAll();
        Faker faker = new Faker();
        List<Animal> animals = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Animal animal = new Animal(faker.pokemon().name(), faker.number().numberBetween(1, 20), faker.number().numberBetween(1, 20), faker.number().numberBetween(1, 20));
            animals.add(animal);
            this.repository.save(animal);
        }
        return animals;
    }
}
