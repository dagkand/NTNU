package food;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;

public class Recipe {

	private String name;
	private String category;
	private int nPortions;
	private Ingredients ingredients;

	/**
	 * Initialize a new recipe
	 * 
	 * @param name The name of the recipe
	 * @param category The category of the recipe, e.g. "Dinner", "Dessert"
	 * @param nPortions The number of portions this recipe makes
	 * @param ingredients The ingredients in the recipe
	 */
	public Recipe(String name, String category, int nPortions, Ingredients ingredients) {
		// TODO
	}

	/**
	 * @return The name of the recipe
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return The category of the recipe
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return The number of portions this recipe makes
	 */
	public int getNPortions() {
		return nPortions;
	}

	/**
	 * @return The ingredients in the recipe
	 */
	public Ingredients getIngredients() {
		return ingredients;
	}

	/**
	 * @return A String representation of this object, showing the values of its fields
	 */
	@Override
	public String toString() {
		return "Recipe [name=" + name + ", category=" + category + ", nPortions=" + nPortions + ", ingredients="
				+ ingredients + "]";
	}

	/**
	 * Create a copy of this recipe, but change the ingredients such that the new
	 * recipe creates `n` portions instead of the amount this recipe makes.
	 *
	 * @param n The number of portions the new recipe should make
	 * @return The new recipe
	 */
	public Recipe createNPortions(int n) {
		// TODO
	}

