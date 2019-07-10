package com.lesson6.HW.Exeptions;

public class BadRequestException extends Exception {
    public BadRequestException(String masage) {
        super(masage);
    }
}
