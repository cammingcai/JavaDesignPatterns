package camming;

import java.util.List;

public interface PetDao {
	   /**
     * 查询所有宠物
     */
    List<Pet> findAllPets() throws Exception;
}
