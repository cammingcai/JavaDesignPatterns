package observer;

/**
 * 
 * ���۲��߳�����
 * 
 * */
public interface Observerable {

	/**��ӹ۲���*/
	void registerOberver(Observer o);
	/**���Ƴ��۲���*/
	void removeOberver(Observer o);
	/**֪ͨ�۲���*/
	void notifyOberver();
	
}
