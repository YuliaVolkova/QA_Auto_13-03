package org.example.HW5;

public class HW5_Animal {
    private boolean vegetarian;
    private String eats;
    private int noOflegs;

    public HW5_Animal(boolean vegetarian, String eats, int noOflegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOflegs = noOflegs;
    }

    public HW5_Animal() {
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNoOflegs() {
        return noOflegs;
    }

    public void setNoOflegs(int noOflegs) {
        this.noOflegs = noOflegs;
    }
}
