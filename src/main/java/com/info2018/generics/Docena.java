package com.info2018.generics;

import java.util.Arrays;

public class Docena<T extends Countable> {
	
    private Integer pos = 0;
    
    @SuppressWarnings("unchecked")
	private T[] storage = (T[]) new Object[12];

    public T get(Integer k) {
        return this.storage[k];
    }

    public Docena add(T element){
        if(pos < 12){
            this.storage[pos] = element;
            pos++;
        }
        return this;
    }

    public Integer placesLeft(){
        return 12 - this.pos;
    }

    public Boolean anyAvailablePlace() {
        return this.pos <= 11;
    }

    @Override
    public String toString() {
        return "Docena{" +
                "storage=" + Arrays.toString(storage) +
                '}';
    }
}