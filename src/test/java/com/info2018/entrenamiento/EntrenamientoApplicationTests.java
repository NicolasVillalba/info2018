package com.info2018.entrenamiento;

import ejemplos.OperacionMatematica;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrenamientoApplicationTests {

    private int operando1;
    private int operando2;
    
    @Test
    public void contextLoads() {}
    
    @Before
    public void setUp() {
        this.operando1 = 3;
        this.operando2 = 4;
    }
    
    @Test
    @Description("Sumar dos numeros de manera óptima")
    public void sumarTest() {
        OperacionMatematica om = new OperacionMatematica(this.operando1, this.operando2);
        assertEquals(7, om.sumar());
    }

}
