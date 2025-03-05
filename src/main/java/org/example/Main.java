package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        while(true){

            System.out.println("Give distance: ");
            Scanner sc = new Scanner(System.in);
            int distance = sc.nextInt();
            System.out.println("Give fuel price : ");
            double price = sc.nextDouble();
            FuelCalculator fc = new FuelCalculator();
            int litres = fc.calculaterConsumption(distance);
            double totalCost = fc.calculatePrice(litres, price);

            System.out.println("You will need " + litres + " litres of fuel for the trip");
            System.out.println("Total cost of the trip is: " + totalCost);

            break;
        }




    }
}