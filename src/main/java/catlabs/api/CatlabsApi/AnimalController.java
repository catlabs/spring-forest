package catlabs.api.CatlabsApi;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    private AnimalRepository repository;

    @RequestMapping("/animals")
    public List<Animal> index(){
        Faker faker = new Faker();
        System.out.println(faker.rockBand().name());
        return (List<Animal>) this.repository.findAll();
    }
}
