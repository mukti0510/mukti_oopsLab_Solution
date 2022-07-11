package com.greatlearning.currencycalculator.service;

import java.util.ArrayList;
import java.util.Scanner;


public class CurrencyCollectorService {

    Scanner sc = new Scanner(System.in);

    public CurrencyCollectorService() {
    }

    public int[] collectCurrencyDenominations() { /*this method will 
    												get the number of currencies to be used by user*/

        System.out.println("Enter the size of currency denominations");
        int denominationCount = sc.nextInt();

        System.out.println("Enter the currency denominations value");
        int[] denominations = new int[denominationCount];
        for (int i = 0; i < denominationCount; i++) {
            denominations[i] = sc.nextInt();
        }

        return denominations;
    }

    public int collectAmount() {
        System.out.println("Enter the amount you want to pay");
        int amount = sc.nextInt();
        return amount;
    }

    public ArrayList calcCurrencyDenominations(int dCount, int amt, int[] d) {
        int t_q = 0;
        int t_rem = amt;
        ArrayList denom = new ArrayList();
        for (int j = 0; j < dCount; j++) {
            t_q = t_rem / d[j];
            t_rem = t_rem % d[j];
            if (t_q != 0) {
                denom.add(d[j] + ":" + t_q);
            }
        }
        return denom;
    }
}
