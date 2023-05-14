package org.example;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Random;

public class Controller {
    public Controller Start () {
        View.Welcome();
        ArrayList<Toys> warehouse = GoodsList();
        View.PrintList(warehouse);
        ArrayList<Toys> prizeList = GetPrizes(warehouse);
        View.PrintList(prizeList);
        System.out.println("Balance in the warehouse");
        View.PrintList(warehouse);
        return null;
    }
    public ArrayList<Toys> GoodsList () {
        ArrayList<Toys> genList = new ArrayList();
        String[] types = {"Robot 20", "Constructor 30", "Doll 20"};
        for (int i = 0; i < types.length; i++) {
            int weight = Integer.parseInt(types[i].split(" ")[1]);
            int random = new Random().nextInt(10, 50);
            genList.add(new Toys(i, types[i].split(" ")[0], random, weight));
        }
        return genList;
    }
    public ArrayList<Toys> GetPrizes(ArrayList<Toys> wrList) {
        ArrayList<Toys> prList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            prList.add(new Toys());
            int random = new Random().nextInt(0, 100);
            if (random < wrList.get(0).getWeight()) {
                prList.get(i).id = wrList.get(0).id;
                prList.get(i).name = wrList.get(0).name;
                prList.get(i).weight = wrList.get(0).weight;
                wrList.get(0).setPcs(wrList.get(0).getPcs() - 1);
                prList.get(i).setPcs(1);
            }
            else if (random > wrList.get(0).getWeight() && random < (wrList.get(0).getWeight() + wrList.get(1).getWeight())) {
                prList.get(i).id = wrList.get(1).id;
                prList.get(i).name = wrList.get(1).name;
                prList.get(i).weight = wrList.get(1).weight;
                wrList.get(1).setPcs(wrList.get(1).getPcs() - 1);
                prList.get(i).setPcs(1);
            }
            else {
                prList.get(i).id = wrList.get(2).id;
                prList.get(i).name = wrList.get(2).name;
                prList.get(i).weight = wrList.get(2).weight;
                wrList.get(2).setPcs(wrList.get(2).getPcs() - 1);
                prList.get(i).setPcs(1);
            }
        }
        System.out.println("List of prizes ->");
        return prList;
    }
}
