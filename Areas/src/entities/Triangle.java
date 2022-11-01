package entities;

public class Triangle {

	public double a, b, c;

	public double area () {
		double p = (this.a + this.b + this.c)/2.0;
		
		return Math.sqrt(p*(p - a)*p*(p - b)*p*(p - c));
	}


}