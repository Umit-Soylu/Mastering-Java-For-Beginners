package com.compiled_with_no_errors.tutorials.program_flow.decision_making;

/**
 * This class shows Switch cases
 */
public class SwitchDecision {

    /**
     * This method will print the name of the month based on index
     * @param index index of the month
     */
    protected void printMonths(byte index){
        String nameOfMonth;

        /*
        if (index == 1)
            nameOfMonth = "January";
        else if (index == 2)
            nameOfMonth = "February";
        else if (index == 3 )
            nameOfMonth = "March";
        else if (index == 4)
            nameOfMonth = "April";
        else if (index == 5)
            nameOfMonth = "May";
        else if (index == 6)
            nameOfMonth = "June";
        else if (index == 7)
            nameOfMonth = "July";
        else if (index == 8)
            nameOfMonth = "August";
        else if (index == 9)
            nameOfMonth = "September";
        else if (index == 10)
            nameOfMonth = "October";
        else if (index == 11)
            nameOfMonth = "November";
        else if (index == 12)
            nameOfMonth = "December";
        else
            nameOfMonth = "Unknown";
        */

        switch (index){
            case 1:
                nameOfMonth = "January";
                break;
            case 2:
                nameOfMonth = "February";
                break;
            case 3:
                nameOfMonth = "March";
                break;
            case 4:
                nameOfMonth = "April";
                break;
            case 5:
                nameOfMonth = "May";
                break;
            case 6:
                nameOfMonth = "June";
                break;
            case 7:
                nameOfMonth = "July";
                break;
            case 8:
                nameOfMonth = "August";
                break;
            case 9:
                nameOfMonth = "September";
                break;
            case 10:
                nameOfMonth = "October";
                break;
            case 11:
                nameOfMonth = "November";
                break;
            case 12:
                nameOfMonth = "December";
                break;
            default:
                nameOfMonth = "Unknown";
                break;
        }
        System.out.println("Name of the Month for " + index + " is " + nameOfMonth);
    }

    /**
     * This method sum values from '10' to given index
     * @param lowerIndex lower index to sum values
     * @implSpec lowerIndex should be in between '0' and '10'
     */
    protected void sumValuesFromTen(byte lowerIndex){
        byte sum = 0;

        if (lowerIndex >= 0 && lowerIndex <= 10) {
            switch (lowerIndex) {
                case 0:
                case 1:
                    sum += 1;
                case 2:
                    sum += 2;
                case 3:
                    sum += 3;
                case 4:
                    sum += 4;
                case 5:
                    sum += 5;
                case 6:
                    sum += 6;
                case 7:
                    sum += 7;
                case 8:
                    sum += 8;
                case 9:
                    sum += 9;
                case 10:
                    sum += 10;
                    break;
                default:
                    break;
            }
            System.out.println("Sum for " + lowerIndex +" is " + sum);
        } else
            System.out.println("Improper input");
    }
}
