package ex1.config;


import ex1.beans.Vehicle;
import jdk.jfr.Description;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

@Configuration
//@Import({AnotherProjectConfig.class}) -> you can import a project configuration in to another one
public class ProjectConfig {


    // @Bean({"audiVehicle", "audi", "myFavVehicle})
    @Bean(name = "audiVehicle")
    Vehicle vehicle1(){
        var veh = new Vehicle();

        veh.setName("Audi");

        return veh;
    }

    @Primary
    @Bean(value = "bmwVehicle")
    @Description("Represents the Vehicle BMW")
    Vehicle vehicle2(){
        var veh = new Vehicle();

        veh.setName("BMW");

        return veh;
    }

    @Bean("hondaVehicle")
    Vehicle vehicle3(){
        var veh = new Vehicle();

        veh.setName("Honda");

        return veh;
    }


}
