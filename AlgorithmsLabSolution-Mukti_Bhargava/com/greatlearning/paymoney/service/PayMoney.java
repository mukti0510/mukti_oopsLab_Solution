package com.greatlearning.paymoney.service;

import java.util.Scanner;

public class PayMoney {

    /*
     * Question 1
     * 
     * PayMoney. processes thousands of transactions daily amounting to crores of
     * Rupees. They also have a daily target that they must achieve. Given a list of
     * transactions done by PayMoney and a daily target, your task is to determine
     * at which transaction PayMoney achieves the same. If the target is not
     * achievable, then display the target is not achieved.
     * 
     * TestCase 1
     * 
     * Enter the size of transaction array 3
     * 
     * Enter the values of array 20 12 31
     * 
     * Enter the total no of targets that needs to be achieved 2
     * 
     * Enter the value of target 21
     * 
     * Target achieved after 2 transactions
     * 
     * Enter the value of target 19
     * 
     * Target achieved after 1 transactions
     * 
     * Explanation Target 1 i.e 21 is achieved after 2 transactions, (20 + 12)
     * Target 2 i.e 19 is achieved in the 1st transaction itself.
     */
    private int tranCount;
    // Defining Transactions as double since its Money and they can be in decimals
    private double[] transactions;

    public PayMoney() {
    }

    public void collectTransactionData() {
        Scanner sc = new Scanner(System.in);

        // Collect Transaction Data
        System.out.println("Enter transaction size of transaction array ");
        tranCount = sc.nextInt();
        transactions = new double[tranCount];
        System.out.println("Enter the values of array ");
        for (int i = 0; i < tranCount; i++) {
            transactions[i] = sc.nextInt();
        }
    }

    public void collectAndVerifyTarget() {

        // Collect & Validate Target Data
        System.out.println("Enter the total no of targets that needs to be achieved");
        Scanner sc = new Scanner(System.in);
        int tCount = sc.nextInt();
        for (int i = 0; i < tCount; i++) {
            System.out.println("Enter the value of target ");
            double d = sc.nextDouble();
            double aTarget = 0;
            for (int j = 0; j < tranCount; j++) {
                aTarget = aTarget + transactions[j];
                if (aTarget >= d) {
                    System.out.println("Target achieved after " + (j + 1) + " transactions \n");
                    break;
                }
            }
            if (aTarget < d) {
                System.out.println("Given target is not achieved");
            }
        }
    }
}
