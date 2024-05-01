package com.gopal.SpringDataJPATransactionManagement.utils;

import com.gopal.SpringDataJPATransactionManagement.exception.InsufficientFundException;

import java.util.HashMap;
import java.util.Map;

public class PaymentInfoValidation {

    private static Map<String, Double> data = new HashMap<>();
    static {
        data.put("acc1", 10000.0);
        data.put("acc2", 12000.0);
        data.put("acc3", 13000.0);
        data.put("acc4", 12000.0);
        data.put("acc5", 18000.0);
    }

    public static boolean validate(String accountNumber, Double amount){
        if(data.get(accountNumber)>=amount){
            return true;
        } else
            throw new InsufficientFundException("Insufficient Fund...!!!");

    }


}
