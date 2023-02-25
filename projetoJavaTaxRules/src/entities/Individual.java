package entities;

public class Individual extends TaxPayer {
	
	private Double HealthExpenditures;
	
	public Individual() {
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		HealthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return HealthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		HealthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double basicTax;
		if (getAnualIncome() < 2000.0) {
			basicTax = getAnualIncome() * 0.15;
		}
		else { basicTax = getAnualIncome() * 0.25;
		}
		basicTax -=  getHealthExpenditures() * 0.5;
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}
		return basicTax;
	}	
}
