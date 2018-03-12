package com.amcg.bird;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class PenguinTest {

    Penguin penguin = new Penguin();
    @Test
    public void move() {

        penguin.move();

        assertThat(penguin.getDistance(), is(2));
    }
}