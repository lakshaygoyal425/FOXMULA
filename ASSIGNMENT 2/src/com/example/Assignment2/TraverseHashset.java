package com.example.Assignment2;
import java.util.*;


public class TraverseHashset {
    public static void main(String[] args)
    {
        int choice;
        String str;
        Scanner scanner = new Scanner(System.in);

        HashSet<String> set1 = new HashSet<>();

        while(true)
        {
            System.out.println("1. Add Text to HashSet");
            System.out.println("2. Traverse the List");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the text:");
                    str = scanner.next();
                    set1.add(str);
                    break;

                case 2:
                    if(set1.isEmpty()){
                        System.out.println("HashSet is Empty!");
                    }
                    else{
                        for (String s : set1) System.out.println(s);
                    }
                    break;


                default:
                    System.out.println("Bye!");
                    return;
            }
        }
    }
}
