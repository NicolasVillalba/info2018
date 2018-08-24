package com.info2018.generics;

import com.info2018.elements.Huevo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DocenaTest {

    private Docena<Huevo> testVar;
    private Huevo h1;
    private Huevo h2;

    @Before
    public void setUp() throws Exception {
        testVar = new Docena<>();
        Huevo h1 = new Huevo();
        Huevo h2 = new Huevo(Huevo.Size.GRANDE, Huevo.Color.ROJO, false);
        testVar.add(h1);
        testVar.add(h2);
    }

    @Test
    public void get() {
        assertNotNull(testVar.get(0));
    }

    @Test
    public void add() {
    }
}