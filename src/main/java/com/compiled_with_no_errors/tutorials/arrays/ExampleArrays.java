package com.compiled_with_no_errors.tutorials.arrays;

public class ExampleArrays {
    // Declare a byte array
    Byte[] myBytes;
    Character[] myChars;

    // Add given element for the given index
    public void fillByteArray(byte b, int index){
        myBytes[index] = b;
    }

    public void fillCharArray(){
        myChars[0] = 'A';
        myChars[3] = 'B';
        myChars[5] = 'C';
        myChars[8] = 'D';
        myChars[3] = 'E';
        myChars[4] = 'F';
    }

    public void printCharArray(){
        System.out.println("myChars[0]= " + myChars[0]);
        System.out.println("myChars[1]= " + myChars[1]);
        System.out.println("myChars[2]= " + myChars[2]);
        System.out.println("myChars[3]= " + myChars[3]);
        System.out.println("myChars[4]= " + myChars[4]);
        System.out.println("myChars[5]= " + myChars[5]);
        System.out.println("myChars[6]= " + myChars[6]);
        System.out.println("myChars[7]= " + myChars[7]);
        System.out.println("myChars[8]= " + myChars[8]);
        System.out.println("myChars[9]= " + myChars[9]);
    }

    public static void main(String[] args) {
        ExampleArrays object = new ExampleArrays();

        // Initialize the array.
        object.myBytes = new Byte[5]; //Index starts from 0 to 4
        object.myChars = new Character[10];

        object.fillByteArray((byte) 5, 0);
        object.fillByteArray((byte) 10, 1);
        object.fillByteArray((byte) 125, 2);
        //object.fillByteArray((byte) 5, -1); //This index does not exists.

        System.out.println("myBytes[0] = " + object.myBytes[0]);
        System.out.println("myBytes[1] = " + object.myBytes[1]);
        System.out.println("myBytes[2] = " + object.myBytes[2]);
        System.out.println("myBytes[3] = " + object.myBytes[3]);
        System.out.println("myBytes[4] = " + object.myBytes[4]);
        System.out.println("Length of byte array is " + object.myBytes.length);

        object.fillCharArray();
        object.printCharArray();
        System.out.println("Length of char array is " + object.myChars.length);
    }
}
