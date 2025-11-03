package DSA.LinearDataStructure.Arrays;

public class StringRev {
    boolean strRev(String str) {
        String rev = "";
        for (int i = str.length()-1; i >=0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        int a=10;
        int b=5;
        System.out.println(a + b + "Java" + a + b);
        if(str.equals(rev))
        {
            return true;
        }
        return false;
    }
    static void main(String[] args) {
        StringRev sr = new StringRev();
        String str = "madam";
        System.out.println(sr.strRev(str));
    }
}
