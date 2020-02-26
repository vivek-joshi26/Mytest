package Basic.Data.Structures;

public class DLL {
    NodeD head;
    static class NodeD{
        int data;
        NodeD prev;
        NodeD next;
        NodeD(int d){
         data= d;
        prev = null;
        next = null;
    }
    }

    void printDLL(){        //to print the DLL
        NodeD n=head;
        while (n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.println();

    }

    void insertAtStart(NodeD start){        //to insert element at the start of the DLL
        if(head==null){
            System.out.println("DLL is empty");
        }
        else{
            head.prev=start;
            start.next=head;
            head=start;
        }
    }

    void insertAtLast(NodeD last){          //to insert element at the last
        NodeD n=head;
        while (n!=null){
            if(n.next==null){
                n.next=last;
                last.prev=n;
                break;
            }
            else
                n=n.next;
        }

    }

    void insertAtMiddle(NodeD middle,int pos){      //to insert data at the middle
        NodeD n=head;
        NodeD temp1=null;
        //NodeD temp2;
        int flag=0;
        while (n!=null){
            if(pos==1){
                head.prev=middle;
                middle.next=head;
                head=middle;
                break;
            }
            else{
                flag+=1;
                if(flag==pos){
                    temp1.next=middle;
                    middle.next=n;
                    n.prev=middle;
                    middle.prev=temp1;
                    break;
                }
                else {
                    temp1=n;
                    n = n.next;
                }
            }
        }
    }

    void deleteElement(int d){      //to delete an element only the first occurrence
        NodeD n=head;
        NodeD temp=null;
        Boolean flag=true;
        while (n!=null){
            if(n.data==d){
                flag=false;
                temp.next=n.next;
                n.next.prev=temp;
                break;
            }
            else {
                temp=n;
                n=n.next;
            }
        }
        if(flag==true)
            System.out.println("Element not found");
        else
            System.out.println(d+" deleted.");
    }


    public static void main(String[] args) {

        DLL first = new DLL();
        first.head = new NodeD(1);
        NodeD sec = new NodeD(2);
        NodeD third = new NodeD(3);
        first.head.next=sec;
        sec.next=third;
        sec.prev=first.head;
        third.prev=sec;
        first.printDLL();     //to print the DLindkedList
        NodeD newStart=new NodeD(4);
        first.insertAtStart(newStart);      //to insert element at the start of the list
        first.printDLL();
        NodeD newLast=new NodeD(5);
        first.insertAtLast(newLast);        //to insert element at the last
        first.printDLL();
        NodeD newMiddle=new NodeD(6);
        first.insertAtMiddle(newMiddle,3);  //to insert data at the middle
        first.printDLL();
        NodeD newMiddle1=new NodeD(6);
        NodeD newMiddle2=new NodeD(6);
        first.insertAtLast(newMiddle1);
        first.insertAtLast(newMiddle2);
        first.deleteElement(6);
        first.printDLL();

    }
}
