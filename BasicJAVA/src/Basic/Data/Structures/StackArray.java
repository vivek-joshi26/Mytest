package Basic.Data.Structures;                              // STACK Implementation using Array

public class StackArray {
    static final int n=100;                                 //why we declare STATIC final?
    int arr[]=new int[n];
    int top;

    StackArray(){
        top=-1;
    }

    void isEmpty(){                                             //to check if the stack has elements or not
        if(top==-1)
            System.out.println("Stack is Empty:");
        else
            System.out.println("Stack has elements:");
    }

    void push(int a){                                            //to push an element into the stack
        if(top>n-1)
            System.out.println("Stack overflow:");
        else {
            arr[top + 1] = a;
            top=top+1;
            System.out.println(a+" pushed into the stack at position:"+top);
        }
    }

    int pop(){                                                  //to pop the top element from the stack
        if(top==-1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x=arr[top];
            top-=1;
            return x;
        }

    }

    int peek(){                                                     //to get the top element from the stack
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else
            return arr[top];

    }

    void printArray(){                              //to print the array
        for (int i=0;i<arr.length;i++){             //replace condition with i<top to print only current elements
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


        public static void main(String[] args) {
            StackArray obj1 = new StackArray();
            obj1.push(1);                           //to push element into the stack
            obj1.push(2);
            obj1.push(3);
            obj1.push(4);
            obj1.push(5);
            System.out.println(obj1.peek());        //to print the top element from the stack
            obj1.printArray();                      //to print all elements in the stack
            System.out.println(obj1.pop());         //to pop the top element from the stack
            System.out.println(obj1.peek());
            obj1.printArray();
            obj1.push(6);
            System.out.println(obj1.peek());
            obj1.printArray();
            StackArray obj2=new StackArray();
            obj2.push(10);
            obj2.isEmpty();                         //to check if the stack has elements or not
            obj2.printArray();
        }
    }

