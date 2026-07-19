package ex2.config;


import ex2.beans.Vehicle;
import jdk.jfr.Description;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"ex2.beans"})
public class ProjectConfig {



}
