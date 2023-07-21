package com.design.patterns.behavioral.command;

import com.design.patterns.behavioral.command.basic.Light;
import com.design.patterns.behavioral.command.basic.OnCommand;
import com.design.patterns.behavioral.command.withstate.AllLightsCommand;
import com.design.patterns.behavioral.command.withstate.LightWithState;
import com.design.patterns.behavioral.command.withstate.ToggleCommand;

import java.util.Arrays;
import java.util.List;

public class Demo {

    /**
     * Encapsulates the action as an object per request
     * Command interface contains Execute method and Undo method
     * Dependence on other patterns
     * Multiple Commands
     * Make use of memento for undo functionality
     * Prototype for storing copies
     *
     * @param args
     */
    public static void main(String[] args) {
        Light light = new Light();
        Invoker lightSwitch = new Invoker();

        Command onCommand = new OnCommand(light);
        lightSwitch.storeAndExecute(onCommand);

        LightWithState bedroomLight = new LightWithState();
        Command toggleCommand = new ToggleCommand(bedroomLight);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);

        LightWithState kitchenLight = new LightWithState();
        LightWithState toiletLight = new LightWithState();

        List<LightWithState> lights = Arrays.asList(bedroomLight, kitchenLight, toiletLight);
        Command allLightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand);

    }
}
