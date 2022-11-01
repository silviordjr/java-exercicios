package entities;

public class Students {
	public String name;
	public double a, b, c;
	
	public String status () {
		String message;
		
		if ((a + b + c) > 60) {
			message = this.pass(a + b + c);
		} else {
			message = this.failed(a + b + c);
		}
		
		return message;
	}
	
	private String failed (double finalGrade) {
		double missing = 60.0 - finalGrade;
		return String.format("FINAL GRADE = %.2f %nFAILED %nMISSING %.2f POINTS", finalGrade, missing);
	}
	
	private String pass (double finalGrade) {
		return String.format("FINAL GRADE = %.2f %nPASS", finalGrade);
	}
}
