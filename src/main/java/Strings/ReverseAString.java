package Strings;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(rev("hsotima ahsiva"));
        String a = "amitosh";
        String b  = "amitosh";
        System.out.println(a == b);

    }
    public static String rev(String str) {
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }

}
