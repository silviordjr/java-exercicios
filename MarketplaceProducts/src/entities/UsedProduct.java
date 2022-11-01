package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class UsedProduct extends Products {
	private LocalDate manufacturedDate;
	
	public UsedProduct () {}
	
	public UsedProduct(String name, Double price, String manufacturedDate) {
		super(name, price);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.manufacturedDate =  LocalDate.parse(manufacturedDate, fmt1);
	}

	public LocalDate getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(String manufacturedDate) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.manufacturedDate = LocalDate.parse(manufacturedDate, fmt1);
	}
	
	@Override 
	public String toString () {
		return super.getName() + "(used) $" + super.getPrice() + "(Data de fabricação: " + manufacturedDate + ")"; 
	}
}
