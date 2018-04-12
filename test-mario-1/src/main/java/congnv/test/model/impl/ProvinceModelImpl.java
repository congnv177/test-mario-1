package congnv.test.model.impl;

import com.nhb.common.db.models.AbstractModel;

import congnv.test.DAO.ProvinceDAO;
import congnv.test.bean.ProvinceBean;
import congnv.test.model.ProvinceModel;

public class ProvinceModelImpl extends AbstractModel implements ProvinceModel {

	@Override
	public boolean insert(String name, String desc) {
		ProvinceBean bean = ProvinceBean.builder().name(name).desc(desc).build();
		try (ProvinceDAO dao = this.openDAO(ProvinceDAO.class)){
			return dao.insertProvince(bean) == 1;
		}
	}

	@Override
	public String fetchById(int id) {
		try (ProvinceDAO dao = this.openDAO(ProvinceDAO.class)) {
			return dao.fetchProvinceById(id);
		}
	}
	
	@Override
	public boolean deleteById(int id) {
		try(ProvinceDAO dao = this.openDAO(ProvinceDAO.class)){
			return dao.deleteProvinceById(id) == 1;
		}
	}

	@Override
	public boolean update(int id) {
		try (ProvinceDAO dao = this.openDAO(ProvinceDAO.class)){
			return dao.updateProvinceById(id) == 1;
		}
	}
	
}
