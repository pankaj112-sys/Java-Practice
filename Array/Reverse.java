public class Reverse {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9};
        int count = 0;
        for(int i = arr.length-1; i > 0; i--){
            count++;
            System.out.println(arr[i]);
        }
        System.out.println("The number of element is : " +count);
    }
}
