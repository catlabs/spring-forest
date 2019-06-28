package catlabs.api.CatlabsApi;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

public class Query implements GraphQLQueryResolver {
    private AnimalRepository animalRepository;
    private FoodRepository foodRepository;

    public Query(AnimalRepository animalRepository, FoodRepository foodRepository) {
        this.animalRepository = animalRepository;
        this.foodRepository = foodRepository;
    }

    public Iterable<Animal> animals() {
        return animalRepository.findAll();
    }
    public Animal findByName(String name) {
        return animalRepository.findByName(name);
    }

    public Iterable<Food> foods() {
        return foodRepository.findAll();
    }
}
