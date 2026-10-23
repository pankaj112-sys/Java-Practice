public class Reverse{
    public static void main(String[] args) {
        String S = "hello";
        String rev = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            rev +=S.charAt(i);
        }
        System.out.println(rev);
        if(S.equals(rev)){
            System.out.println("The string is palindrom");
        }
        else{
            System.out.println("The string is not palndrom");
        }
    }
}

