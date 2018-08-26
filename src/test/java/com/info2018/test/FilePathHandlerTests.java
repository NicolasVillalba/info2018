package com.info2018.test;

import org.junit.Before;
import org.junit.Test;
import java.io.File;

import static org.junit.Assert.*;

public class FilePathHandlerTests {

    private File file1;
    private File file2;
    private File file3;

    @Before
    public void setUp(){
        file1 = new File("~/");
        file2 = new File("/home/nico");
        file3 = new File("");
    }

    @Test
    public void waveOperatorForRelativePathTest(){
       assertEquals("/home/nico", file1.getAbsolutePath());
    }

    @Test
    public void absolutePathTest(){
       assertEquals("/home/nico", file2.getAbsolutePath());
    }

    @Test
    public void absolutePathWithoutAnyRouteTest(){
       assertEquals("/home/nico", file3.getAbsolutePath());
    }
}
