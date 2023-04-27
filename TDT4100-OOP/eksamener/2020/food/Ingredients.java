package food;

import java.util.Collection;

public interface Ingredients {

	/**
	 *
	 * @return An Iterable giving the names of all the ingredients
	 */
	public Iterable<String> ingredientNames();

	/**
	 *
	 * @return A collection containing the names of all the ingredients
	 */
	public Collection<String> getIngredientNames();

	/**
	 * @param ingredient The ingredient to get the amount of
	 * @return The amount of ingredient
	 */
	public double getIngredientAmount(String ingredient);

	/**
	 * Checks if the all the ingredients in other is contained in this
	 * @param other
	 * @return true of there is at least the same or larger amount of ingredients in this than in other, false otherwise
	 */
	public boolean containsIngredients(Ingredients other);

	/**
	 * Returns the ingredients that must be added to other for this to be contained in it
	 * @param other
	 * @return a new Ingredients that if added to other would make it contain this
	 */
	public Ingredients missingIngredients(Ingredients other);

	/**
	 * Returns the ingredients that you get if you scale this
	 * @param other
	 * @param scale
	 * @return a new scaled Ingredients
	 */
	public Ingredients scaleIngredients(double scale);
}
