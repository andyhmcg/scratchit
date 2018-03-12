package com.amcg.bird;


public abstract class  Bird {

    private int distance;
    private String name;

    public Bird(String name){
        this.name = name;
    }

    public  abstract void move();


    public int getDistance() {
        return distance;
    }

    public void addDistance(int distance) {
        this.distance = this.distance + distance;
    }


    public String getName() {
        return name;
    }

}
