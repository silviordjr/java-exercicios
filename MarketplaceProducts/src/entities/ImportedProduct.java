package entities;

public class ImportedProduct extends Products {
	private Double customsFee;
	
	public ImportedProduct () {}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String toString () {
		Double totalCost = customsFee + super.getPrice();
		
		return super.getName() +  "$" + totalCost + "(Taxa de Importação: $" + customsFee + ")";
	}
}
