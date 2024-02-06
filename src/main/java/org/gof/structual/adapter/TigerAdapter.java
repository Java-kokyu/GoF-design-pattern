package org.gof.structual.adapter;

public class TigerAdapter extends Animal{
    private Tiger tiger;

    public TigerAdapter(String name) {
        super(name);
        this.tiger = new Tiger(name);
        this.tiger.setName(name);
    }

    @Override
    protected void sound() {
        System.out.print(tiger.getName() + " ");
        tiger.roar();
    }
}
