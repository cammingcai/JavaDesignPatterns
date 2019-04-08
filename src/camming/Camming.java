package camming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import adapter.CammingAdapter;
import builder.CammingBuilder;
import command.CammingCommand;
import command.Game;
import command.LeftCommand;
import factory.Sender;
import factory.SenderEnum;
import factory.SenderFactory;
import observer.CammingServer;
import observer.User;
import singleton.CammingSingleton;
import strategy.AddStrategy;
import strategy.CammingStrategy;
import strategy.DivisionStrategy;

public class Camming {

    public static void main(String[] args) {
    	
    	   //TreeMap<Integer, String> tmap = new TreeMap<>();
    	   Map<Integer, String> tmap = new HashMap<>();
           tmap.put(1, "1H");
           tmap.put(2, "2E");
           tmap.put(3, "3L");
           tmap.put(4, "44");
           tmap.put(5, "5O");
//           for (Map.Entry entry: tmap.entrySet()) {
//               System.out.println(entry);
//           }
           
           Iterator iter = tmap.entrySet().iterator();
           while (iter.hasNext()) {
               System.out.println(iter.next());
           }
//    	LinkedList<String> list=  new LinkedList<>();
//    	
//    	list.add("A");
//    	list.add("B");
//    	list.add("C");
//    	list.add("D");
//    	list.add("E");
////    	System.out.println(list.getFirst());
////    	System.out.println(list.getLast());
//     	for(int i=0;i<list.size();i++) {
//     		System.out.println(list.get(i));
//     	}
//    	float total  =100f;
//    	float sum = 0;
//    	
//    	for(int i=0;i<10;i++) {
//    		total = total/2.0f;
//    		sum += total;
//    		System.out.println("��"+(i+1)+"�εĸ߶���="+total);
//    		
//    		
//    	}
//    	System.out.println("�ڵ�10�����ʱ������="+(int)Math.abs(100+sum*2)+"��");
    	
    	//    	//�۲���ģʽ
//    	CammingServer server = new CammingServer();
//    	server.registerOberver(new User("С��"));
//    	server.registerOberver(new User("С��"));
//    	server.registerOberver(new User("Сǿ"));
//    	server.notifyMessage("Сǿ��������������");
    
        //����ģʽ
//    	SenderFactory senderFactory = new SenderFactory();
//    	Sender sender = senderFactory.getSender(SenderEnum.QQ);
//    	sender.send();
    	
    	//������ģʽ
//    	CammingBuilder cammingBuilder = new CammingBuilder.Builder()
//    			.setAge(18)
//    			.setPhone("13560048370")
//    			.setHeight("180cm")
//    			.build();
//    	System.out.println(cammingBuilder.toString());
    	
    	//����ģʽ
//    	CammingStrategy strategy = new CammingStrategy(new AddStrategy());
//    	String numSum = strategy.calculation(88, 100);
//    	System.out.println("���Լӷ�numSum="+numSum);
//     	CammingStrategy strategy = new CammingStrategy(new DivisionStrategy());
//    	String numSum = strategy.calculation(100, 34);
//    	System.out.println("����numSum="+numSum);
    	
    	//����ģʽ
//    	CammingSingleton.getInstall().single();
    	
    	//������ģʽ
//    	CammingAdapter adapter = new CammingAdapter();
//    	adapter.payHouse();
//    	adapter.payCar();
    	
    	//Android ����ģʽ
//    	Game game = new Game();
//    	CammingCommand command  = new CammingCommand();
//    	command.setLeftCommand(new LeftCommand(game));
//    	command.toLeft();
    }

  
}
