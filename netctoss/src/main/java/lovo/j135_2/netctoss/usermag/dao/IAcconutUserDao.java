package lovo.j135_2.netctoss.usermag.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import lovo.j135_2.netctoss.usermag.beans.AcconutUser;
import lovo.j135_2.netctoss.usermag.beans.Pager;

/**
 * 账务持久层接口
 * @author Administrator
 *
 */
public interface IAcconutUserDao {
	
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
	public int delAcconutUser(int id) throws Exception;
	/**
	 * 修改账务账号状态
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
	/**
	 * 分页查询账务
	 * @param pager
	 * @return
	 * @throws Exception
	 */
	public List<AcconutUser> queryAcconutUserByPager(Pager pager)throws Exception;
}
