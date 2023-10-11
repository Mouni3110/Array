import java.util.*;
class Collection{
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer> ();
        al.add(1);
        al.add(8);
        al.add(6);
        Collections.sort(al);
        System.out.println(al);
    }
}