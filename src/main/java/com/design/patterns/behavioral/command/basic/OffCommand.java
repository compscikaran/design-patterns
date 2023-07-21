package com.design.patterns.behavioral.command.basic;

import com.design.patterns.behavioral.command.Command;

public class OffCommand implements Command {

    private Light light;

    public OffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
