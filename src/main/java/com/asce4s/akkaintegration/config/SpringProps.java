package com.asce4s.akkaintegration.config;

import akka.actor.Actor;
import akka.actor.ActorSystem;
import akka.actor.Props;



public class SpringProps {
    public static Props create(ActorSystem system, Class<? extends Actor> actorBeanClass) {
        return SpringExtension.getInstance().get(system).props(actorBeanClass);
    }

    public static Props create(ActorSystem system, Class<? extends Actor> actorBeanClass, Object... parameters) {
        return SpringExtension.getInstance().get(system).props(actorBeanClass, parameters);
    }
}
