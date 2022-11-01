package entities;

public class NaturalPerson extends TaxPayer {
	private Double healthSpending;
	
	public NaturalPerson () {
		super();
	}
	
	public NaturalPerson(String name, Double anualIncome, Double healthSpending) {
		super(name, anualIncome);
		this.healthSpending = healthSpending;
	}
	
	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double incomeTax() {
		Double tax;
		
		if (this.getAnualIncome() < 20000.0) {
			tax = this.getAnualIncome()*0.15 - this.healthSpending*0.5;
		} else {
			tax = this.getAnualIncome()*0.25 - this.healthSpending*0.5;
		}
		
		return tax;
	}

}
