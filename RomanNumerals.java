
public class RomanNumerals {
	private int romnum;
	
	public RomanNumerals(int num) {
		this.romnum = num;
	}

	public void getRomnum() {
		switch(romnum){
		case 1:
			System.out.print("I");
			break;
		case 2:
			System.out.print("II");
			break;
		case 3:
			System.out.print("III");
			break;
		case 4:
			System.out.print("IV");
			break;
		case 5:
			System.out.print("V");
			break;
		case 6:
			System.out.print("VI");
			break;
		case 7:
			System.out.print("VII");
			break;
		case 8:
			System.out.print("VIII");
			break;
		case 9:
			System.out.print("IX");
			break;
		case 10:
			System.out.print("X");
			break;
		default:
			System.out.print("This was not a valid entry.");
			break;		
		}
	}
	public class GetType {
		public String getType(String s){
			return "string";
		}
		public String getType(int i){
			return "int";
		}
		public String getType(double d){
			return "double";
		}
	}

}
