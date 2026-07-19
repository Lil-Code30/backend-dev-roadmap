package ex1;

import ex1.beans.Vehicle;
import ex1.config.AnotherProjectConfig;
import ex1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Tesla");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class, AnotherProjectConfig.class);

        var veh = context.getBean("bmwVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring context is: " + veh.getName());

        var veh1 = (Vehicle)context.getBean("audiVehicle");
        System.out.println("Vehicle name from Spring context is: " + veh1.getName());


        String hello1 = context.getBean("hello1",String.class);
        System.out.println("Hello from Spring context is: " + hello1);
    }
}
