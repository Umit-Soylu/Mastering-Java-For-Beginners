package com.compiled_with_no_errors.tutorials.variables;

public class Casting {
    byte myByte = 100;
    short myShort = 1000;
    int myInt = 10_000; // 10000
    long myLong = 1_000_000_000;

    public static void main(String[] args) {
        // Initialize the object for Casting
        Casting object = new Casting();

        System.out.println("myByte = " + object.myByte);
        System.out.println("myShort = " + object.myShort);
        System.out.println("myInt = " + object.myInt);
        System.out.println("myLong = " + object.myLong);

        // Widening casting example
        System.out.println("Widening Examples");

        object.myShort = object.myByte;
        System.out.println("After assigning - myShort = " + object.myShort);

        object.myInt = object.myShort;
        System.out.println("After assigning - myInt = " + object.myInt);

        object.myLong = object.myInt;
        System.out.println("After assigning - myLong = " + object.myLong);

        // Narrowing casting example
        System.out.println("Narrowing Examples");

        object.myLong = Long.MAX_VALUE;
        System.out.println("myLong = " + object.myLong);

        object.myInt = (int) object.myLong;
        System.out.println("After assigning - myInt = " + object.myInt);

        object.myInt = Integer.MIN_VALUE;
        System.out.println("myInt = " + object.myInt);

        object.myShort = (short) object.myInt;
        System.out.println("After assigning - myShort = " + object.myShort);

        object.myByte = (byte) object.myShort;
        System.out.println("After assigning - myByte = " + object.myByte);
    }

}
