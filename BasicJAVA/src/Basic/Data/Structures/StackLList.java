package Basic.Data.Structures;                  //STACK Implementation using LinkedList

public class StackLList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }

    void isEmpty(){                                     //to check if stack has elements or not
        if(head==null){
            System.out.println("Stack is Empty.");

        }
        else
            System.out.println("Stack has elements.");
    }

    void push(int d){                                   //to push an element into the stack
      Node n=new Node(d);
       if(head==null){
           head=n;
           System.out.println(head.data+" pushed into Stack.");
       }
       else{
           n.next=head;
           head=n;
           System.out.println(head.data+" pushed into the Stack.");
       }
    }

    void pop(){                                         //to pop the top element
        if(head==null)
            System.out.println("Stack is underflow");
        else{
            System.out.println("Element :"+head.data+" is popped.");
            head=head.next;
        }
    }

    void peek(){                                        //to print the top element
        if(head==null)
            System.out.println("Stack is underflow.");
        else
            System.out.println("Top is:"+head.data);
    }

    void printStack(){                                  //to print the Stack
        if(head==null)
            System.out.println("Stack underflow.");
        else {
            Node n=head;
            while(n!=null){
                System.out.print(n.data+" ");
                n=n.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StackLList first=new StackLList();
        first.push(1);                      // to push element into the Stack
        first.push(2);
        first.push(3);
        first.push(4);
        first.push(5);
        first.isEmpty();                        //to check if the Stack has elements or not
        first.peek();                           //to find the top of the stack
        first.printStack();                     //to print the stack
        first.pop();                            //to pop the top element from the stack
        first.printStack();
        StackLList obj2=new StackLList();
        obj2.isEmpty();
    }

}
