package OOPs.Encapsulation.Challenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        if (tonerLevel > 100 && tonerLevel <= 0) {
            this.tonerLevel = -1;
        }
        this.duplex =duplex;
    }
    public int addToner(int tonerAmount) {
        int tempAmount = tonerAmount+tonerLevel;
        if (tempAmount > 100 || tempAmount <= 0) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int printPages(int printPages) {
        int jobPages = (duplex) ? (printPages/2) + (printPages%2) : printPages;
        pagesPrinted += jobPages;
        return jobPages;
    }
}
