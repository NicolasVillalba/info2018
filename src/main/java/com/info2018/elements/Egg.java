package com.info2018.elements;

import com.info2018.generics.Countable;
import lombok.Getter;

@Getter
public class Egg implements Countable, Comestible {

    private Size size;
    private Color color;
    private Boolean doubleYolk;
    
    public Egg() {
		this.size = Size.SMALL;
		this.color = Color.WHITE;
		this.doubleYolk = true;
	}
    
    public Egg(Egg.Size size, Egg.Color color, Boolean doubleYolk) {
    	this.size = size;
		this.color = color;
		this.doubleYolk = doubleYolk;
    }
    
	@Override
	public String getType() {
        return "Chicken Eggs";
	}
	
	public enum Size {
		SMALL,
	    MEDIUM,
	    LARGE,
		JUMBO
	}
	
	public enum Color {
        CREAM_PINKISH,
	    WHITE,

	}

}
