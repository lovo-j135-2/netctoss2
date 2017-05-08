package lovo.j135_2.netctoss.usermag.service;

import lovo.j135_2.netctoss.usermag.beans.Business;

/**
 * 业务业务�?
 * @author Administrator
 *
 */
public interface BusinessService {
	/**
	 * 添加业务
	 * @param business
	 * @return
	 * @throws Exception
	 */
	public int saveBusiness(Business business) throws Exception;
	/**
	 * 删除业务
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int delBusiness(int id) throws Exception;
	/**
	 * 修改业务状�??
	 * @param business
	 * @return
	 * @throws Exception
	 */
	public int updateBusiness(Business business) throws Exception;
	/**
	 * 按id查询业务
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Business queryBusinessById(int id) throws Exception;
}
