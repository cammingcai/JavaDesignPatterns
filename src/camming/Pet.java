package camming;

import java.util.Date;

public class Pet {

	private Integer id;    
    private Integer ownerId;    //����ID
    private Integer storeId;    //�̵�ID
    private String name;    //����
    private String typeName;    //����
    private int health;    //����ֵ
    private int love;    //����ֵ
    private Date birthday;    //����
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
