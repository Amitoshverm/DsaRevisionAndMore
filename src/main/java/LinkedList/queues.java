package LinkedList;

import java.util.*;

public class queues {
    public static void main(String[] args) {
        System.out.println((int)Math.sqrt(2));
    }




    public static int[] sol(int[] A, int k) {

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[A.length];
        int n = A.length;

        for (int i = 0; i < A.length; i++) {
            q.add(A[i]);
        }

        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        for (int i = 0; i < n - k; i++) {
            q.add(q.poll());
        }
        int i = 0;
        while (!q.isEmpty()) {
            ans[i] = q.poll();
            i++;
        }
        return ans;
    }
    public static void arrange(ArrayList<Integer> A) {
        int n = A.size();

        for (int i = 0; i < n; i++) {
            A.set(i, A.get(i) * n);
        }

        for (int i = 0; i < n; i++) {
            int index = A.get(i)/n;

            int val = A.get(index)/n;
            A.set(i, A.get(i)+val);
        }
        for (int i = 0; i < n; i++) {
            A.set(i, A.get(i) % n);
        }
    }
}
