package strategy;

public class DivisionStrategy implements CalculationStrategy<Float> {

	@Override
	public Float calculation(int numa, int numb) {
		// TODO Auto-generated method stub
		return numa/(float)numb;
	}

	

}
