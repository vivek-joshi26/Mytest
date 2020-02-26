// COMPARATOR EXAMPLE
package Basic.Data.Structures;

import com.company.Books;

import java.util.*;

public class BooksComparator {
    public static void main(String[] args) {
        ArrayList<Books> newBook=new ArrayList<>();
        newBook.add(new Books("First",1));
        newBook.add(new Books("Third",3));
        newBook.add(new Books("Second",2));
        newBook.add(new Books("AA",4));
       // newBook.add(new Books(null,5));               //When null is present use nullsFirst or nullsLast

        Comparator<Books> cmp3=Comparator.comparing(Books::getId,Comparator.nullsFirst(Integer::compareTo));        //Sorting when NULL data is present, int can't have null value(primitive data type)
        Collections.sort(newBook,cmp3);                                 //Sorting Books on the basis of ID
        for (Books b:newBook
        ) {
            System.out.println(b.id+" "+b.name);

        }

        System.out.println();

        Comparator<Books> cmp4=Comparator.comparing(Books::getName,Comparator.nullsFirst(String::compareTo));        //Sorting when NULL data is present
        Collections.sort(newBook,cmp4);                                 //Sorting Books on the basis of ID
        for (Books b:newBook
        ) {
            System.out.println(b.id+" "+b.name);

        }

        System.out.println();



        Comparator<Books> cmp1=Comparator.comparing(Books::getId);
        Collections.sort(newBook,cmp1);                                 //Sorting Books on the basis of ID
        for (Books b:newBook
             ) {
            System.out.println(b.id+" "+b.name);

        }

        System.out.println();

        Comparator<Books> cmp2=Comparator.comparing(Books::getName);
        Collections.sort(newBook,cmp2);                                 //Sorting Books on the basis of NAME
        for (Books b:newBook
        ) {
            System.out.println(b.id+" "+b.name);

        }

    }
}
