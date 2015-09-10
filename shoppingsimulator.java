import java.util.Scanner;

public class ShoppingSimulator {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		ShoppingCart shoppingCart = new ShoppingCart();
		
		System.out.println("Welcome to the shopping cart simulation");
		String loop = "yes";
		
		do{
			System.out.println("Enter the name, price, and quantity of an item to add");
			String name = scan.next();
			double price = scan.nextDouble();
			int quantity = scan.nextInt();
			
			//adds the item to the shopping cart with name, price, quantity 	
			shoppingCart.addToCart(name, price, quantity);
			
			//displays contents of the shopping cart
			shoppingCart.display();
			
			System.out.println("Would you like to enter another item? yes or no?");
			loop = scan.next();
		}while(loop.equals("yes"));
		System.out.println("");
		
		System.out.println("Please pay $" + shoppingCart.getTotalPrice());
		scan.close();
		
	}
}
