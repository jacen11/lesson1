package com.company.customerImitation;

import com.company.orderanditem.*;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(new Item("qwe1"), new Item("qwe2"), null, new Item("qwe3"), new Item("qwe4"));

        //order.printAll();
        order.addItems(new Item("asd"));

        order.printAll();
    }
}
