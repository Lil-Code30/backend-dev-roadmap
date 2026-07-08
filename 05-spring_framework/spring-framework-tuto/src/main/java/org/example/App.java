package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPAthXmlpplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext
        Vehicle obj = getBean("Vehicle");

        System.out.println( "Hello World!" );
    }
}
