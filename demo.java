package practice26april;

public class NewPalindrome {

    public static void main(String[] args) {

        String s = "MOM";

        String rev = " ";

        for (int i = s.length() - 1; i >= 0; i--) {

            rev = rev + s.charAt(i);
        }

        // {
        // System.out.println(rev);
        // }

        if (s.equals(rev))

        {
            System.out.println("Palindrom string");
            System.out.println("Palindrom string");
        }

    }
}