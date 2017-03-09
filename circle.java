
public class circle {
		//variables
		private double radius;
		final double PI = 3.14159;
		public circle(){	
		}
		//getters and setters
		public double getRadius() {
			return radius;
		}
		public void setRadius(double b) {
			this.radius = b;
		}
		//math to find area of circle
		public double getArea() {
			return PI * radius * radius;
		}
		//math to find diameter of circle
		public double getDiameter() {
			return radius * 2;
		}
		//math to find circumference of circle
		public double getCircumference() {
			return 2 * PI * radius;
		}
		

		

	}

