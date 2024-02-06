package org.gof.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Item[] items = {
                new Item("Stop Watch", 17000),
                new Item("Tumblr", 40000),
                new Item("Mug Cup", 13000),
                new Item("Keyboard", 62000)
        };

        Array array = new Array(items);
        Iterator iterator = array.iterator();

        while (iterator.next()) {
            Item item = (Item) iterator.current();
            System.out.println(item);
        }
    }
}