package congnv.test.model;

public interface ProvinceModel {
	
	/**
	 * insert new province to DB
	 * @param name
	 * @param desc
	 */
	boolean insert(String name, String desc);
	
	/**
	 * fetch province by id
	 * @param id
	 * @return
	 */
	String fetchById(int id);
	
	/**
	 * delete province by id
	 * @param id
	 * @return
	 */
	boolean deleteById(int id);
	
	/**
	 * update province by id
	 * @param id
	 * @return
	 */
	boolean update(int id);
}
