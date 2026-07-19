package ex4;

import ex4.beans.Coffee;
import ex4.beans.CoffeeShop;
import ex4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {

    public static void main() {


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var coffeeShop = context.getBean(CoffeeShop.class);
        Coffee coffee = coffeeShop.getCoffee();
        System.out.println(coffee.makeCoffee());


    }
}
