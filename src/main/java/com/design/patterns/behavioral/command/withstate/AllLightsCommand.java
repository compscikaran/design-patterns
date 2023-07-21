package com.design.patterns.behavioral.command.withstate;

import com.design.patterns.behavioral.command.Command;
import com.design.patterns.behavioral.command.withstate.LightWithState;

import java.util.List;

public class AllLightsCommand implements Command {

    private List<LightWithState> lights;

    public AllLightsCommand(List<LightWithState> lights) {
        this.lights = lights;
    }


    @Override
    public void execute() {
        for (LightWithState light: lights) {
            if(light.isOn())
                light.toggle();
        }
    }
}
