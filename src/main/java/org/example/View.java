package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class View {
    public static void Welcome () {
        System.out.println("Prize drawing is beginning!");
    }
    public static void PrintList(ArrayList<Toys> goodsList) {
        System.out.println("Id \t Name \t\t Pcs \t Weight \t");
        for (int i = 0; i < goodsList.size(); i++) {
            Toys toy = goodsList.get(i);
            System.out.println(toy.getId() + "\t" + toy.getName() + "\t\t" + toy.getPcs() + "  \t" + toy.getWeight());
        }
    }
}
