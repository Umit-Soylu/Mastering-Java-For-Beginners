package com.compiled_with_no_errors.tutorials.oop.inheritance;

public class Bird extends Animal{
    /**
     * Constructor for Bird
     */
    public Bird() {
        super("Bird");
    }

    /**
     * Birds can fly.
     */
    public void fly(){
        for (int i = 0; i < 4; i++) {
            super.move();
        }
    }
}
