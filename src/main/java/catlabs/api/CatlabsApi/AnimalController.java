package catlabs.api.CatlabsApi;

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
        return (List<Animal>) this.repository.findAll();
    }

}
