package org.example;

public class FuelCalculator {
    int litresPer100Km;


    public FuelCalculator() {
        this.litresPer100Km = 5;

    }

    public double calculatePrice(int litres,double pricePerLitre){
        return litres * pricePerLitre;



    }

    public int calculaterConsumption(int distance) {
        int litres= distance * litresPer100Km / 100;
        return litres;

    }

}
