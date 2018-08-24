package com.info2018.generics;

import java.util.Arrays;

public class Docena<T> {
	
    private Integer pos = 0;
    
    @SuppressWarnings("unchecked")
	private T[] storage = (T[]) new Object[12];

    public T get(Integer k) {
        return this.storage[k];
    }

    public void add(T element){
        if(pos > 12) return;
        this.storage[pos] = element;
        pos++;
    }

    @Override
    public String toString() {
        return "Docena{" +
                "storage=" + Arrays.toString(storage) +
                '}';
    }
}