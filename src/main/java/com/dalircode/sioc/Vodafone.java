package com.dalircode.sioc;

public class Vodafone implements Sim {

    public void calling() {
        System.out.println("Calling using vodafone sim");
    }

    public void data() {
        System.out.println("Browsing internet using vodafone sim");
    }
}
