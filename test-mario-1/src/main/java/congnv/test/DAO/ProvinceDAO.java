package congnv.test.DAO;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

import com.nhb.common.db.sql.daos.BaseMySqlDAO;

import congnv.test.bean.ProvinceBean;


public abstract class ProvinceDAO extends BaseMySqlDAO {
	
	@SqlUpdate("INSERT INTO `administrative_area`.`province` (name, desc) VALUES (:name, :desc)")
	public abstract int insertProvince(@BindBean ProvinceBean bean);
	
	@SqlUpdate("UPDATE `administrative_area`.`province` SET name = :name, desc = :desc WHERE id = :id")
	public abstract int updateProvinceById(@Bind("id") int id);
	
	@SqlUpdate("DELETE FROM `administrative_area`.`province` WHERE ID = :ID")
	public abstract int deleteProvinceById(@Bind("id") int id);
	
	@SqlQuery("SELECT area.name FROM `administrative_area`.`province` WHERE id = :id")
	public abstract String fetchProvinceById(@Bind("id") int id);
}
