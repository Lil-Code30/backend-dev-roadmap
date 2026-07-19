package ex4.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("cappuccino")
public class Cappuccino implements Coffee {
    @Override
    public String makeCoffee() {
        return "Cappuccino Coffee";
    }
}
