package Scaler;

public class CatsPlaying {
    public static void main(String[] args) {

    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature > 25 && temperature < 45) {
            return summer || temperature < 35;
        }
        return false;

    }
}
