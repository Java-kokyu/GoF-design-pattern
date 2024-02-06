package org.gof.structual.adapter;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    protected void sound() {
        System.out.println(name + " Barking");
    }
}
