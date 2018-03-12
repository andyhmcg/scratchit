package com.amcg.bird;

import com.amcg.Flyable;
import com.amcg.Hoppable;
import com.amcg.world.World;

public class Crow extends Bird implements Hoppable, Flyable{

    public Crow(){
        super("Crow");
    }

    @Override
    public int fly() {
        if (World.windSpeed > 25){
            return 0;
        }
        else {
            return 30;
        }
    }

    @Override
    public int hop() {
        if (World.temparature < 0){
            return 0;
        }
        else {

            return 1;
        }
    }

    @Override
    public void move() {
        this.addDistance(hop() + fly());

    }
}
