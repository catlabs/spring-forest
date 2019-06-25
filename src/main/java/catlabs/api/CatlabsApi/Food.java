package catlabs.api.CatlabsApi;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "food")
public class Food {
    @Id
    public String id;

    @Field(value = "name")
    public String name;

    public Food(String name) {
        this.name = name;
    }
}
