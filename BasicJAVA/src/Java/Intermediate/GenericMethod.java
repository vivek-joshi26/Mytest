package Java.Intermediate;
//Generic Method to avoid method overloading

public class GenericMethod {
    public static <T> void printme(T[] x){  //generic method, will work on all data type
        for (T b:x
             ) {
            System.out.print(b+" ");
        }
        System.out.println();

    }

    public static <T extends Comparable> T compare1(T a, T b, T c){     // this compares the passed values and return the maximum from it
        T m=a;
        if(b.compareTo(a)>0)                                            // if b>m it will return value greater than 0, if less than will return less than 0 and if equal will retun 0
            m=b;
        if(c.compareTo(m)>0)
            m=c;
        return m;
    }

    public static void main(String[] args) {
        Integer[] i1={1,2,3,4,5};
        Character[] c1={'a','b','g'};
        printme(i1);
        printme(c1);
        System.out.println(compare1(4,7,5));
        System.out.println(compare1("acfd","asdsd","poiu"));

    }
}
