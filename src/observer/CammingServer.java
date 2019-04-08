package observer;

import java.util.ArrayList;
import java.util.List;
/**被观察者*/
public class CammingServer implements Observerable {

	private List<Observer> mList ;
	private String message;
	
	public CammingServer() {
		mList = new ArrayList<>();
	}

	@Override
	public void registerOberver(Observer o) {
		mList.add(o);		
	}

	@Override
	public void removeOberver(Observer o) {
		if(mList!=null&&!mList.isEmpty())
			mList.remove(o);
		
	}

	@Override
	public void notifyOberver() {
		if(mList!=null) {
			for (Observer observer : mList) {
				observer.update(message);
			}
		}
		
	}
	
	public void notifyMessage(String msg) {
		this.message = msg;
		//消息对象
		notifyOberver();
	}

}
