package Arrays;

import java.util.ArrayList;

public class AddTwoMatrices {
    public static void main(String[] args) {

    }

    public static ArrayList<ArrayList<Integer>> sol (ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int j = 0; j < A.get(i).size(); i++) {
                arr.add(Integer.sum(A.get(i).get(j), B.get(i).get(j)));
            }
            ans.add(arr);
        }
        return ans;
    }
}
