package OOPs.Composition.Challenge;

public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaker().setHasWorkToDo(true);

//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaker().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}
