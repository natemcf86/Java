
public class RaceRunning {
	private String runner1;				//name of first runner
	private String runner2;				//name of second runner
	private String runner3;				//name of third runner
	private double runner1Time;			//first runner's time in minutes
	private double runner2Time;			//second runner's time in minutes
	private double runner3Time;			//third runner's time in minutes
	private String output = "";			//string to put results of race in
	private double[] array = {1, 2, 3, 4};
	public RaceRunning() {
		
	}
	
	//getters and setters
	public String getRunner1() {
		return runner1;
		
	}
	public void setRunner1(String r1) {
		this.runner1 = r1;
	}

	public String getRunner2() {
		return runner2;
	}

	public void setRunner2(String r2) {
		this.runner2 = r2;
	}

	public String getRunner3() {
		return runner3;
	}

	public void setRunner3(String r3) {
		this.runner3 = r3;
	}

	public double getRunner1Time() {
		return runner1Time;
	}

	public void setRunner1Time(double a) {
		this.runner1Time = a;
	}

	public double getRunner2Time() {
		return runner2Time;
	}

	public void setRunner2Time(double b) {
		this.runner2Time = b;
	}

	public double getRunner3Time() {
		return runner3Time;
	}

	public void setRunner3Time(double c) {
		this.runner3Time = c;
	}
	public String getOutput() {
		return output;
	}
	//nested if/else statement that will get input information into output string to display first, second, and third place
	public void FirstPlace() {
		//if runner1 was first place
		if (runner1Time < runner2Time && runner1Time < runner3Time) {
			output += "First place: " + runner1 + "\n";
			//if runner1 was first place and runner2 was second
			if (runner2Time < runner3Time) {
				output += "Second place: " + runner2 + "\n"
						+ "Third place: " + runner3 + "\n";
			//if runner1 was first place and runner3 was second
			} else if (runner3Time < runner2Time) {
				output += "Second place: " + runner3 + "\n"
						+ "Third place: " + runner2 + "\n";
			}
			
		//if runner2 was first place
		} else if (runner2Time < runner1Time && runner2Time < runner3Time) {
			output += "First place: " + runner2 + "\n";
			//if runner2 was first and runner1 was second
			if (runner1Time < runner3Time) {
				output += "Second place: " + runner1 + "\n"
						+ "Third place: " + runner3 + "\n";
			//if runner2 was first place and runner3 was second
			} else if (runner3Time < runner1Time) {
				output += "Second place: " + runner3 + "\n"
						+ "Third place: " + runner1 + "\n";
			}
			
		//if runner3 was first place
		} else if (runner3Time < runner1Time && runner3Time < runner2Time) {
			output += "First place: " + runner3 + "\n";
			//if runner3 was first place and runner1 was second
			if (runner1Time < runner2Time) {
				output += "Second place: " + runner1 + "\n"
						+ "Third place: " + runner2 + "\n";
			//if runner2 was first place and runner3 was second
			} else if (runner2Time < runner1Time) {
				output += "Second place: " + runner2 + "\n"
						+ "Third place: " + runner1 + "\n";
			}
			
		}
	}

}
