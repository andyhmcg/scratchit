package com.amcg.linreg;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LinRegTest {


    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void unequalInputs() {

        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Lengths not equal");


        double[] x = new double[]{10, 20, 30};
        double[] y = new double[]{10, 20};
        LinReg linReg = new LinReg(x, y);
    }




    @Test
    public void meanx() {

        double[] x = new double[]{10,20,30};
        double[] y = new double[]{10,20,30};
        LinReg linReg = new LinReg(x,y);

        double meanx = linReg.meanx();

        assertThat(meanx, is(20.0));
    }

    @Test
    public void meany() {

        double[] x = new double[]{10,20,30};
        double[] y = new double[]{10,20,30};
        LinReg linReg = new LinReg(x,y);

        double meanx = linReg.meanx();

        assertThat(meanx, is(20.0));
    }

    @Test
    public void slope() {

        double[] x = new double[]{10,20,30};
        double[] y = new double[]{10,20,30};
        LinReg linReg = new LinReg(x,y);

        double a = linReg.slope();

        assertThat(a, is(1.0));

    }
}