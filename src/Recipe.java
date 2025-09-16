import java.util.List;
import java.sql.*;

public class Recipe {

	
	private String name;
	private String description;
	private List<String> ingredientList;
	final String recipeInsert = "INSERT INTO recipe name VALUES ";

	//INSERT INTO recipe (name, description) VALUES (Pernil, A colombian pork dish.);
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void updateName(String name) {
		//get existing name and ID
		// update the name with new name
		//store the name in the db
		
	}
	
	public String getDescription() {
		//pass in query
		//get the decription
		//pass into the description variable
		//return description
		return this.description;
		
	}
	
	public void setDescription(String description) {
		//get description
		//description passed to query
		//send query
		this.description = description;
	}
	
	public void updateDescription(String description) {
		//query for existing description
		//get new description
		// create query
		//store data with query
		
	}
	
	public void addIngredient(Ingredient ingredient) {
		
	}
	
	public List<Ingredient> getAllIngredients() {
		List<Ingredient> list = null;
		return list;
	}
	
	public void deleteIngredient(int ingredientNumber) {
		
	}
	
	public List<Instruction> getAllInstructions() {
		List<Instruction> list = null;
		return list;
	}
	
	public void updateInstructions(Instruction instruction) {
		
	}
	
	public void addInstruction(Instruction instruction) {
		
	}
	
	public void deleteInstruction(Instruction number) {
		
	}
 }
