package com.example.Assignment2;
import java.util.*;


public class Hast_Set {
    public static void main(String[] args) {
        int choice;
        String str;
        Scanner scanner = new Scanner(System.in);

        HashSet<String> set1 = new HashSet<>();

        while (true) {
            System.out.println("1. Add Text to HashSet");
            System.out.println("2. Print the Set");
            System.out.println("3. Check if the List contains an Element");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Text:");
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

                case 3:
                    if(set1.isEmpty()){
                        System.out.println("HashSet is Empty!");
                        break;
                    }
                    else {
                        System.out.println("Enter the Text to be checked:");
                        str = scanner.next();
                        if (set1.contains(str)) {
                            System.out.println("Text Present in Set");
                            break;
                        } else {
                            System.out.println("Text Doesn't Present in Set");
                            break;
                        }
                    }

                default:
                    System.out.println("Bye!");
                    return;
            }
        }
    }
}
