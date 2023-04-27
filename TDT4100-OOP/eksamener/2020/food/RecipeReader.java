package food;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class RecipeReader {

	// regex for column separator
	private final String columnSeparatorRegex = "\\$";

	/**
	 * Read recipes from an InputStream with the given format:
	 *
	 * name$category$nPortions$ingredient1;ingredient2;...;...$amount1;amount2;...;...
	 * 
	 * As you see from the format, each recipe is a single line, with fields separated by `$` and 
	 * elements in lists separated by `;`.
	 * 
	 * Regarding ingredients and amounts, the two lists are sorted in the same order, so `ingredient1`
	 * should have `amount1`, and so forth. All amounts can be read as doubles, while nPortions is an integer.
	 *
	 * Note that the first line of the stream is the header, and so should not be used.
	 * If a line (i.e. a single recipe) fails to be parsed correctly, that recipe is to be skipped.
	 *
	 * @param input The source to read from
	 * @throws IOException if input (InputStream) throws IOException
	 */
	public List<Recipe> readRecipes(InputStream input) throws IOException {
		// TODO
	}

	public static void main(String[] args) throws IOException {
		// read from sample file
		List<Recipe> recipes = new RecipeReader().readRecipes(RecipeReader.class.getResourceAsStream("sample-recipes.txt"));
		System.out.println(recipes);
	}
}
