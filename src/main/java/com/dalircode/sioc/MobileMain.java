package com.dalircode.sioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileMain {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Sim sim = context.getBean("sim", Sim.class);
        sim.calling();
        sim.data();


    }
}
