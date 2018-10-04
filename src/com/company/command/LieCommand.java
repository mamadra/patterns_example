package com.company.command;

public class LieCommand implements ICommand {
    Dog dog;

    public LieCommand(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void execute() {
        dog.lie();
    }
}
