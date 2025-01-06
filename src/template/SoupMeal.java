package template;

public class SoupMeal extends MealPreparation{

    @Override
    public void gatherIngredients() {
        System.out.println("Gathering ingredients for Soup!!");
    }

    @Override
    public void cook() {
        System.out.println("Cooking soup!!");
    }
}
