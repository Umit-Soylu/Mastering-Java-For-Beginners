package com.compiled_with_no_errors.tutorials.variables;

public class Variables {

    // Primitive Types
    // Numeric types
    byte myByte = 100;                      // 8 bit variable [-128 .. 127].
    short myShort = 150;                    // 16 bit variable [-32768 .. 32767].
    int myInt = 2_147_483_647;              // 32 bit variable.
    long myLong = 9_223_372_036_854_775_806L;   // 64 bit variable, ends with 'L' or 'l'.

    // Floating Types
    float myFloat = 19.234F;                // 32 bit variable, ends with 'F' or 'f'.
    double myDouble = 134555.12345666778D;  // 64 bit variable, ends with 'D' or 'd'.

    // Remaining Primitive Types
    char myChar = 'S';
    boolean myBoolean = false;

    // Reference Type.
    Byte myByteRef = 100;                   // Reference type for byte.
    Short myShortRef = 150;                 // Reference type for short.
    Integer myIntRef = Integer.MIN_VALUE;   // Reference type for int.
    Long myLongRef = Long.MAX_VALUE;        // Reference type for long.

    Float myFloatRef = Float.MAX_VALUE;     // Reference type for float.
    Double myDoubleRef = Double.MIN_VALUE;  // Reference type for double.

    Character myCharRef = 'T';              // Reference type for char.
    Boolean myBooleanRef = Boolean.FALSE;   // Reference type for boolean.

    String myString = "Mastering Java For Beginners";

    public static void main(String[] args) {
        Variables var = new Variables();

        System.out.println("My Byte = " + var.myByte);
        System.out.println("My Byte Reference = " + var.myByteRef);


        System.out.println("My value = " + var.myFloatRef);
    }

}
