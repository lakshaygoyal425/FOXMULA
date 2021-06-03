package com.example.Assignment3;
import java.util.*;


public class CalculateFrequency {
    static void frequencyNumber(ArrayList<Integer> arr, int size)
    {

        HashMap<Integer, Integer> Map = new HashMap<>();

        for (int i=0; i<size; i++) {
            if (Map.containsKey(arr.get(i))) {

                Map.put(arr.get(i), Map.get(arr.get(i)) + 1);
            }
            else {

                Map.put(arr.get(i), 1);
            }
        }

        for (Map.Entry entry : Map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public static void main(String[] args)
    {
        int choice;
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        while(true)
        {
            System.out.println("1. Add Element to ArrayList");
            System.out.println("2. Calculate Frequency of each element");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the element:");
                    int data = sc.nextInt();
                    arr.add(data);
                    break;

                case 2:
                    if(arr.isEmpty()){
                        System.out.println("ArrayList is Empty!");
                    }
                    else{
                        int size = arr.size();
                        frequencyNumber(arr,size);
                    }
                    break;

                default:
                    System.out.println("Bye!");
                    return;
            }
        }
    }
}
