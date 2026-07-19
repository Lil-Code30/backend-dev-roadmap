package ex4.beans;

import org.springframework.stereotype.Component;

@Component("espresso")
public class Espresso implements Coffee {
    @Override
    public String makeCoffee() {
        return "Espresso Coffee";
    }
}
