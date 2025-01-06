package template;

public abstract class MealPreparation {
    public final void prepareMeal() {
        gatherIngredients();
        cook();
        serve();
        if (needsGarnish()) {
            addGarnish();
        }
    }

    public abstract void gatherIngredients();

    public abstract void cook();

    public void serve(){
        System.out.println("Serving food!!");
    }

    public boolean needsGarnish(){
        return false;
    }

    public void addGarnish(){
        System.out.println("Garnishing the plate!!");
    }
}
