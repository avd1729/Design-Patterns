package template;

public class Driver {
    public static void main(String[] args) {
        PastaMeal pasta = new PastaMeal();
        SoupMeal soup = new SoupMeal();
        System.out.println("Pasta -->");
        pasta.prepareMeal();
        System.out.println("Soup -->");
        soup.prepareMeal();
    }
}
