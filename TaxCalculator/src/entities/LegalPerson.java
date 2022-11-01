package entities;

public class LegalPerson extends TaxPayer {
	private Integer employees;
	
	public LegalPerson () {
		super();
	}
	
	
	public LegalPerson(String name, Double anualIncome, Integer employees) {
		super(name, anualIncome);
		this.employees = employees;
	}
	
	public Integer getEmployees() {
		return employees;
	}


	public void setEmployees(Integer employees) {
		this.employees = employees;
	}


	@Override
	public Double incomeTax() {
		Double tax;
		
		if (employees > 10) {
			tax = this.getAnualIncome()*0.14;
		} else {
			tax = this.getAnualIncome()*0.16;
		}
		
		return tax;
	}

}
