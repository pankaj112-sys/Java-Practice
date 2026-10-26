import java.util.*;
public class SwapList{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        int indx1 = 1; 
        int indx2 = 2;
        for(int i = 0; i<list.size(); i++){
            for(int j = 0; j<i; j++){
                int temp = list.get(indx1);
                list.set(indx2, list.get(indx2));
                list.set(indx2, temp); 
            }
        }
        System.out.println(list);    
    }
}