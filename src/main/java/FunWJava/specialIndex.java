package FunWJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class specialIndex {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(6);
        arr.add(4);
        

        System.out.println(index(arr));
    }

    public static int index(ArrayList<Integer> arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        even.add(arr.get(0));
        odd.add(0);

        for(int i = 1; i < arr.size(); i++) {
            if (i % 2 == 0) {
                even.add(even.get(i-1) + arr.get(i));
                odd.add(odd.get(i-1));
            }else {
                odd.add(odd.get(i-1) + arr.get(i));
                even.add(even.get(i-1));
            }
        }
        int j = 0;
        int c = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (even.get(i) == odd.get(j)){
                c++;
            } else {
                j++;
            }
        }
        return c;
    }
}
