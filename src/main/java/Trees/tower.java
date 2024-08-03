package Trees;

public class tower {
    public static void main(String[] args) {

        toh(3, 'A', 'B', 'C');

    }
    static void toh(int n, char src, char help, char destination) {
        if (n == 0) {
            return;
        }
        toh(n-1, src, destination, help);
        System.out.println("move "+n+" from " + src +" to " + destination);
        toh(n-1, help, src, destination);

    }
}
