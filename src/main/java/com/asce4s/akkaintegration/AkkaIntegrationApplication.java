package com.asce4s.akkaintegration;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import com.asce4s.akkaintegration.actors.TestActor;
import com.asce4s.akkaintegration.config.SpringExtension;
import com.asce4s.akkaintegration.config.SpringProps;
import com.typesafe.config.ConfigFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AkkaIntegrationApplication {

    @Autowired
    private ApplicationContext context;


    public static void main(String[] args) {
        SpringApplication.run(AkkaIntegrationApplication.class, args);
    }


    @PostConstruct
    void init(){
        ActorSystem system = ActorSystem.create("actor-system", ConfigFactory.load());
        SpringExtension.getInstance().get(system).initialize(context);


        ActorRef testActor= system.actorOf(SpringProps.create(system, TestActor.class));

        testActor.tell("hello world",ActorRef.noSender());
    }

}
