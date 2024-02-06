package org.gof.structual.adapter;

public class Tiger {
    private String name;

    public void roar() {
        System.out.println("growl");
    }

    public Tiger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
