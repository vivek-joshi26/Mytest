package Basic.Data.Structures;

public class LinkedList {
    Node head;                  //creating Node as a member
    static class Node{          //creating inner Class Node
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    void printlist(){       //to print the complete list
        Node n =head;
        if(head==null)
            System.out.println("List is empty.");
        else{
            while(n!=null){
                System.out.print(n.data+" ");
                n=n.next;
            }
            System.out.println();
        }

    }

    void insertatStart(Node insertAt1){        //To insert a value at the starting of the list
        insertAt1.next=head;
        head=insertAt1;
        System.out.println(insertAt1.data+" inserted at first position.");
    }

    public int sizeofList(){
        Node n=head;
        int size=0;
        while(n!=null){
            size+=1;
            n=n.next;
        }
        return size;
    }

    public void insertatEnd(Node insertAt1){            //To insert a value at the end of the list
        Node n=head;
        while (n.next!=null){
            n=n.next;
            //System.out.println(n.data);
        }
        n.next=insertAt1;
    }

    public void insertatMiddle(Node insertAtMiddle,int j){      //To insert a value at the middle of the list
        int counter=1;
        Node n=head;
        if (j==1) {
            insertAtMiddle.next = head;
            head = insertAtMiddle;
        }
        /*          //to insert at the last by adding j+1
        else if(j==sizeofList()){
            while (n.next!=null){
                n=n.next;
                //System.out.println(n.data);
            }
            n.next=insertAtMiddle;

        }*/
        else
        {
            while (counter<j-1){
                counter+=1;
                n=n.next;
            }
            Node temp;
            temp=n.next;
            n.next=insertAtMiddle;
            insertAtMiddle.next=temp;
        }

    }

    public void findPosition(int d){        //to find the position of a particular data
        Node n=head;
        int position=1;
        boolean found=false;
        while (n!=null){
            if(n.data==d){
                found=true;
                System.out.println("Element:"+n.data+" is present at:"+position+" position.");
                n=n.next;
                position+=1;
                //break;                     //to find the 1st occurrence of that data
                continue;                   //to find all the occurrences of that data
            }
            else {
                n=n.next;
                position+=1;
            }
        }
        if (found==false)
            System.out.println("Element:"+d+" is not present.");

    }

    public void deleteElement(int j){       //to delete an element from the list
        Node n=head;
        Node temp=null;
        boolean found=false;


        while (n!=null){
            if(n.data==j){
                if(n==head){
                    head=n.next;
                    //System.out.println("Inside 1");
                    found=true;
                    n=n.next;
                    //break;                  //to delete only the 1st occurrence of that data
                    continue;               //to delete all occurrences of that data
                }
                else{
                    temp.next=n.next;
                    //System.out.println("Inside 2");
                    found=true;
                    n=n.next;
                    //break;                //to delete only the 1st occurrence of that data
                    continue;               //to delete all occurrences of that data
                }
            }
            else{
                temp=n;
                n=n.next;
                //System.out.println("Inside 3");
            }

        }
        if (found==false)
            System.out.println("Element:"+j+" is not present.");
    }
    

    public static void main(String[] args) {
        LinkedList llist=new LinkedList();
        llist.head=new Node(1);         //head of the list
        Node second=new Node(2);
        Node third=new Node(3);
        llist.head.next=second;             //assigning next to the head
        second.next=third;
        System.out.println(llist.head.data);        //printing data at the head
        System.out.println(llist.head.next.next.data);  //printing data at the third place using head
        System.out.println(llist.head.next);            //printing the location of the second Node
        System.out.println(second.data);
        System.out.println(second.next.data);
        System.out.println(second.next);
        System.out.println(third.data);
        System.out.println(third.next);
        Node newFirst=new Node(5);
        llist.insertatStart(newFirst);
        llist.printlist();              //printing the complete list
        //System.out.println();
        int size=llist.sizeofList();    //to get the current size of the list
        System.out.println(size);

        Node newLast=new Node(6);
        llist.insertatEnd(newLast);     //to insert at the end of the list
        llist.printlist();

        //System.out.println();
        Node newMiddle=new Node(7);
        //int position=llist.sizeofList();
        int position=1;
        llist.insertatMiddle(newMiddle,position);   //to insert an element at a particular position
        llist.printlist();

        //System.out.println();
        llist.findPosition(7);          //to find the position of a particular element in the list
        LinkedList llist2=new LinkedList();
        llist2.printlist();
        llist2.head=new Node(2);
        llist2.printlist();

        //System.out.println();
        llist.deleteElement(9);         //to delete an element from the list
        //System.out.println();
        llist.deleteElement(7);         //to delete an element from the list
        llist.printlist();
        //System.out.println();

        Node new1=new Node(2);
        llist.insertatEnd(new1);

        Node new2=new Node(2);
        llist.insertatEnd(new2);

        Node new3=new Node(2);
        llist.insertatStart(new3);
        llist.printlist();
        int del=5;
        llist.deleteElement(del);
        llist.printlist();
        llist.findPosition(2);



    }
}
