
public class FatGram {
	private double calories;		//calories in a food item
	private double fatGrams;		//fat grams in a food item
	private double fat;
	public FatGram() {
		// TODO Auto-generated constructor stub
	}
	
	public double getCalories() {
		return calories;
	}

	public void setCalories(double c) {
		this.calories = c;
	}

	public double getFatGrams() {
		return fatGrams;
	}

	public void setFatGrams(double f) {
		this.fatGrams = f;
		}

	public void setFat(){
		fat = fatGrams * 9;
	}
	public double getFat() {
		return fat;
	}
	public double fatPercent() {
		return fat / calories;
	}

}
