import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RecipeList {

	private List<Recipe> recipeList;
	
	public RecipeList() {
		this.recipeList = new ArrayList<>();
	}
	
	public RecipeList getRecipes(Connection connection) {
		String sql = "SELECT * FROM recipe";
		
		try (PreparedStatement statement = connection.prepareStatement(sql)) {
			try (ResultSet results = statement.executeQuery()) {
				while (results.next()) {
					
					String name = results.getString("name");
					String description = results.getString("description");
					Recipe recipe = new Recipe();
					recipe.setName(name);
					recipe.setDescription(description);
					this.addRecipe(recipe);
					
				}
				
			};
			return this;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public int size() {
		return this.recipeList.size();
	}
	
	public void addRecipe(Recipe recipe) {
		this.recipeList.add(recipe);
	}
	
	public Recipe getRecipe(int i) {
		return this.recipeList.get(i);
		
	}
	
	public void deleteRecipe(int index) {
		recipeList.remove(index);
	}
}
