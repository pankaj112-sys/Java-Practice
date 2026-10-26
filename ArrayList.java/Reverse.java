
import java.util.ArrayList;

public class Reverse {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(0);
        System.out.println(list);
        for (int i = list.size() - 1; i > 0; i--) {
            System.out.print(list.get(i) + " ");
        }    
    }    

}
