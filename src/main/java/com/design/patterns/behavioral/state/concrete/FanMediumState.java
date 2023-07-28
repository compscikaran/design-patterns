package com.design.patterns.behavioral.state.concrete;

import com.design.patterns.behavioral.state.Fan;
import com.design.patterns.behavioral.state.State;

public class FanMediumState implements State {

    private Fan fan;

    public FanMediumState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to high");
        fan.setState(fan.getFanHighState());
    }

    @Override
    public String toString() {
        return "FanMediumState{" +
                "fan=" + fan +
                '}';
    }
}
