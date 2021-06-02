package com.example.Assignment2;
import java.util.*;

public class TraverseTreeSet {
    public static void main(String[] args)
    {
        int choice;
        String str;
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> set1 = new TreeSet<>();

        while(true)
        {
            System.out.println("1. Add Text to TreeSet");
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
                        System.out.println("TreeSet is Empty!");
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
