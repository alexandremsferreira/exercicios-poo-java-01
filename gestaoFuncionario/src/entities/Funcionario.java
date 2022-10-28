package entities;

public class Funcionario {
	private String name; 
	private double grossSalary;
	private double tax;
	
	public double netSalary() {
		double tax = this.tax * this.grossSalary / 100;
		return this.grossSalary -= tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary += percentage * this.grossSalary / 100;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	
	
	
	
}