	/**
	 * Creates a set of sample recipes, that can be used for testing, or to get
	 * data if you do not manage to implement `RecipeReader`.
	 * 
	 * @return a collection of sample recipes
	 */
	public static Collection<Recipe> createSampleRecipes() { // May start out hidden - press + sign to left.
		Collection<Recipe> recipes = new ArrayList<>();

		IngredientContainer ig = new IngredientContainer();
		ig.addIngredient("egg", 4);
		ig.addIngredient("milk", 5);
		ig.addIngredient("flour", 3);
		ig.addIngredient("salt", 1);
		Recipe pancakes = new Recipe("pancakes", "almost_dinner", 4, ig);
		recipes.add(pancakes);

		ig = new IngredientContainer();
		ig.addIngredient("egg", 5);
		ig.addIngredient("milk", 4);
		ig.addIngredient("flour", 3);
		ig.addIngredient("salt", 1);
		ig.addIngredient("vanilla", 1);
		Recipe waffles = new Recipe("waffles", "Dessert", 4, ig);
		recipes.add(waffles);
		
		ig = new IngredientContainer();
		ig.addIngredient("Egg Yolks", 3.00);
		ig.addIngredient("Lime", 4.00);
		ig.addIngredient("Double Cream", 300.00);
		ig.addIngredient("Condensed Milk", 400.00);
		ig.addIngredient("Butter", 150.00);
		ig.addIngredient("Digestive Biscuits", 300.00);
		ig.addIngredient("Icing Sugar", 1.00);
		recipes.add(new Recipe("Key Lime Pie", "Dessert", 4, ig));

		ig = new IngredientContainer();
		ig.addIngredient("Water", 1.00);
		ig.addIngredient("Garlic Clove", 3.00);
		ig.addIngredient("Sesame Seed Oil", 5.00);
		ig.addIngredient("Carrots", 3.00);
		ig.addIngredient("Wonton Skin", 1.00);
		ig.addIngredient("Oil", 1.00);
		ig.addIngredient("Celery", 3.00);
		ig.addIngredient("Soy Sauce", 15.00);
		ig.addIngredient("Ginger", 5.00);
		ig.addIngredient("Spring Onions", 6.00);
		ig.addIngredient("Pork", 1.00);
		recipes.add(new Recipe("Wontons", "Pork", 4, ig));

		ig = new IngredientContainer();
		ig.addIngredient("Strawberries", 300.00);
		ig.addIngredient("Caster Sugar", 175.00);
		ig.addIngredient("Raspberries", 500.00);
		ig.addIngredient("Blackberries", 250.00);
		ig.addIngredient("Redcurrants", 100.00);
		ig.addIngredient("Bread", 7.00);
		recipes.add(new Recipe("Summer Pudding", "Dessert", 4, ig));

		ig = new IngredientContainer();
		ig.addIngredient("Chicken Stock", 1.00);
		ig.addIngredient("Honey", 1.00);
		ig.addIngredient("Broccoli", 1.00);
		ig.addIngredient("Balsamic Vinegar", 1.00);
		ig.addIngredient("Potatoes", 5.00);
		ig.addIngredient("Butter", 15.00);
		ig.addIngredient("Garlic", 2.00);
		ig.addIngredient("Vegetable Oil", 15.00);
		ig.addIngredient("Olive Oil", 15.00);
		ig.addIngredient("Chicken Breast", 2.00);
		recipes.add(new Recipe("Honey Balsamic Chicken with Crispy Broccoli & Potatoes", "Chicken", 4, ig));

		ig = new IngredientContainer();
		ig.addIngredient("Water", 1.00);
		ig.addIngredient("Salt", 1.00);
		ig.addIngredient("Egg", 1.00);
		ig.addIngredient("Starch", 10.00);
		ig.addIngredient("Coriander", 1.00);
		ig.addIngredient("Soy Sauce", 10.00);
		ig.addIngredient("Tomato Puree", 30.00);
		ig.addIngredient("Vinegar", 10.00);
		ig.addIngredient("Pork", 200.00);
		ig.addIngredient("Sugar", 5.00);
		recipes.add(new Recipe("Sweet and Sour Pork", "Pork", 4, ig));

		ig = new IngredientContainer();
		ig.addIngredient("basil", 1.00);
		ig.addIngredient("oregano", 1.00);
		ig.addIngredient("allspice", 1.00);
		ig.addIngredient("Flour", 2.00);
		ig.addIngredient("Egg White", 1.00);
		ig.addIngredient("black pepper", 5.00);
		ig.addIngredient("celery salt", 1.00);
		ig.addIngredient("Salt", 1.00);
		ig.addIngredient("onion salt", 2.00);
		ig.addIngredient("garlic powder", 1.00);
		ig.addIngredient("Oil", 2.00);
		ig.addIngredient("paprika", 1.00);
		ig.addIngredient("marjoram", 1.00);
		ig.addIngredient("chili powder", 5.00);
		ig.addIngredient("sage", 1.00);
		ig.addIngredient("Chicken", 1.00);
		ig.addIngredient("Brown Sugar", 1.00);
		recipes.add(new Recipe("Kentucky Fried Chicken", "Chicken", 4, ig));

		ig = new IngredientContainer();
		ig.addIngredient("Hotsauce", 1.00);
		ig.addIngredient("Potatoes", 2.00);
		ig.addIngredient("Pepper", 1.00);
		ig.addIngredient("Red Onions", 1.00);
		ig.addIngredient("Vegetable Oil", 1.00);
		ig.addIngredient("Bread", 2.00);
		ig.addIngredient("Lime", 1.00);
		ig.addIngredient("Salt", 1.00);
		ig.addIngredient("Barbeque Sauce", 1.00);
		ig.addIngredient("Garlic", 2.00);
		ig.addIngredient("Tomato Ketchup", 1.00);
		ig.addIngredient("Pork", 1.00);
		ig.addIngredient("Sugar", 1.00);
		recipes.add(new Recipe("BBQ Pork Sloppy Joes with Pickled Onion & Sweet Potato Wedges", "Pork", 4, ig));

		ig = new IngredientContainer();
		ig.addIngredient("Vanilla Extract", 1.00);
		ig.addIngredient("Oil", 5.00);
		ig.addIngredient("Raspberries", 125.00);
		ig.addIngredient("Pecan Nuts", 25.00);
		ig.addIngredient("Eggs", 2.00);
		ig.addIngredient("Baking Powder", 1.00);
		ig.addIngredient("Banana", 1.00);
		recipes.add(new Recipe("Banana Pancakes", "Dessert", 4, ig));

		ig = new IngredientContainer();
		ig.addIngredient("Garlic Clove", 4.00);
		ig.addIngredient("Plain Flour", 30.00);
		ig.addIngredient("Gruyère", 140.00);
		ig.addIngredient("Dry White Wine", 250.00);
		ig.addIngredient("Onion", 1000.00);
		ig.addIngredient("Butter", 50.00);
		ig.addIngredient("Olive Oil", 15.00);
		ig.addIngredient("Sugar", 5.00);
		ig.addIngredient("Beef Stock", 1.00);
		ig.addIngredient("Bread", 4.00);
		recipes.add(new Recipe("French Onion Soup", "Side", 4, ig));

		ig = new IngredientContainer();
		ig.addIngredient("garlic", 3.00);
		ig.addIngredient("bowtie pasta", 16.00);
		ig.addIngredient("Pepper", 1.00);
		ig.addIngredient("onion", 1.00);
		ig.addIngredient("Butter", 2.00);
		ig.addIngredient("milk", 1.00);
		ig.addIngredient("Olive Oil", 3.00);
		ig.addIngredient("Squash", 1.00);
		ig.addIngredient("Parmesan cheese", 1.00);
		ig.addIngredient("mushrooms", 8.00);
		ig.addIngredient("Salt", 5.00);
		ig.addIngredient("Broccoli", 1.00);
		ig.addIngredient("white wine", 1.00);
		ig.addIngredient("red pepper flakes", 1.00);
		ig.addIngredient("heavy cream", 1.00);
		ig.addIngredient("Chicken", 5.00);
		ig.addIngredient("Parsley", 1.00);
		recipes.add(new Recipe("Chicken Alfredo Primavera", "Chicken", 4, ig));

		return recipes;
	}
	
	public static void main(String[] args) {
		IngredientContainer ig = new IngredientContainer();
		ig.addIngredient("egg", 4);
		ig.addIngredient("milk", 5);
		ig.addIngredient("flour", 3);
		ig.addIngredient("salt", 1);
		Recipe recipe = new Recipe("pancakes", "almost_dinner", 4, ig);
		Recipe twice = recipe.createNPortions(8);
		assertEquals(8, twice.getIngredients().getIngredientAmount("egg"), 0.00001);
		
		Collection<Recipe> recipes = Recipe.createSampleRecipes();
		assertEquals(12, recipes.size(), 0.00001);
	}
}

