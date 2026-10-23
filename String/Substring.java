public class Substring{
    public static void main (String args[]){
        String s = "hellojava";
        String substr = "";
        for(int i =3; i<6; i++){
            substr += s.charAt(i);
        }
        System.out.println("the substring is:  " + substr);


        //java has built-in substring  methods
        System.out.println(s.substring(3, 6));
    }
}


