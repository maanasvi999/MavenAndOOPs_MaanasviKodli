public class Chocolates implements Food{

	public String chocolateName;
	public float chocolatePrice;

	@Override
	public String getFoodName() {
		return chocolateName;
	}

	@Override
	public float getPrice() {
		return chocolatePrice;
	}
}
