package leetcode.java.easy;

public class GCDOfStrings {
    public static String gcdOfStrings(String str1, String str2) {

        if(!(str1 + str2).equals(str2 + str1)){
            return "Strings cannot be divided";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    //Eucledean formula to find GCD
    private static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1,str2));
    }

}
