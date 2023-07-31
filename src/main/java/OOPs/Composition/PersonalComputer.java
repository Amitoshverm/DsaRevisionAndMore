package OOPs.Composition;

public class PersonalComputer extends Product{

    private Monitor monitor;
    private ComputerCase computerCase;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer, Monitor monitor, ComputerCase computerCase, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.computerCase = computerCase;
        this.motherBoard = motherBoard;
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200,1560,"yellow");
    }
    public void powerButton() {
        computerCase.pressPowerSupplyButton();
        drawLogo();
    }

//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
}
