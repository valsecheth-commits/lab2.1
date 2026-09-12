package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@ComponentScan("org.example")
@PropertySource("classpath:graph.properties")
public class Main {
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new AnnotationConfigApplicationContext(Main.class);

        classPathXmlApplicationContext.getBean(Scene.class).draw();


    }
}