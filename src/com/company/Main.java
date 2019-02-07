package com.company;

        /*
            Write a program that will allow a robot to assemble 10 burritos.
            Use a random generator for each burrito option and build a list of
            10 burrito customizations:

            Rice: white, brown, no rice
            Meat: chicken, steak, carnidas, chorizo, sofritas, veggies
            Beans: pinto, black, no beans
            Salsa: mild, medium, hot, no salsa
            Veggies: lettuce, fajita veggies, no veggies*
        */

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Initialization of random numbers specific to burrito options
        Random r = new Random();
        Random m = new Random();
        Random b = new Random();
        Random s = new Random();
        Random v = new Random();



        // Int list of random variables specific to burrito options
        int rx =  r.nextInt(3);
        int mx =  m.nextInt(6);
        int bx =  b.nextInt(3);
        int sx =  s.nextInt(4);
        int vx =  v.nextInt(4);



        //String array of Options
        String[] rice = {"white rice, ", "brown rice, ", "no rice, "};
        String[] meat = {"chicken meat", "steak meat", "carnidas meat", "chorizo meat", "sofritas", "veggies"};
        String[] beans = {"pinto beans", "black beans", "no beans"};
        String[] salsa = {"mild salsa", "medium salsa", "hot salsa","no salsa"};
        String[] veggies = {"lettuce", "fajita", "veggies", "no veggies"};

         for (int i = 1; i < 11; i++) {
                // int j = i + 1;
             System.out.print("Burrito "+i+": ");
             System.out.print(rice[r.nextInt(3)]);
             System.out.print(meat[m.nextInt(6)]+", " );
             System.out.print(beans[b.nextInt(3)]+", ");
             System.out.print(salsa[s.nextInt(4)]+", ");
             System.out.print(veggies[v.nextInt(4)]+", ");
             System.out.println();
             /* Tried to print an Array of Arrays, didn't like that one, next I'd attempt an array list of arrays, but the above code will do*/
                    // System.out.println("Burrito "+ i + ": "+ rice[rx] +" "+ meat[mx]+"," + beans[bx]);

             }

        }

        //String burrito[] = {rice[rx], meat[mx], beans[bx], salsa[sx], veggies[vx]};

        /*+ ", "+beans[bx]+ ", "+salsa[sx]+", "+veggies[vx]*/


        // Print
/*
        System.out.println("Burrito ");
        for (int i = 0; i <10 ; i++) {
            System.out.println("Burrito " + i + rice[rx] +"," + meat[mx]);
                            /*+ ", "+beans[bx]+ ", "+salsa[sx]+", "+veggies[vx]*/
}


