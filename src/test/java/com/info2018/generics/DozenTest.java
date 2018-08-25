package com.info2018.generics;

import com.info2018.elements.Egg;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DozenTest {

    private Dozen<Egg> testVar;
    private Egg h1;
    private Egg h2;

    @Before
    public void setUp() throws Exception {
        testVar = new Dozen<>();
        Egg h1 = new Egg();
        Egg h2 = new Egg(Egg.Size.LARGE, Egg.Color.CREAM_PINKISH, false);
        testVar.add(h1);
        testVar.add(h2);
    }

    @Test
    public void get() {
        assertNotNull(testVar.get(0));
        assertNotNull(testVar.get(1));
    }

    @Test
    @Ignore
    public void add() {
    }
}