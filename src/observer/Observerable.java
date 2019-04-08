package observer;

/**
 * 
 * 被观察者抽象类
 * 
 * */
public interface Observerable {

	/**添加观察者*/
	void registerOberver(Observer o);
	/**添移除观察者*/
	void removeOberver(Observer o);
	/**通知观察者*/
	void notifyOberver();
	
}
