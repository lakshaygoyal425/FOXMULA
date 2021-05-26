package Assignemt1;
import java.util.*;

class StackImp
{
    public void display(Stack st1,Stack st2)
    {
        if(st1.count()==st2.count())
        {
            System.out.println("Total Numbers of Elements in both stack is : " + st2.count());
        }
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Stack s1 = new Stack(20);
        Stack s2 = new Stack(20);
        int ch, data;
        StackImp si = new StackImp();
        while(true)
        {
            System.out.println("\n1. Push in Stack 1");
            System.out.println("2. Push in Stack 2");
            System.out.println("3. Pop in Stack 1");
            System.out.println("4. Pop in Stack 1");
            System.out.println("5. Check Empty in Stack 1");
            System.out.println("6. Check Empty in Stack 2");
            System.out.println("Enter Your Choice : ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter The Data");
                    data = sc.nextInt();
                    s1.push(data);
                    si.display(s1,s2);
                    break;
                case 2:
                    System.out.println("Enter The Data");
                    data=sc.nextInt();
                    s2.push(data);
                    si.display(s1,s2);
                    break;
                case 3:
                    System.out.println(s1.pop());
                    si.display(s1,s2);
                    break;
                case 4:
                    System.out.println(s2.pop());
                    si.display(s1,s2);
                    break;
                case 5:
                    System.out.println(s1.checkEmpty());
                    break;
                case 6:
                    System.out.println(s2.checkEmpty());
                    break;
                default:
            }
        }
    }
}

class Stack
{
    private int[] s;
    private int top, max;
    Stack(int i)
    {
        max = i;
        s = new int[max];
        top = -1;
    }
    void push(int data)
    {
        if(top==max)
        {
            System.out.print("Stack is Overflow");
        }
        else
        {
            s[++top]=data;
        }
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.print("Stack is Underflow");
            return 0;
        }
        else
        {
            return s[top--];
        }
    }
    boolean checkEmpty()
    {
        if(max==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int count()
    {
        if(top>-1)
            return top+1;
        else
            return 0;
    }
}

