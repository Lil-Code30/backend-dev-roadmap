package ex3;

import ex3.beans.Person;
import ex3.beans.Vehicle;
import ex3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());

        Person person = context.getBean(Person.class);
        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle that Person own is: " + person.getVehicle());
    }
}
