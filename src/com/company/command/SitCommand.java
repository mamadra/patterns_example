package com.company.command;

public class SitCommand implements ICommand {
    Dog dog;

    public SitCommand(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void execute() {
        dog.sid();
    }
}
