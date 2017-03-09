
public class problemsix {

	public static void main(String[] args) {
		//variables
		double EC_PCTTOTALSALES = .65;
		double sales = 8300000;
		//find out total sales for the east coast
		double eastCoastSales = sales * EC_PCTTOTALSALES;
		//console output
		System.out.printf("East Coast division made $%,.0f in sales", eastCoastSales);
		

	}

}
