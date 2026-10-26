public class Reverse{
    public static void main(String[] args) {
        String S = "hello java programming language";
        String rev = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            rev +=S.charAt(i);
        }
        System.out.println(rev);
           
    }
}

