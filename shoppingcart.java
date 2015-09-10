// ***************************************************************
// ShoppingCart.java
//
// Represents a shopping cart as an array of items
// ***************************************************************
import java.text.NumberFormat;
public class ShoppingCart {
	private int itemCount = 0; // total number of distinct items in the cart
	private double totalPrice; //the total price of items in the cart
	private static final int INITIAL_CAP = 3;

	private static final int GROW_BY = 3;
	
	private static Item[] cart;
	
	// ---------------------------------------------------------
	// Creates an empty shopping cart with a capacity of 3 items.
	// ---------------------------------------------------------
	public ShoppingCart()
	{
		itemCount = 0;
		totalPrice = 0;
		cart = new Item[INITIAL_CAP];
	}
	
	/**
	 * Return the total price of the items in the cart
	 */
	public double getTotalPrice(){
		return totalPrice;
	}
	
	/**
	 * Returns the item with given name if it is in the cart, otherwise null
	 * @param name
	 * @return
	 */
	public Item getItem(String name){
		Item found = null;
		for (Item I : cart) {
			if (I != null && I.equals(I)) {
				return found;
			}
		}
		
		return found;
	}
	
	/**
	 * Increase the size of the cart by 3*/
	private void increaseSize(){
		Item[] temp = new Item[cart.length + GROW_BY];
			for (int i = 0; i < cart.length; i++) {
				temp[i] = cart[i];
			}
		cart = temp;
	}
	
	//adds item to shopping cart & updates the price
	public void addToCart(String itemName, double price, int quantity) {
		Item item = getItem (itemName);
		if (cart.length == itemCount) {
			increaseSize();
			}
		
		if (item != null) {
			for (int j = 0; j < cart.length; j++) {
				if (cart[j] != null && item.getName().equals(cart[j].getName())) {
					int NewQuantity = cart[j].getQuantity();
					cart[j].setQuantity(quantity + NewQuantity);
					}
				}
		}

			else 
				cart[itemCount] = new Item (itemName, price, quantity);
		
		totalPrice += (price * quantity);
		itemCount++;
	}
	
	//display the contents of the shopping cart
	public void display(){
		for (Item item : cart) {
			if (item != null) 
				System.out.println(item.toString());
			}
		}
	}


