
import java.util.ArrayList;

public class Basic {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(0);
        System.out.println(list);

        // // get element
        // int el1 = list.get(2);
        // System.out.println(el1);
        // // remove element
        // list.remove(2);
        // System.out.println(list);

        // // how to set element in purticular index
        // list.set(1, 10);
        // System.out.println(list);

        // // is purticular element is exiets or not in an aaray 
        // System.out.println(list.contains(6));

        // // size of an arrayList
        // System.out.println("The size on list is: " +list.size());


        // print arrylist element using loop = list.size
        for(int i=list.size()-1; i>0; i--){
            System.out.print(list.get(i) + " ");

        }
       
    }
}
