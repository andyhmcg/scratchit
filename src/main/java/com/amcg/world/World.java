package com.amcg.world;

import com.amcg.bird.*;

import java.util.Arrays;
import java.util.List;

public class World {

    public static int temparature = 0;
    public static int windSpeed = 0;

    public static void main(String[] args){

        Penguin penguin = new Penguin();
        Crow crow = new Crow();
        Hawk hawk = new Hawk();
        Robin robin = new Robin();

        List<Bird> birds = Arrays.asList(penguin, crow, hawk, robin);

        temparature = 20;
        windSpeed = 12;

        birds.stream().forEach(bird -> bird.move());

        temparature = -10;
        windSpeed = 30;

        birds.stream().forEach(bird -> bird.move());

        birds.forEach(bird -> System.out.println(String.format("The %s moved %d feet",bird.getName(),bird.getDistance())));





    }
}
