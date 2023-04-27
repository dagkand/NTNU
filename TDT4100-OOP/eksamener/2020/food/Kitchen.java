package food;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Kitchen {

	// TODO: necessary declarations

	/**
	 * Create a new kitchen with the given recipes
	 * @param recipes The recipes the kitchen knows
	 */
	public Kitchen(Recipe...recipes) {
		// TODO
	}

	/**
	 * @return The kitchen's ingredient storage
	 */
	public IngredientContainer getStorage() {
		// TODO
	}

	/**
	 * Lookup a recipe in the kitchen's known recipes by name.
	 * 
	 * If no recipe with the given name is found, `null` is returned.
	 * 
	 * @param name The name of the recipe
	 * @return The recipe with the given name, or `null` if no such recipe exists 
	 */
	public Recipe getRecipe(String name) {
		// TODO
	}

	/**
	 * @return A collection of all the recipes the kitchen knows
	 */
	public Collection<Recipe> getAllRecipes() {
		// TODO
	}
	
	/**
	 * Add a recipe to the recipes of the week
	 * @param recipe The recipe to add
	 */
	public void addRecipeToWeekly(Recipe recipe) {
		// TODO
	}

	/**
	 * Remove a recipe from the recipes of the week
	 * @param recipe The recipe to remove
	 */
	public void removeRecipeFromWeekly(Recipe recipe) {
		// TODO
	}

	/**
	 * Clear the recipes of the week. Useful for selecting next weeks
	 * recipes.
	 */
	public void clearWeekly() {
		// TODO
	}

	/**
	 * This method should be called when the chef has finished setting 
	 * all recipes for the next week, and can be used to trigger
	 * fitting behavior.
	 */
	public void registerWeekly() {
		// TODO
	}

	/**
	 * @return The list of recipes the kitchen will create this week
	 */
	public Collection<Recipe> getWeeklyRecipes() {
		// TODO
	}

	/**
	 * Check if this kitchen has the ingredients needed to cook a given recipe
	 *
	 * @param recipe The recipe to check for
	 * @return true if the kitchen has enough ingredients
	 */
	public boolean canCreateRecipe(Recipe recipe) {
		// TODO
	}

	/**
	 * Cook the given recipe, i.e. remove the amount of ingredients from this kitchen's storage.
	 *
	 * @param recipe The recipe to create
	 * @throws an appropriate RuntimeException if there's not enough ingredients to create the given recipe.
	 */
	public void createRecipe(Recipe recipe) {
		// TODO
	}
	
	/**
	 * Generic filter method on the recipes in this kitchen
	 *
	 * @param predicate The predicate to filter on
	 * @return The filtered collection of recipes
	 */
	public Collection<Recipe> filterRecipes(Predicate<Recipe> predicate) {
		// TODO
	}

	/**
	 * @return All recipes that can be created with the current ingredient store of this kitchen
	 */
	public Collection<Recipe> getRecipesThatCanBeCreated() {
		// TODO
	}

	/**
	 * @param ingredient The ingredient to search for
	 * @return All recipes that contains `ingredient`
	 */
	public Collection<Recipe> getRecipiesContainingIngredient(String ingredient) {
		// TODO
	}

	// TODO: support observability 
	
	public static void main(final String[] args) throws IOException {

		// Reading from file:
		
		// Read recipes using RecipeReader. Uncomment to test.
//		final RecipeReader recipeReader = new RecipeReader();
//		List<Recipe> recipes = new RecipeReader().readRecipes(RecipeReader.class.getResourceAsStream("sample-recipes.txt"));
//		System.out.println(recipes.size());
		
		// Use the sample recipes. Uncomment to test
//		final Collection<Recipe> dummyrecipes = Recipe.createSampleRecipes();
//		System.out.println(dummyrecipes.size());
		
		// Simple kitchen - two recipes only
		Recipe[] recipesArray = new Recipe[2];
		IngredientContainer ig = new IngredientContainer();
		ig.addIngredient("egg", 4);
		ig.addIngredient("milk", 5);
		ig.addIngredient("flour", 3);
		ig.addIngredient("salt", 1);
		Recipe pancakes = new Recipe("pancakes", "almost_dinner", 4, ig);
		recipesArray[0] = pancakes;

		ig = new IngredientContainer();
		ig.addIngredient("egg", 5);
		ig.addIngredient("milk", 4);
		ig.addIngredient("flour", 3);
		ig.addIngredient("salt", 1);
		ig.addIngredient("vanilla", 1);
		Recipe waffles = new Recipe("waffles", "Dessert", 4, ig);
		recipesArray[1] = waffles;
		
		final Kitchen kitchen = new Kitchen(recipesArray);
		System.out.println("Pancakes: " + kitchen.getRecipe("pancakes"));
		
		// Should print false:
		System.out.println(kitchen.canCreateRecipe(pancakes));
		kitchen.getStorage().addIngredient("egg", 12);
		kitchen.getStorage().addIngredient("milk", 20);
		kitchen.getStorage().addIngredient("flour", 2000);
		kitchen.getStorage().addIngredient("salt", 100);
		// Should print true:
		System.out.println(kitchen.canCreateRecipe(pancakes));
		
		// Weekly recipes:
		
		kitchen.addRecipeToWeekly(pancakes.createNPortions(20));
		kitchen.registerWeekly();
		System.out.println("Kitchens weekly recipes: " + kitchen.getWeeklyRecipes());
		System.out.println(kitchen.getStorage());
		
		// Recipes containing egg:
		System.out.println("Recipes containing egg: " + kitchen.getRecipiesContainingIngredient("egg"));
	}
}

