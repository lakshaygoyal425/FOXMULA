package com.example.Assignment3;
import java.util.*;
import java.util.Map.*;

public class FrequencySort {
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

        ArrayList<Map.Entry<Integer, Integer>> list1 = new ArrayList<>(hashMap.entrySet());
        
    	Collections.sort(list1, new Comparator<Map.Entry<Integer, Integer>>()
        {
           public int compare(Map.Entry<Integer, Integer> comparator1, Map.Entry<Integer, Integer> comparator2)
            {
                return (comparator1.getValue()).compareTo(comparator2.getValue());
            }
        });
        
		for(Map.Entry<Integer, Integer> entry : list1)
        {
            System.out.println(entry.getKey()+": "+entry.getValue());
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
            System.out.println("2. Calculate Sorted Array Based On Frequency");
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
