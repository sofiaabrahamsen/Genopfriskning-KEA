package com.company;

import java.util.ArrayList;

public class Arraylist {
    ArrayList<String> liste = new ArrayList<>();

    public boolean doesArrayListContrainString(ArrayList liste, String userInput) {
    if (liste.contains(userInput)) {
        System.out.println("True! This string has been found in the list!");
        return true;
    } else {
        System.out.println("False! This string has been found in the list, and will now be added");
        liste.add(userInput);
        return false;
    }
    }

    public static void main(String[] args) {
        Arraylist arraylist = new Arraylist();
        arraylist.liste.add("hej");
        arraylist.doesArrayListContrainString(arraylist.liste, "hej");
        arraylist.doesArrayListContrainString(arraylist.liste, "hello");
        arraylist.doesArrayListContrainString(arraylist.liste, "hello");

        //tjekker om hello bliver added til listen!
        System.out.println("\n" + arraylist.liste);
    }
}
