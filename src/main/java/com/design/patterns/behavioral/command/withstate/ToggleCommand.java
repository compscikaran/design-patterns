package com.design.patterns.behavioral.command.withstate;

import com.design.patterns.behavioral.command.Command;

public class ToggleCommand implements Command {

    private LightWithState lightWithState;

    public ToggleCommand(LightWithState lightWithState) {
        this.lightWithState = lightWithState;
    }

    @Override
    public void execute() {
        lightWithState.toggle();
    }
}
