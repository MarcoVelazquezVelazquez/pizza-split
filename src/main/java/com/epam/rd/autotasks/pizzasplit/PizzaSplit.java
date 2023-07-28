package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner input = new Scanner(System.in);
        int numberOfPeople = input.nextInt();
        int numberOfPiecesPerPizza = input.nextInt();

        int numberOfPizzas = slicesPerPerson (numberOfPeople, numberOfPiecesPerPizza);

        System.out.println(numberOfPizzas);
    }

    public static int slicesPerPerson(int numberOfPeople, int numberOfPiecesPerPizza){

        int numberOfPizzas = 1;
        while (((numberOfPizzas * numberOfPiecesPerPizza) % numberOfPeople) != 0){
            numberOfPizzas++;
        }
        return numberOfPizzas;
    }
}

