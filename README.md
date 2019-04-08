    	
//    	//观察者模式
//    	CammingServer server = new CammingServer();
//    	server.registerOberver(new User("小明"));
//    	server.registerOberver(new User("小花"));
//    	server.registerOberver(new User("小强"));
//    	server.notifyMessage("小强哈哈哈哈哈哈哈");
    
        //工厂模式
//    	SenderFactory senderFactory = new SenderFactory();
//    	Sender sender = senderFactory.getSender(SenderEnum.QQ);
//    	sender.send();
    	
    	//建造者模式
//    	CammingBuilder cammingBuilder = new CammingBuilder.Builder()
//    			.setAge(18)
//    			.setPhone("13560048370")
//    			.setHeight("180cm")
//    			.build();
//    	System.out.println(cammingBuilder.toString());
    	
    	//策略模式
//    	CammingStrategy strategy = new CammingStrategy(new AddStrategy());
//    	String numSum = strategy.calculation(88, 100);
//    	System.out.println("策略加法numSum="+numSum);
//     	CammingStrategy strategy = new CammingStrategy(new DivisionStrategy());
//    	String numSum = strategy.calculation(100, 34);
//    	System.out.println("除法numSum="+numSum);
    	
    	//单例模式
//    	CammingSingleton.getInstall().single();
    	
    	//适配器模式
    	CammingAdapter adapter = new CammingAdapter();
    	adapter.payHouse();
    	adapter.payCar();