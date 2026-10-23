public class Compare { 
    public static void main(String[] args) { 
        String s1 = "hello"; 
        String s2 = "hello"; 
        String s3 = new String("hello"); 

        // Correct way to compare string content
        if (s1.equals(s3)) { 
            System.out.println("same string"); 
        } else if (s2.equals(s3)) { 
            System.out.println("not same string"); 
        } 
    } 
}
