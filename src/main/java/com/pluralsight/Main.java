package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("Lakefront home", "5/1/2024", 1350000.00, "1126 Briercliff Dr", 1, 2675, 11761));
        assets.add(new House("Beach home", "12/14/2021", 1999000.00, "900 N Shore Dr", 1, 2754, 7429));
        assets.add(new Vehicle("Nissan GT-R", "3/21/2024",115251.00 , "Nissan GT-R", 2012, 23056 ));
        assets.add(new Vehicle("Nissan 370z", "4/15/2021", 30000.00, "Nissan 370z", 2020, 100));
        assets.add(new Asset("iPhone 14 Pro Max", "12/15/2022", 1000.00));
        for (Asset asset : assets) {
            System.out.println(asset);
        }
    }
}
