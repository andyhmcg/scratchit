package com.amcg.bird;

import com.amcg.Hoppable;

public class Penguin extends Bird implements Hoppable {


    public Penguin() {
        super("Penguin");
    }

    @Override
    public int hop() {
        return 2;
    }

    @Override
    public void move() {
        this.addDistance(hop());

    }
}
