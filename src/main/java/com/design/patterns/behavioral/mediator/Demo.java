package com.design.patterns.behavioral.mediator;

import com.design.patterns.behavioral.command.Command;
import com.design.patterns.behavioral.command.withstate.LightWithState;

public class Demo {

    /**
     * Loose coupling between objects
     * Well defined complex objects and spaghetti code to communicate between them
     * Acts as a Hub / Router e.g. java.util.Timer
     * Mediator knows about the colleagues without the colleagues knowing about each other
     * Easy to create a God Object which does everything for everyone
     * Limits subclassing
     * Observers are more generic and work with one to many relationships
     *
     * @param args
     */
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        LightWithState kitchenLight = new LightWithState();
        LightWithState toiletLight = new LightWithState();
        mediator.registerLight(kitchenLight);
        mediator.registerLight(toiletLight);
        Command turnOnAllLights = new TurnOnAllLightsCommand(mediator);
        turnOnAllLights.execute();
        Command turnOffAllLights = new TurnOffAllLightsCommand(mediator);
        turnOffAllLights.execute();

    }
}
