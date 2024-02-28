package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
            if(isValidTrangle(firstSide , secondSide , thirdSide)){
                System.out.println("Valid trancle sides ");
            }else{
                System.out.println("Invalid trangle :");
            }
    }

    public boolean isValidTrangle(double first , double second , double third){
        return (first + second > third) && (second + third  > first) && (first + third > second);
    }

}
