package catlabs.api.CatlabsApi;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

public class Query implements GraphQLQueryResolver {
    private AnimalRepository animalRepository;

    public Query(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public Iterable<Animal> findAllAnimals() {
        return animalRepository.findAll();
    }

    public Animal findByName(String name) {
        return animalRepository.findByName(name);
    }
}
