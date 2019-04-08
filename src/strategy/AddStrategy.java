package strategy;

public class AddStrategy implements CalculationStrategy<Integer> {

	public AddStrategy() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer calculation(int numa, int numb) {
		return numa+numb;
	}

}
