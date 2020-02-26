package Basic.Data.Structures;                      //Queue implementation using Array

public class QueueArray {                           //enqueue dequeue front rear
    int arr[];
    int rear,front,size;
    int capacity;
    QueueArray(int size){
        rear=front=0;
        capacity=size;
        arr=new int[size];
    }
    void enqueue(int data){                               //to push data into the queue

        if(rear==capacity){
            System.out.println("Queue is full");

        }
        else {
            //System.out.println("Inside 1");
            arr[rear] = data;
            rear = rear + 1;
        }
    }

    void dequeue(){                                      //to pop data from queue
        if(front==rear){
            System.out.println("Queue is Empty:");
        }
        else {
            System.out.println("Element : " + arr[front] + " removed from queue");
            front = front + 1;
        }
    }

    void printQueue(){                                  //to print the queue
        if(front==rear){
            System.out.println("Queue is Empty");
        }
        else {
            int n = front;
            while (n < rear) {
                System.out.print(arr[n] + " ");
                n += 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueArray obj=new QueueArray(2);
        obj.enqueue(1);
        obj.enqueue(2);
        obj.printQueue();
        obj.enqueue(3);
        obj.enqueue(4);
        obj.printQueue();
        obj.dequeue();
        obj.printQueue();
        obj.dequeue();
        obj.printQueue();
        obj.dequeue();

    }

}
