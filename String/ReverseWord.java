public class ReverseWord{
    public static void main(String args[]) {
        String s = "helllo java programming language";
        String rev = "";
        String words[] = s.trim().split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            rev += words[i];

            if (i != 0) {
                rev += " ";
            }
        }

        System.out.println(rev);
    }
}
