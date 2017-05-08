package lovo.j135_2.netctoss.usermag.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import lovo.j135_2.netctoss.usermag.beans.Business;
import lovo.j135_2.netctoss.usermag.dao.IBusinessDao;
import lovo.j135_2.netctoss.usermag.service.BusinessService;
@Service
public class BusinessServiceImpl implements BusinessService {
	@Resource
	private IBusinessDao businessDaoImpl;
	@Override
	public int saveBusiness(Business business) throws Exception {
		// TODO Auto-generated method stub
		return businessDaoImpl.saveBusiness(business);
	}

	@Override
	public int delBusiness(int id) throws Exception {
		// TODO Auto-generated method stub
		return businessDaoImpl.delBusiness(id);
	}

	@Override
	public int updateBusiness(Business business) throws Exception {
		// TODO Auto-generated method stub
		return businessDaoImpl.updateBusiness(business);
	}

	@Override
	public Business queryBusinessById(int id) throws Exception {
		// TODO Auto-generated method stub
		return businessDaoImpl.queryBusinessById(id);
	}

}
