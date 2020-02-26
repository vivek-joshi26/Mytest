package Package2;

public class Patterns {
    public static void main(String[] args) {

        int size=5;

        for(int i=0;i<size;i++){   //normal 3*3 matrix
            for(int j=0;j<size;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<size;i++){       //Pattern 1st
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<size;i++){       //Pattern 2nd
            for(int j=0;j<size-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0;i<size;i++){       //Pattern 3rd
            for(int j=0;j<size;j++){
                if(j>=i)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }



        System.out.println();

        for(int i=0;i<size;i++){       //Pattern 4th
            for(int j=0;j<size;j++){
                if(j>=size-i-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }


        System.out.println();

        for(int i=0;i<size;i++){       //Pattern 5th
            for(int j=0;j<2*size;j++){
                if(j>=size-1)
                    System.out.print("*");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }


    }
}
