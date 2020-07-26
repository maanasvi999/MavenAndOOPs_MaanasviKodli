public class Dessert implements Food {

	public String dessertName;
	public float dessertPrice;

	@Override
	public String getFoodName() {
		return dessertName;
	}

	@Override
	public float getPrice() {
		return dessertPrice;
	}
}
