package com.design.patterns.behavioral.command.basic;

import com.design.patterns.behavioral.command.Command;

public class OnCommand implements Command {

    private Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
