package observer;

public class User implements Observer{

	
	private String name;
    private String message;
    
    public User(String name) {
        this.name = name;
    }
	    
	@Override
	public void update(String message) {
	      this.message = message;
	      System.out.println(name + " �յ�������Ϣ�� " + message);
	}

	

}
