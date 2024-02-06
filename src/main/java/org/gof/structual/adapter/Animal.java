package org.gof.structual.adapter;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected abstract void sound();
}
