package com.compiled_with_no_errors.tutorials.oop.inheritance;

/**
 * Dogs are humans best friend.
 */
public class Dog extends Animal{


    /**
     * The constructor for Dog
     */
    public Dog() {
        super("Dog");
    }

    /**
     * Constructor for child of Dog
     * @param kind Kind of the input
     */
    protected Dog(String kind){
        super(kind);
    }

    /**
     * Dogs can bark, while some other animals cannot.
     */
    public void bark(){
        System.out.println("Barking!!!");
    }
}
