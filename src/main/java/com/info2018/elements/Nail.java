package com.info2018.elements;

import com.info2018.generics.Countable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
