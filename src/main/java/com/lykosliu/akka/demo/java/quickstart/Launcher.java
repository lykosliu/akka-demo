package com.lykosliu.akka.demo.java.quickstart;

import akka.actor.*;
import akka.dispatch.Dispatchers;
import akka.dispatch.Mailboxes;
import akka.event.EventStream;
import akka.event.LoggingAdapter;
import scala.Function0;
import scala.collection.Iterable;
import scala.concurrent.ExecutionContextExecutor;
import scala.concurrent.Future;

import java.util.concurrent.CompletionStage;

public class Launcher {
    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        ActorSystem actorSystem = launcher.getDefaultActorSystem();
        ActorRef actorRef = actorSystem.actorOf(Props.create(HelloWorld.class),"actorSystemName");
        actorRef.tell("hello world",ActorRef.noSender());
    }


    /**
     * 创建一个默认的ActorSystem
     * @return
     */
    private ActorSystem getDefaultActorSystem(){
        return ActorSystem.create();
    }
}
