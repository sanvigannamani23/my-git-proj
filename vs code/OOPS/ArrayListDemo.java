import java.util.*;

public class ArrayListDemo  {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(10);
        System.out.println(al);

        al.remove(2);
        System.out.println(al);
        al.set(2, 25);
        System.out.println(al);
        System.out.println(al.contains(10));
        Iterator itr = al.iterator();
        while (itr.hasNext())
           System.out.println(itr.next());
    }
}
 