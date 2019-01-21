package com.company.command;

public class Human {
    ICommand stand;
    ICommand sit;
    ICommand lie;

    public Human(ICommand standCommand, ICommand sitCommand, ICommand lieCommand) {
        this.stand = standCommand;
        this.sit = sitCommand;
        this.lie = lieCommand;
    }

    public void standCommand() {
        stand.execute();
    }

    public void sitCommand() {
        sit.execute();
    }

    public void lieCommand() {
        lie.execute();
    }
}
