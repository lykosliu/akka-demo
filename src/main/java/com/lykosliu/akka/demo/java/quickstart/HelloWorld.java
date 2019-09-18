package com.lykosliu.akka.demo.java.quickstart;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

public class HelloWorld extends AbstractActor {

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create().match(String.class,(obj)->{
            System.out.println(obj);
        }).build();
    }


}
