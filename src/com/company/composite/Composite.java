package com.company.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IChessman {

    private List<IChessman> chessmenList = new ArrayList<>();

    public void addComponent(IChessman chessman) {
        chessmenList.add(chessman);
    }

    public void removeComponent(IChessman chessman) {
        chessmenList.remove(chessman);
    }

    @Override
    public void action() {
        for (IChessman chessman : chessmenList) {
            chessman.action();
        }
    }
}
