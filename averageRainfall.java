
public class averageRainfall {
	private double totalRainfall;			//total rainfall for the entire time period
	private double rainfall;				//stores monthly rainfall
	private double totalMonths;				//total months calculated by years * 12
	private double totalYears;				//total years looks at for the time period
	
	public averageRainfall() {
		
	}
	/**
	 * returns total rainfall for entire period
	 * @return
	 */
	public double getTotalRainfall() {
		return totalRainfall;
	}
	/**
	 * sets total rainfall for entire period
	 * @param tr
	 */
	public void setTotalRainfall(double tr) {
		this.totalRainfall = tr;
	}
	/**
	 * returns rainfall for current month
	 * @return
	 */
	public double getRainfall() {
		return rainfall;
	}
	/**
	 * stores rainfall for current month
	 * @param rf
	 */
	public void setRainfall(double rf) {
		this.rainfall = rf;
	}
	/**
	 * returns total years the program will run
	 * @return
	 */
	public double getTotalYears() {
		return totalYears;
	}
	/**
	 * stores total years the program will run
	 * @param ty
	 */
	public void setTotalYears(double ty) {
		this.totalYears = ty;
	}
	/**
	 * returns total months the program will run
	 * @return
	 */
	public double getTotalMonths() {
		return totalMonths;
	}
	/**
	 * stores total months calculated total years * 12
	 */
	public void setTotalMonths() {
		totalMonths = totalYears * 12;
	}
	/**
	 * gets the rainfall average per month for the entire time period used
	 * @return
	 */
	public double getRainfallAverage() {
		return totalRainfall / totalMonths;
	}

}
