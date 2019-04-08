package strategy;

public class SubtractionStrategy implements CalculationStrategy<Integer> {


	@Override
	public Integer calculation(int numa, int numb) {
		return numa-numb;
	}

}
