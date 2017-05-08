package lovo.j135_2.netctoss.usermag.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import lovo.j135_2.netctoss.paymag.beans.Pay;
import lovo.j135_2.netctoss.usermag.beans.AcconutUser;
import lovo.j135_2.netctoss.usermag.beans.Business;
import lovo.j135_2.netctoss.usermag.beans.Lab;


public interface BusinessMapper {
	
	/**
	 * 娣诲姞涓氬姟
	 * @param business
	 * @return
	 * @throws Exception
	 */
	@Insert(value="insert into t_business values(null,#{business.business_name},#{business.password},#{business.fk_accountuser_id},#{business.pay},#{business.lab})")
	public int saveBusiness(@Param("business")Business business) throws Exception;
	/**
	 * 鍒犻櫎涓氬姟
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Delete(value="delete from t_business where id=#{id}")
	public int delBusiness(int id) throws Exception;
	/**
	 * 淇敼涓氬姟鐘舵��
	 * @param business
	 * @return
	 * @throws Exception
	 */
	@Update(value="update t_business set password=#{business.password}")
	public int updateBusiness(@Param("business")Business business) throws Exception;
	/**
	 * 鎸塱d鏌ヨ涓氬姟
	 * @param id
	 * @return
	 * @throws Exception
	 */
//	@Select(value="select * from t_business where id=#{id}")
	@Results({
		@Result(id=true,property="id",column="id",javaType=Integer.class),
		@Result(property="business_name",column="business_name",javaType=String.class),
		@Result(property="password",column="password",javaType=String.class),
		@Result(property="fk_accountuser_id",column="fk_accountuser_id",javaType=AcconutUser.class),
		@Result(property="pay",column="pay",javaType=Pay.class),
		@Result(property="lab",column="lab",javaType=Lab.class)
	})
	public Business queryBusinessById(int id) throws Exception;
}
