import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) throws SQLException  {

		boolean authConfirmed = false;
		final String dbstring = "jdbc:sqlite:/Users/markquissimmons/eclipse-workspace/HappyFood/HappyFoodData.db";
		
		try (
			Connection connection = DriverManager.getConnection(dbstring);
			Scanner scan = new Scanner(System.in);
		) {
			Identity id = new Identity();
		
			while (!authConfirmed) {
				System.out.println("Please enter your dob in format XX/XX/XXXX");
				String dob = scan.next().trim();
				
				String name = id.getDob(connection, dob);
				
				if (name != null) {
					System.out.println("Welcome, "+ name + "!");
					
					boolean running = true;
					while (running) {
						System.out.println("***MENU***");
						System.out.println("To view all recipes type View All");
						System.out.println("To ADD a recipe type ADD");
						System.out.println("To delete a recipe type Delete recipe name");
						System.out.println("To edit a recipe type Edit recipe name");
						System.out.println("To View a recipe type View recipe name");
						
						String action = scan.nextLine();
						switch (action) {
							case "view all":
								RecipeList recipes = new RecipeList();
								recipes = recipes.getRecipes(connection);
								for (int i = 0; i < recipes.size(); i++) {
									Recipe recipe = recipes.getRecipe(i);
									System.out.println(recipe.getName() + " "+recipe.getDescription());
								}
							
						}
					}
					
					
					
					
					
					
					
					
					
					authConfirmed = true;
				} else {
					System.out.println("DOB not found or not confirmed, try again.");
				}
				
			}
		}
		
		
		
		
		
		
		
		
	}
}
