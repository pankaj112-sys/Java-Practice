public class DupliNumber{
    public static void main(String[] args) {
        int arr [] = {2,3,4,5,5,6,7,8,9};
        for(int i = 0; i<arr.length; i++){
            for(int j= 0; j<i; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    break;
                }
            }
        }
        for(int k=0; k<arr.length; k++){
            if(arr[k]!=-1){
                System.out.println(arr[k]);
            }
        }
    }
}