package com.nlu.DecentAndCraft.exception;

public class AddressNotFoundException extends RuntimeException{
    public AddressNotFoundException() {
        super("Address not found");
    }
}
