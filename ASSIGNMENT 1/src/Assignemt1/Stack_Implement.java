package Assignemt1;
import java.util.*;


class StackImp
{
    public void display(Stack s1, Stack s2)
    {
        if(s1.count()==s2.count())
        {
            System.out.println("Total number of elements in both stack are same: "+s1.count());
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack S1 = new Stack();
        Stack S2 = new Stack();
        int ch, data;
        StackImp si = new StackImp();

        while(true)
        {
            System.out.println("Enter a valid choice:");
            System.out.println("1. Push in Stack 1");
            System.out.println("2. Push in Stack 2");
            System.out.println("3. Pop in Stack 1");
            System.out.println("4. Pop in Stack 1");
            System.out.println("5. Check Empty in Stack 1");
            System.out.println("6. Check Empty in Stack 2");
            System.out.println("7. Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.println("Enter the Data: ");
                    data = sc.nextInt();
                    S1.push(data);
                    si.display(S1, S2);
                }
                case 2 -> {
                    System.out.println("Enter the Data: ");
                    data = sc.nextInt();
                    S2.push(data);
                    si.display(S1, S2);
                }
                case 3 -> {
                    S1.pop();
                    si.display(S1, S2);
                }
                case 4 -> {
                    S2.pop();
                    si.display(S1, S2);
                }
                case 5 -> System.out.println(S1.checkEmpty());
                case 6 -> System.out.println(S2.checkEmpty());
                case 7 -> System.exit(0);
            }
        }
    }
}