package catlabs.api.CatlabsApi;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "animal")
public class Animal {
    @Id
    public String id;

    @Field(value = "cutness")
    public int cutness;

    @Field(value = "intelligence")
    public int intelligence;

    @Field(value = "name")
    public String name;

    @Field(value = "social")
    public int social;

    public Animal(String name, int cutness, int social, int intelligence) {
        this.name = name;
        this.cutness = cutness;
        this.social= social;
        this.intelligence = intelligence;
    }


}
