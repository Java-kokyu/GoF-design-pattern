package org.gof.structual.adapter;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    protected void sound() {
        System.out.println(name + " Meow");
    }
}
