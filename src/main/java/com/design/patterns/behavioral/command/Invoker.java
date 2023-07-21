package com.design.patterns.behavioral.command;

import com.design.patterns.behavioral.command.Command;

public class Invoker {


    public void storeAndExecute(Command command) {
        command.execute();
    }
}
