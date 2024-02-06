package org.gof.structual.adapter;

import java.util.ArrayList;

public class User {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("댕이"));
        animals.add(new Cat("나비"));
        animals.add(new Cat("춘식이"));
        animals.add(new TigerAdapter("타이온"));

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
