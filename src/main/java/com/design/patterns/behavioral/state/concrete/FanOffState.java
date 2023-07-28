package com.design.patterns.behavioral.state.concrete;

import com.design.patterns.behavioral.state.Fan;
import com.design.patterns.behavioral.state.State;

public class FanOffState implements State {

    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to low");
        fan.setState(fan.getFanLowState());
    }

    @Override
    public String toString() {
        return "FanOffState{" +
                "fan=" + fan +
                '}';
    }
}
