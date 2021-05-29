package Assignemt1;

class Stack
{

    private static class Node
    {
        int data;
        Node next;
    }

    Node head;

    Stack()
    {
        this.head = null;
    }

    public void push(int x)
    {
        Node temp = new Node();

        temp.data = x;
        temp.next = head;

        head = temp;
    }

    public void pop()
    {
        System.out.println("Element Popped : "+ head.data);
            head = head.next;

    }

    public boolean checkEmpty()
    {
        return head == null;
    }

    public int count()
    {
        int count = 0;
        Node temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }
}
