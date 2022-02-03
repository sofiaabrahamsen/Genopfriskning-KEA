package com.company.Græs;

import java.util.Scanner;

public class Græs {
    //græsset vokser 0,8 cm om dagen om sommeren.
    //metoder, 2 parameter, græsset længde lige nu, hvor højt det må være for at skulle slås.
    // skal beregne og returnere hvor mange dage der er til det skal slås næste gang.
    double græsVokserOmDagen = 0.8;

    public double DageTilGræssetSkalSlås(double græsNu, double græsMaxHøjde) {
        double result = (græsNu-græsMaxHøjde)/græsVokserOmDagen;
        return result;
    }

    public static void main(String[] args) {
        Græs græs = new Græs();
        System.out.println(græs.DageTilGræssetSkalSlås(1,0.8) + " dage til græsset skal slås");
    }
}
