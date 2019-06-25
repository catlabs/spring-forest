package catlabs.api.CatlabsApi;

import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food, String> {
}
