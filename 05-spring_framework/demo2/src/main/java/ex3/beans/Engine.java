package ex3.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String engineName;

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    @PostConstruct
    public void init(){
        this.engineName = "M3";
    }
}
