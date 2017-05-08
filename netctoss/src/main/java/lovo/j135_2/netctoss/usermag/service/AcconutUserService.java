package lovo.j135_2.netctoss.usermag.service;

import lovo.j135_2.netctoss.usermag.beans.AcconutUser;

/**
 * 账务业务
 * @author Administrator
 *
 */
public interface AcconutUserService {
	/**
	 * 添加账务账号
	 * @param user 账务账号
	 * @return
	 */
	public int saveAcconutUser(AcconutUser user) throws Exception;
	/**
	 * 按账务id删除账务账号
	 * @param id
	 * @return
	 */
	public int deleteAcconutUser(int id) throws Exception;
	/**
	 * 修改账务账号状
	 * @param user
	 * @return
	 */
	public int updateAcconutUser(AcconutUser user) throws Exception;
	/**
	 * 按账务id查询账务信息
	 * @param id 账务id
	 * @return 账务对象
	 */
	public AcconutUser queryAcconutUserById(int id) throws Exception; 
}
