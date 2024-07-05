package com.nlu.DecentAndCraft.exception;

public class BlogNotFoundException extends RuntimeException{
    public BlogNotFoundException() {
        super("Blog not found");
    }
}
