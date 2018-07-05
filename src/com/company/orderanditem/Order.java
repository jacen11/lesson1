package com.company.orderanditem;

import java.util.ArrayList;

public class Order {

    ArrayList<Item> items = new ArrayList<>();

    public Order(Item... items) {
        for(Item item:items){
            if(item!=null){
                this.items.add(item);
            }
        }
    }

    public void printAll(){
        for(Item e : items){
            System.out.println(e.getName());
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItems(Item item) {
        if(item!=null){
            this.items.add(item);
        }
    }
}
