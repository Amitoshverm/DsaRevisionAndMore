package Scaler;

public class SecondsAndMinuteChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(3789));
        System.out.println(getDurationString(85, 54));

    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "invalid input for ("+seconds+"), " +
                    "must be a positive input";
        }
        return getDurationString(seconds/60, seconds%60);
    }
    public static String getDurationString(int minutes,int seconds) {
        if (minutes < 0) {
            return "invalid input for ("+minutes+"), " +
                    "must be a positive input";
        }
        if (seconds <= 0 || seconds >= 59) {
            return "invalid input for ("+seconds+"), " +
                    "must be a b/w 0-59";
        }
        int hours = minutes / 60;
        int remainingMin = minutes % 60;
        return hours+"h " + remainingMin+"m " + seconds+"s";
    }
}
