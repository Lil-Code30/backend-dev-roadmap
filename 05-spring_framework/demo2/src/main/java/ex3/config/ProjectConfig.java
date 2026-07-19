package ex3.config;


import ex3.beans.Person;
import ex3.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"ex3.beans"})
public class ProjectConfig {
    @Bean
    Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("BMW");

        return vehicle;
    }

//    @Bean
//    Person person() {
//        Person person = new Person();
//        person.setName("Isko");
//        person.setVehicle(vehicle());
//        return person;
//    }

    @Bean
    Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Isko");
        person.setVehicle(vehicle);
        return person;
    }


}
