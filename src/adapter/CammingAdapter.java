package adapter;

public class CammingAdapter extends CammingAdaptee implements Adapter {


	@Override
	public void payHouse() {
		super.payHouse();
		System.out.println("CammingAdapter payHouse");
	}
	@Override
	public void payCar() {
		System.out.println("CammingAdapter payCar");
	}

}
