package com.asce4s.akkaintegration.actors;

import akka.actor.AbstractActor;
import com.asce4s.akkaintegration.config.interfaces.Actor;
import com.asce4s.akkaintegration.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

@Actor
public class TestActor extends AbstractActor {

    @Autowired
    private MessageService messageService;

    @Override
    public Receive createReceive() {
        return receiveBuilder()
                .match(String.class,messageService::print)
                .build();
    }
}
