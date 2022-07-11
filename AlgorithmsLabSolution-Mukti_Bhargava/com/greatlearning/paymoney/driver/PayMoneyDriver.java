package com.greatlearning.paymoney.driver;

import com.greatlearning.paymoney.service.PayMoney;

public class PayMoneyDriver {

    public static void main(String[] args) {
        PayMoney pm = new PayMoney();
        pm.collectTransactionData();
        pm.collectAndVerifyTarget();
    }
}
