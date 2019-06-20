package catlabs.api.CatlabsApi;

import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, String> {

    public Animal findByName(String name);
}
