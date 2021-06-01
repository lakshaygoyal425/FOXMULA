package com.example.Assignment2;
import java.util.*;


public class Array_List {
    public static void main (String[] args) {

        int choice;
        String str;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Text to ArrayList");
            System.out.println("2. Print the List");
            System.out.println("3. Check if the List contains an Element");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Text:");
                    str = scanner.next();
                    list1.add(str);
                    break;

                case 2:
                    if(list1.isEmpty()){
                        System.out.println("ArrayList is Empty!");
                    }
                    else{
                        for (String s : list1) System.out.println(s);
                    }
                    break;

                case 3:
                    if(list1.isEmpty()){
                        System.out.println("ArrayList is Empty!");
                        break;
                    }
                    else {
                        System.out.println("Enter the Text to be checked:");
                        str = .next();
                        if (list1.contains(str)) {
                            System.out.println("Text Present in List");
                            break;
                        } else {
                            System.out.println("Text Doesn't Present in List");
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
