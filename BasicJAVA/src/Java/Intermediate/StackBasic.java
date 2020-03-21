package Java.Intermediate;

import java.util.*;

public class StackBasic {
    public static void print(Stack<String> s){
        if(s.isEmpty())
            System.out.println("Stack is emplty");
        else
            System.out.println(s);

    }
    public static void main(String[] args) {
        Stack<String> stack1=new Stack<>();             //stack implementation
        print(stack1);
        stack1.push("first");
        print(stack1);
        stack1.push("second");
        print(stack1);
        stack1.push("third");
        print(stack1);
        System.out.println("Peek is: "+stack1.peek());
        stack1.pop();
        print(stack1);
        stack1.pop();
        print(stack1);
        stack1.pop();
        print(stack1);

        PriorityQueue<String> pq1=new PriorityQueue<String>();      //priorityqueue implementation
        System.out.println(pq1);
        pq1.offer("first");
        pq1.offer("second");
        pq1.offer("third");
        System.out.println(pq1);
        System.out.println(pq1.peek());
        pq1.poll();
        System.out.println(pq1);


        String[] st1={"aa","bb","cc","bb","dd"};
        List<String> l1=Arrays.asList(st1);                     //a list that contains duplicate items in it
        System.out.println(l1);

        Set<String> set=new HashSet<>(l1);                      //a set that contains the item present in the above list, no duplicates will be there
        System.out.println(set);
    }
}
