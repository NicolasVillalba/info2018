package com.info2018.elements;

import lombok.Getter;

@Getter
public class Huevo implements Comestible {
    private Size tamano;
    private Color color;
    private Boolean dobleYema;
    
    public Huevo() {
		this.tamano = Size.CHICO;
		this.color = Color.BLANCO;
		this.dobleYema = true;
	}
    
    public Huevo(Huevo.Size size, Huevo.Color color, Boolean dobleYema) {
    	this.tamano = size;
		this.color = color;
		this.dobleYema = dobleYema;
    }
    
	@Override
	public String getType() {
		return "Huevos de gallina";
	}
	
	public enum Size {
		CHICO,
	    MEDIANO,
	    GRANDE
	}
	
	public enum Color {
	    ROJO,
	    BLANCO
	}

}
