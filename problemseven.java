
public class problemseven {

	public static void main(String[] args) {
		//variables
		double acre = 43560;
		double totalLand = 389767;
		double acreLand = totalLand / acre;
		//find out acres owned by the amount of feet owned
		System.out.printf("I own %,.0f feet in land.\n", totalLand);
		rest(2000);
		System.out.printf("There are %,.0f feet in an acre.\n", acre);
		rest(2000);
		System.out.printf("I own %,.2f acres in land.\n", acreLand);
		

	}
	public static void rest(int num){
		try {
		    Thread.sleep(num);                
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}

}
