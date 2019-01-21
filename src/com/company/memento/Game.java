package com.company.memento;

public class Game {
    int point;
    int time;

    public Game() {
        new Game(0, 0);
    }

    public Game(int point, int time) {
        this.point = point;
        this.time = time;
    }

    public int getPoint() {
        return point;
    }

    public int getTime() {
        return time;
    }

    public void set(int point, int time) {
        this.point = point;
        this.time = time;
    }


    public void load(Save save) {
        point = save.getPoint();
        time = save.getTime();
    }

    public Save save() {
        return new Save(point, time);
    }

    @Override
    public String toString() {
        return "Game{" +
                "point=" + point +
                ", time=" + time +
                '}';
    }
}
