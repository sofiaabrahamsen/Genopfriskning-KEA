package com.company.Bog;

import java.util.ArrayList;

public class Bibliotek {
    private ArrayList<Bog> bibliotek = new ArrayList<>();


    public Boolean containsISBN(Bog testBog) {
        boolean result = false;
        for (int i = 0; i < bibliotek.size(); i++) {
            if (bibliotek.get(i).getISBNNummer().contains(testBog.getISBNNummer())) {
                System.out.println("True! listen indeholder allerede dette ISBN-nummer");
                result = true;
            }
        } return result;
    }

    public static void main(String[] args) {
    Bibliotek bibliotek = new Bibliotek();

    Bog bog1 = new Bog("9846576531", "Original bog 1", 2001);
    Bog bog2 = new Bog("9846576784", "Original bog 2", 2011);
    Bog bog3 = new Bog("9846576745", "Original bog 3", 2022);
    Bog bog4 = new Bog("98465767423", "Original bog 4", 2222);

    bibliotek.bibliotek.add(bog1);
    bibliotek.bibliotek.add(bog2);
    bibliotek.bibliotek.add(bog3);


    if (!bibliotek.containsISBN(bog4)){
        System.out.println("false!");
    }
    bibliotek.containsISBN(bog1);
    }

}
