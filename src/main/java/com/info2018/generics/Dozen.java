package com.info2018.generics;

import java.util.ArrayList;
import java.util.List;

public class Dozen<T extends Countable> {
	
    private Integer pos = 0;

	private List<T> storage;

	public Dozen() {
	    this.storage = new ArrayList<>();
    }

    public T get(Integer k) {
        return this.storage.get(k);
    }

    public Dozen<T> add(T element){
        if(pos < 12){
            this.storage.add(element);
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
                "storage=" + this.storage.toString() +
                '}';
    }
}