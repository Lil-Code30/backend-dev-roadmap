package ex4.beans;

import org.springframework.stereotype.Component;

@Component
public class Espresso implements Coffee {
    @Override
    public String makeCoffee() {
        return "Espresso Coffee";
    }
}
