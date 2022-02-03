package com.company.Græs;

import java.util.Scanner;

public class Græs {
    //græsset vokser 0,8 cm om dagen om sommeren.
    //metoder, 2 parameter, græsset længde lige nu, hvor højt det må være for at skulle slås.
    // skal beregne og returnere hvor mange dage der er til det skal slås næste gang.
    double græsVokserOmDagen = 0.8;

    public double DageTilGræssetSkalSlås() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Indtast græssets længde nu: ");
        double græsNu = userInput.nextDouble();
        System.out.println("Indtast den længde græsset skal være før det skal slås: ");
        double græsMaxHøjde = userInput.nextDouble();
        double result = (græsNu-græsMaxHøjde)/græsVokserOmDagen;
        return result;
    }

    public static void main(String[] args) {
        Græs græs = new Græs();
        System.out.println(græs.DageTilGræssetSkalSlås() + " dage til græsset skal slås");
    }
}
