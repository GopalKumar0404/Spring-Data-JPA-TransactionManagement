package com.gopal.SpringDataJPATransactionManagement.exception;

public class InsufficientFundException extends RuntimeException {
    public InsufficientFundException(String msg) {
        super(msg);
//        throw new RuntimeException(s);
    }
}
