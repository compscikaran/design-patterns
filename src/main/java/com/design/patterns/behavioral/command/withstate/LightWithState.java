package com.design.patterns.behavioral.command.withstate;

public class LightWithState {

    private boolean isOn = false;

    public void toggle() {
        if(isOn)
            off();
        else
            on();
        isOn = !isOn;
    }

    public void on() {
        System.out.println("Light switched on");
    }

    public void off() {
        System.out.println("Light switched off");
    }

    public boolean isOn() {
        return isOn;
    }
}
