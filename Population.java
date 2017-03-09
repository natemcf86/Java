
public class Population {
	private double populationIncrease;		//stores daily population increase
	private double maxDays;					//total days growing organism
	private double population;				//stores  population of organism
	public Population() {
		
	}
	/**
	 * returns populationIncrease
	 * @return
	 */
	public double getPopulationIncrease() {
		return populationIncrease/100;
	}
	/**
	 * sets populationIncrease
	 * @param pi
	 */
	public void setPopulationIncrease(double pi) {
		this.populationIncrease = pi;
	}
	/**
	 * returns maxDays
	 * @return
	 */
	public double getMaxDays() {
		return maxDays;
	}
	/**
	 * sets maxDays
	 * @param days
	 */
	public void setMaxDays(double d) {
		this.maxDays = d;
	}
	/**
	 * returns population
	 * @return
	 */
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double sp) {
		this.population = sp;
	}
	/**
	 * returns daily increase calculated by population times (populationIncrease/100)
	 * @return
	 */
	public void getDailyIncrease() {
		population = population * (1+ (populationIncrease/100));
	}
	
}
