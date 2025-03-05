package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FuelCalculatorTest {

    FuelCalculator fc = new FuelCalculator();

@Test
void calculatePrice() {
    double price = 1.5;
    int litres = 100;
    assertEquals(150, fc.calculatePrice(litres, price));



    }

    @Test
    void calculaterConsumption() {
    int distance = 100;
    assertEquals(5, fc.calculaterConsumption(distance));


    }
}