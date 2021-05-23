
public class BuilderPattern {
public static void main(String args[]) {
	MeaBuilder mealbuilder = new MeaBuilder();
	Meal vegmeal =mealbuilder.prepareVegMeal();
	System.out.println ("Veg Meals");
	vegmeal.showItems();
	System.out.println("total cost :"+vegmeal.getCost());
	
	Meal nonvegmeal =mealbuilder.prepareNonVegMeal();
	System.out.println ("Non Veg Meals");
	nonvegmeal.showItems();
	System.out.println("total cost :"+nonvegmeal.getCost());
}
}
