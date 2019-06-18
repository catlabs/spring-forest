package catlabs.api.CatlabsApi;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedController {
    @RequestMapping("/test")
    public String index(){
        Faker faker = new Faker();
        return faker.rockBand().name();
    }
}
