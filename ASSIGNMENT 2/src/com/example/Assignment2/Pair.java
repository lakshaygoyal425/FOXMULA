package com.example.Assignment2;
import java.util.*;


public class Pair {
    public static void pair(ArrayList<Integer> arr, Integer sum)
    {
        boolean flag = false;
        int low = 0, high = arr.size()-1;
        while(low < high) {
            if(arr.get(low) + arr.get(high) == sum) {
                System.out.println("Pair: (" +arr.get(low)+ "," +arr.get(high)+ ")");
                flag = true;
            }
            if(arr.get(low) + arr.get(high) > sum) {
                high--;
            }
            else {
                low++;
            }
        }
        if(!flag) {
            System.out.println("No pair possible");
        }
    }


    public static void main(String[] args) {
        int choice, x;
        int K;
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Element to ArrayList");
            System.out.println("2. Find the Pair");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element:");
                    int element = sc.nextInt();
                    arr.add(element);
                    break;

                case 2:
                    if (arr.isEmpty()) {
                        System.out.println("ArrayList is Empty!");
                    } else {
                        System.out.println("Enter The Value K: ");
                        K = sc.nextInt();
                        pair(arr, K);
                    }
                    break;

                default:
                    System.out.println("Bye!");
                    return;
            }
        }
    }
}
