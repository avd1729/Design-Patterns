package template;

public class PastaMeal extends MealPreparation{

    @Override
    public void gatherIngredients() {
        System.out.println("Gathering ingredients for Pasta!!");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Pasta!!");
    }

    @Override
    public boolean needsGarnish(){
        return true;
    }
}

