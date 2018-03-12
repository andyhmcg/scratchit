package com.amcg.bird;

import com.amcg.world.World;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class RobinTest {

    Robin robin = new Robin();
    @Test
    public void moveWhenSppedToGreatandTempTooLow() {

        World.windSpeed = 26;
        World.temparature = -1;
        robin.move();
        assertThat(robin.getDistance(), is(0));




    }

    @Test
    public void moveWhenTempIsZeroAndSpeedOk(){

        World.windSpeed = 19;
        World.temparature = 0;
        robin.move();
        assertThat(robin.getDistance(), is(21));

    }
}