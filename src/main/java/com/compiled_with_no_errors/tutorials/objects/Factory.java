package com.compiled_with_no_errors.tutorials.objects;

/**
 * This class generates {@link Car} according to the requests,
 */
public class Factory {
    // This field stores Cars build by this factory.
    private static int NUMBER_OF_CARS_BUILT;

    /**
     * A private constructor to prevent multiple object creation
     */
    private Factory(){}

    /**
     * This method builds {@link Car} objects based on requested numbers.
     * @param numberOfCars Number of {@link Car} to be build.
     * @return List of Cars
     * @implNote if {@code numberOfCars} is invalid, will return {@code null}.
     */
    public static Car[] buildCars(int numberOfCars){
        // Return nothing if numberOfCars is invalid.
        if (numberOfCars <= 0)
            return null;

        // Declare & Initialize cars array.
        Car[] cars = new Car[numberOfCars];

        // Instantiate cars array.
        for (int i = 0; i < numberOfCars; i++) {
            cars[i] = new Car(i+1);
        }

        NUMBER_OF_CARS_BUILT += numberOfCars;
        return cars;
    }

    /**
     * A method to acquire nubmer of cars built.
     * @return the number of cars built so far
     */
    public static int getNumberOfCarsBuilt() {
        return NUMBER_OF_CARS_BUILT;
    }


    public void dummy(){
        System.out.println("DUMMY");
    }
}
