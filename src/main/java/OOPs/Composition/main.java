package OOPs.Composition;

public class main {
    public static void main(String[] args) {
        ComputerCase computerCase = new ComputerCase("2800", "dell", "240");
        Monitor monitor = new Monitor("27 inch", "Acer", 27, "2540 x 1750");
        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 6, 8, "v2.20");

        PersonalComputer pc = new PersonalComputer("2022", "dell", monitor, computerCase, motherBoard);
        pc.getMonitor().drawPixelAt(12, 15, "blue");
        pc.getMotherBoard().loadProgram("Fibonacci");
        pc.getComputerCase().pressPowerSupplyButton();


    }
}
