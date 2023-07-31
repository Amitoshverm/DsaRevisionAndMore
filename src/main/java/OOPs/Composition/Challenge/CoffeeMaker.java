package OOPs.Composition.Challenge;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing Coffee!");
            hasWorkToDo = false;
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
