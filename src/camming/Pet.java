package camming;

import java.util.Date;

public class Pet {

	private Integer id;    
    private Integer ownerId;    //主人ID
    private Integer storeId;    //商店ID
    private String name;    //姓名
    private String typeName;    //类型
    private int health;    //健康值
    private int love;    //爱心值
    private Date birthday;    //生日
	public Pet(int id,int ownerId,int storeId,String name,String typeName
			,int health,int love,Date birthday) {
		this.id = id;
		this.ownerId = ownerId;
		this.storeId = storeId;
		this.name = name;
		this.typeName = typeName;
		this.health = health;
		this.love = love;
		this.birthday = birthday;
	}
    
    

}
