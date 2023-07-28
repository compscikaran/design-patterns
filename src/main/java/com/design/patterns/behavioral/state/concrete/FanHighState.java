package com.design.patterns.behavioral.state.concrete;

import com.design.patterns.behavioral.state.Fan;
import com.design.patterns.behavioral.state.State;

public class FanHighState implements State {

    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning off fan");
        fan.setState(fan.getFanOffState());
    }

    @Override
    public String toString() {
        return "FanHighState{" +
                "fan=" + fan +
                '}';
    }
}
