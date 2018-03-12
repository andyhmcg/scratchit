package com.amcg.bird;

import com.amcg.world.World;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CrowTest {

    Crow crow = new Crow();

    @Test
    public void move() {

        World.windSpeed = 30;
        World.temparature = 10;

        crow.move();;
        int distance =  crow.getDistance();
        assertThat(distance , is(1));

    }
}