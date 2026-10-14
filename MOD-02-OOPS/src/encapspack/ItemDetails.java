
package encapspack;

class Item {

	private int itemCode;
	private String itemName;
	private float itemPrice;

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
}

public class ItemDetails {

	public static void main(String[] args) {
		Item it = new Item();
		it.setItemCode(1);
		it.setItemName("Phone");
		it.setItemPrice(30000.0f);

		System.out.println(it.getItemCode() + "  " + it.getItemName() + "  " + it.getItemPrice());

	}

}
