package com.greatlearning.currencycalculator.driver;

import java.util.ArrayList;

import com.greatlearning.currencycalculator.service.CurrencyCollectorService;
import com.greatlearning.utils.*;

public class CurrencyCalculateDriver {

    public static void main(String[] args) {
        CurrencyCollectorService cc = new CurrencyCollectorService();
        int[] curr_denom = cc.collectCurrencyDenominations();

        Utils utils = new Utils();
        curr_denom = utils.selectionSort(curr_denom);

        int amount = cc.collectAmount();

        ArrayList ccyList = cc.calcCurrencyDenominations(curr_denom.length, amount, curr_denom);

        System.out.println("Your payment approach in order to give min no of notes will be");
        System.out.println(ccyList.toString());

    }
}
