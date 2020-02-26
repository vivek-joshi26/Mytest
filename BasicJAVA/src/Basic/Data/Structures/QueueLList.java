package Basic.Data.Structures;              //QUEUE implementation using LinkedList

public class QueueLList {
    Node head, last;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    void enqueue(int data){                 //to push data in the queue
        Node n=new Node(data);
        if(head==null) {
            head = n;
            last = n;
        }
        else {
            last.next=n;
            last=n;
        }
        System.out.println(data+" Added to the queue");

    }

    void dequeue(){                                     //to remove data from the Queue
        if(head==null){
            System.out.println("Queue is Empty");
        }
        else {
            System.out.println("Element : "+head.data+" removed from queue.");
            head=head.next;
        }
    }

    void printQueue(){                              //to print the Queue
        Node n=head;
        if(head==null){
            System.out.println("Queue is Empty.");
        }
        else {
            while (n!=null){
                System.out.print(n.data+" ");
                n=n.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueLList obj=new QueueLList();
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.printQueue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.printQueue();
    }
}
