package org.example;

public class Toys extends Goods {
    private int pcs;
    protected int weight;
    public Toys () {

    }
    public Toys (int id, String name, int pcs, int weight) {
        super(id, name);
        this.pcs = pcs;
        this.weight = weight;
    }

    public int getPcs() {
        return pcs;
    }

    public int getWeight() {
        return weight;
    }
    public void setPcs(int pcs) {
        this.pcs = pcs;
    }
}
