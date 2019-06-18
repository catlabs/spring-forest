package catlabs.api.CatlabsApi;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, String> {

    public Animal findByName(String name);
}
