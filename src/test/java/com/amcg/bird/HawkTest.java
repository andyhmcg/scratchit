package com.amcg.bird;

import com.amcg.world.World;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class HawkTest {

    Hawk hawk = new Hawk();
    @Test
    public void move() {

        World.windSpeed = 41;
        hawk.move();

        assertThat(hawk.getDistance(), is(0));
    }
}