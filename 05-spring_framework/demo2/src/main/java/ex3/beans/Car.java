package ex3.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String name;
    private final Engine engine;

    @Autowired
    public Car(Engine engine) {
        System.out.println("Car bean created");
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    @PostConstruct
    public void init(){
        this.name = "BMW";
    }
}
