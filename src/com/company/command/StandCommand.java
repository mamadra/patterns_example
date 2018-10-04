package com.company.command;

public class StandCommand implements ICommand {

    Dog dog;

    public StandCommand(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void execute() {
        dog.stand();
    }
}
