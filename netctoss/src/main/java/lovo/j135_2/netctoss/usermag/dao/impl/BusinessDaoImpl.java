package lovo.j135_2.netctoss.usermag.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import lovo.j135_2.netctoss.usermag.beans.Business;
import lovo.j135_2.netctoss.usermag.dao.IBusinessDao;
import lovo.j135_2.netctoss.usermag.mapper.BusinessMapper;
@Repository
public class BusinessDaoImpl implements IBusinessDao{
	@Resource
	private BusinessMapper businessMapper;
	@Override
	public int saveBusiness(Business business) throws Exception {
		// TODO Auto-generated method stub
		return businessMapper.saveBusiness(business);
	}

	@Override
	public int delBusiness(int id) throws Exception {
		// TODO Auto-generated method stub
		return businessMapper.delBusiness(id);
	}

	@Override
	public int updateBusiness(Business business) throws Exception {
		// TODO Auto-generated method stub
		return businessMapper.updateBusiness(business);
	}

	@Override
	public Business queryBusinessById(int id) throws Exception {
		// TODO Auto-generated method stub
		return businessMapper.queryBusinessById(id);
	}

}
