package com.compiled_with_no_errors.tutorials.oop.inheritance;

public class Dog extends Animal{
    // This field exist only for tutorial purposes
    private final int commonField = 1;

    /**
     * Constructor to create a dog
     */
    public Dog() {
        super("Dog");
    }

    /**
     * Specific constructor for each breed.
     * @param breed Breed of the dog
     */
    protected Dog(String breed){
        super(breed);
    }

    /**
     * Dogs can bark if needed.
     */
    public void bark(){
        System.out.println("Barking!!!");
    }

    /**
     * This method shows use of 'this' and 'super' keyword.
     */
    public void printCommonFields(){
        System.out.println("Animal field is " + super.commonField);
        System.out.println("Dog field is " + this.commonField);
    }
}
