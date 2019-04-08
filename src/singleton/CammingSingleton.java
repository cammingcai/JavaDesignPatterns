package singleton;

/**µ¥ÀýÄ£Ê½*/
public class CammingSingleton {

	
	private static CammingSingleton install;
	
	public static CammingSingleton getInstall() {
		if(install ==null) {
			synchronized (CammingSingleton.class) {
				if(install==null) {
					install = new CammingSingleton();
				}
			}
		}
		return install;
	}
	
	public  void single() {
		System.out.println("single");
	}

}
