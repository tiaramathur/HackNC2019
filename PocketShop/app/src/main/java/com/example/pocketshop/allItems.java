package com.example.pocketshop;

public class allItems {

    private String name;
    private int unitsSold;
    private int percentChange;

    public allItems(String name, int unitsSold, int percentChange) {
        this.name = name;
        this.unitsSold = unitsSold;
        this.percentChange = percentChange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }

    public void setPercentChange(int percentChange) {
        this.percentChange = percentChange;
    }
    public String getName() {
        return name;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public int getPercentChange() {
        return percentChange;
    }
}
