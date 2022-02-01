package com.company.Bog;

public class Bog {
    private String ISBNNummer;
    private String titel;
    private int udgivelsesÅr;

    public Bog(){}

    public Bog(String ISBNNummer, String titel, int udgivelsesÅr){
        this.ISBNNummer = ISBNNummer;
        this.titel = titel;
        this.udgivelsesÅr = udgivelsesÅr;
    }

    public String getISBNNummer() {
        return ISBNNummer;
    }

    public void setISBNNummer(String ISBNNummer) {
        this.ISBNNummer = ISBNNummer;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getUdgivelsesÅr() {
        return udgivelsesÅr;
    }

    public void setUdgivelsesÅr(int udgivelsesÅr) {
        this.udgivelsesÅr = udgivelsesÅr;
    }

    @Override
    public String toString(){
        return "ISBN-nummer: " + ISBNNummer + " | " +
                "Titel: " + titel  + " | " +
                "Udgivelsesår: " + udgivelsesÅr;
    }


    public static void main(String[] args) {

    }
}
