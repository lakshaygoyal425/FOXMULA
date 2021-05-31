package com.example.Assignment2;
import java.util.*;


public class Occurence {
    public static void count(ArrayList<String> arr)
    {
        HashSet<String> hash = new HashSet<>(arr);

        for(String s : hash)
        {
            System.out.println(s+": " + Collections.frequency(arr, s));
        }
    }

    public static void main(String[] args)
    {
        int choice;
        String str;
        Scanner sc = new Scanner(System.in);

        ArrayList<String> arr = new ArrayList<>();

        while(true)
        {
            System.out.println("1. Add Element to ArrayList");
            System.out.println("2. Check if the occurrence of each element");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element:");
                    str = sc.next();
                    arr.add(str);
                    break;

                case 2:
                    if(arr.isEmpty()){
                        System.out.println("ArrayList is Empty!");
                    }
                    else{
                        count(arr);
                    }
                    break;

                default:
                    System.out.println("Bye!");
                    return;
            }
        }
    }
}
