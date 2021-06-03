package com.example.Assignment3;
import java.util.*;


class InvalidPrimeOdd extends Exception{
    public InvalidPrimeOdd(String message) {
        super(message);
    }
}

public class CustomException {
    private static boolean checkPrime(int number) {
        if(number==2 || number==3) {
            return true;
        }
        if(number==1 || number%2==0 || number%3==0) {
            return false;
        }
        for(int i=5; i*i<=number;i=i+6) {
            if(number%i==0 || number%(i+2)==0) {
                return false;
            }
        }
        return true;

    }
    private static void checkPrimeOdd(int number) throws InvalidPrimeOdd {
        if(checkPrime(number) && number%2!=0) {
            throw new InvalidPrimeOdd("Invalid Number!");
        }
        else {
            System.out.println("No Exception!");
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number:");
        int data = scanner.nextInt();
        try {
            checkPrimeOdd(data);

        }
        catch (Exception e) {
            System.out.println("Exception Occured: " + e);
        }
    }
}