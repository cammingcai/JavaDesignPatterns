package strategy;

public class CammingStrategy {

	private CalculationStrategy<?> strategy;
	public CammingStrategy(CalculationStrategy<?> ss) {
		this.strategy = ss;
	}
	
	public String calculation(int num1,int num2) {
		String sum = null;
		if(strategy!=null) {
			sum = strategy.calculation(num1, num2)+"";
		}
		return sum;
	}

}
