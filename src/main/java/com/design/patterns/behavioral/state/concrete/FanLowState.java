package com.design.patterns.behavioral.state.concrete;

import com.design.patterns.behavioral.state.Fan;
import com.design.patterns.behavioral.state.State;

public class FanLowState implements State {

    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to medium");
        fan.setState(fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "FanLowState{" +
                "fan=" + fan +
                '}';
    }
}
