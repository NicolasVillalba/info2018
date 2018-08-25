package com.info2018.elements;

import com.info2018.generics.Countable;

public class Nail implements Countable {

    private Type type;

    private Integer size;

    public enum Type {
        BOX,
        FINISHING,
        MASONRY,
        CASING,
        DOUBLE_HEAD
    }
}
