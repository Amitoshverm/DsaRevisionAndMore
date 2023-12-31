package OOPs.Composition.Challenge;

public class DishWasher {

    private boolean hasWorkToDo;

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
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
