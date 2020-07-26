import java.util.ArrayList;
import java.util.List;

public class DessertsAndChocolcates {
	public static void main(String[] args) {

		List<GulabJamun> desserts = new ArrayList<GulabJamun>();
		List<Cadbury> chocolates = new ArrayList<Cadbury>();

		GulabJamun gulabJamun1 = new GulabJamun();
		GulabJamun gulabJamun2 = new GulabJamun("Special Jamun",600.0f);
		GulabJamun gulabJamun3 = new GulabJamun("Regular Jamun", 200.0f);
		desserts.add(gulabJamun1);
		desserts.add(gulabJamun2);
		desserts.add(gulabJamun3);

		Cadbury cadbury1 = new Cadbury();
		Cadbury cadbury2 = new Cadbury("Cadbury Fruit and Nut", 45.0f);
		Cadbury cadbury3 = new Cadbury("Cadbury Dark Chocolate", 135.0f);
		chocolates.add(cadbury1);
		chocolates.add(cadbury2);
		chocolates.add(cadbury3);

		System.out.println("Desserts:");
		for(Dessert dessert: desserts)
		{
			System.out.println("Name: " + dessert.getFoodName() +", Price: " + dessert.getPrice());
		}

		System.out.println("Chocolates:");
		for(Chocolates chocolate: chocolates)
		{
			System.out.println("Name: " + chocolate.getFoodName() +", Price: " + chocolate.getPrice());
		}
	}
}
