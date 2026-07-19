package ex2;

import ex2.beans.Vehicle;
import ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring context is: " + veh.getName());

        veh.sayHello();

        context.close();
    }
}
