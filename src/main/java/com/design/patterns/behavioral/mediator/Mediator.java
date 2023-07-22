package com.design.patterns.behavioral.mediator;

import com.design.patterns.behavioral.command.withstate.LightWithState;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    private List<LightWithState> lights = new ArrayList<>();

    public void registerLight(LightWithState light) {
        lights.add(light);
    }

    public void turnOnAllLights() {
        for(LightWithState light: lights) {
            if(!light.isOn())
                light.toggle();
        }
    }

    public void turnOffAllLights() {
        for(LightWithState light: lights) {
            if(light.isOn())
                light.toggle();
        }
    }
}
