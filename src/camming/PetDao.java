package camming;

import java.util.List;

public interface PetDao {
	   /**
     * ��ѯ���г���
     */
    List<Pet> findAllPets() throws Exception;
}
