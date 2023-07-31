package OOPs.Composition.Challenge;

public class SmartKitchen {
    private CoffeeMaker brewMaker;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        brewMaker = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public void setKitchenState(boolean coffeeFlag, boolean dishWasherFlag,
                                boolean refrigeratorFlag) {
        brewMaker.setHasWorkToDo(coffeeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        iceBox.setHasWorkToDo(refrigeratorFlag);
    }

    public void doKitchenWork() {
        brewMaker.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }
    public CoffeeMaker getBrewMaker() {
        return brewMaker;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater() {
        brewMaker.setHasWorkToDo(true);
    }
    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }
    public void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
    }
}
