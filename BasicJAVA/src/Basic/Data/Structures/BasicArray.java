package Basic.Data.Structures;

public class BasicArray {

    public static void sum(int[] arr){
        int total=0;
        for(int i=0;i<arr.length;i++)
            total+=arr[i];
        System.out.println(total);
    }

    public static void main(String[] args) {
        int[] arr=new int[5];   //array declaration
        int[] arr2={1,2,3}; //to directly give values
        for(int i=0;i<arr.length;i++){  //array initialisation
            arr[i]=i+5;
        }
        for(int i=0;i<arr.length;i++){      //print array
            System.out.println("Element at index:"+i+" is :"+arr[i]);
        }

        for(int i=0;i<arr2.length;i++){      //print array
            System.out.println("Element at index:"+i+" is :"+arr2[i]);
        }
        sum(arr);   //How to pass array to a method

        int[][] arr2DInitialise={{1,2,3},{3,4,5}};  //2D array, directly give values
        int[][] arr2D=new int[3][3];    //2D array for Matrix

        for(int i=0;i<3;i++){           //initialise 2D array
            for(int j=0;j<3;j++){
                arr2D[i][j]=i+j;
            }
        }

        for(int i=0;i<3;i++){           //Print 2D array matrix
            for(int j=0;j<3;j++){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i=0;i<2;i++){           //Print 2D array matrix
            for(int j=0;j<2;j++){
                System.out.print(arr2DInitialise[i][j]+" ");
            }
            System.out.println();
        }



    }
}
