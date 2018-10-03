import java.util.Scanner;

public class SpecialStack
{
    public static void main(String[] args)
    {
        Operations operations=new Operations();
        operations.push(1);
        operations.push(2);
        operations.push(3);
        operations.push(4);
        operations.push(5);
        operations.push(6);
        for(int i=0;i<6;i++)
        {
            System.out.println(operations.stack[i]);
        }
        operations.pop(6);
        System.out.println(operations.getMin(operations.stack));
        System.out.println(operations.isFull());
        System.out.println(operations.isEmpty());
    }
}
class Operations
{
    int capacity=6;
    int[] stack=new int[capacity];
    int top=-1;
    void push(int item)
    {
        if(isFull())
        {
            return ;
        }
        else
        {
            stack[++top]=item;

        }
    }
    int pop(int del)
    {
        if(isEmpty())
        {
            return 0;
        }
        else
        {
            del=stack[top];
            top--;
        }
        return top;
    }
    boolean isFull()
    {
        if(top==capacity-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    int getMin(int[] stack)
    {
        int i;
        int min = stack[0];
        for(i = 1; i < stack.length; i++)
        {
            if(min > stack[i])
            {
                min = stack[i];
            }
        }
        return min;
    }

}