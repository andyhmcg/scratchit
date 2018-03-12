
package com.amcg.linreg;

import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class LinReg {

    private final double[] x;
    private final double[] y;

    public LinReg(double[] x, double[] y){

        if (x.length != y.length){
            throw new RuntimeException("Lengths not equal");
        }

        this.x = x;
        this.y = y;

    }

    public double meanx(){

        return mean(x);
    }

    public double meany(){
        return mean(y);

    }

    public double slope(){
        return calculateSxy() / calculateSxx();
    }


    private double calculateSxx(){


        double sxx = DoubleStream.of(x).map(x -> {
            return (x - meanx()) * 2;
        }).sum();

        return sxx;

    }

    private double calculateSxy(){

        double sxy =  IntStream.range(0, x.length).mapToDouble(ndx -> {
            return (x[ndx] - meanx()) - (y[ndx] - meany());
        }).sum();

        return sxy;
    }

    private double mean(double[] in){
        return Arrays.stream(in).average().orElse(0);
    }


}
