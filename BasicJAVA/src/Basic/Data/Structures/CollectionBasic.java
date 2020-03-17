package Basic.Data.Structures;

import java.util.*;

public class CollectionBasic {

    public static void compareList(List l1, List l2){
        Iterator it=l1.iterator();
        while (it.hasNext()){
            if(l2.contains(it.next())){
                it.remove();
            }

        }


    }

    public static void main(String[] args) {
        String[] s1={"1","2","3","4"};
        String[] s2={"1","4","5"};

        List<String> l1=new ArrayList<>();
        List<String> l2=new ArrayList<>();

        for (String x:s1
             ) {
            l1.add(x);

        }

        for (String y:s2
             ) {
            l2.add(y);

        }

        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }

        System.out.println();

        for (int i=0;i<l2.size();i++){
            System.out.print(l2.get(i)+" ");
        }

        System.out.println();
        compareList(l1, l2);

        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }

        System.out.println();

    }
}