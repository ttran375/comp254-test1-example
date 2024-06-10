package exercise3;

public class ReverseString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "COMP";
        reverse(s);
    }

    public static void reverse(String s) {
        reverse(s, s.length() - 1); // reverse it

    }

    // input: a string and the index of the last character in it
    // output: reversed string
    public static void reverse(String s, int n) {
        // stopping condition
        // if( n<0 ) throw new IllegalStateException("String must have one or more
        // chars");
        if (n >= 0) {
            System.out.println(s.charAt(n));
            //
            reverse(s, n - 1);// recur
        }
    }
}
