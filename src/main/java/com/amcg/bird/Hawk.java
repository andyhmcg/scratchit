package com.amcg.bird;

import com.amcg.Flyable;
import com.amcg.Hoppable;
import com.amcg.world.World;

public class Hawk extends Bird implements Flyable{

    public Hawk(){
        super("Hawk");
    }

    @Override
    public int fly() {
        if (World.windSpeed > 40){
            return 0;
        }
        else {
            return 100;
        }
    }

    @Override
    public void move() {
        this.addDistance(fly());

    }
}
