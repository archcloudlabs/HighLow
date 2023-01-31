package com.archcloudlabs;

import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 */
public class App 
{
    public static void main(String[] args) {

        Random rand = new Random();
        Results res; // Enum
        SuperResults superRes;

        String[] record = new String[9];
        int counter = 0;
        int money = 100;

        /* 
        while (counter != 9) {
            int val = rand.nextInt(1, 100);

            if ((val % 2 == 0)) {
                System.out.println(Results.WINNER);
                res = Results.WINNER;
                record[counter] = res.toString(); // add win/loss to array
            } else {
                System.out.println(Results.LOSER);
                res = Results.LOSER;
                record[counter] = res.toString(); // add win/loss to array
            }

            counter += 1; // increment the counter each time.
            System.out.println("Counter is at :" + counter);
        }
        */


        while (counter !=9) {
            int val = rand.nextInt(1,100);

            if ((val % 2 == 0 )) {
                System.out.println(SuperResults.WINNER);
                superRes = SuperResults.WINNER;
                money = (money + SuperResults.WINNER.money);
                record[counter]  = superRes.toString(); // add win/loss to array
            } else {
                System.out.println(Results.LOSER);
                superRes = SuperResults.LOSER;
                money = (money - SuperResults.LOSER.money);
                record[counter]  = superRes.toString(); // add win/loss to array
            }

            counter += 1; // increment the counter each time.
            System.out.println("Counter is at :" + counter);
            System.out.println("Money is at :" + money);
    }
    
        // print win/loss record
        System.out.println(Arrays.toString(record));
    }
}
