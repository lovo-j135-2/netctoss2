package lovo.j135_2.netctoss.dmsmag.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import lovo.j135_2.netctoss.dmsmag.beans.DMS;

public interface DMSMapper {
	
	@Select(value="select * from t_dms where begin_time between #{dates[0]} and #{dates[1]} and end_time between #{dates[0]} and #{dates[1]}")
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="beginTime",column="begin_time",javaType=java.util.Date.class),
		@Result(property="endTime",column="end_time",javaType=java.util.Date.class),
		@Result(property="businessName",column="business_name",javaType=String.class),
		@Result(property="ip",column="ip_num",javaType=String.class),
		@Result(property="accountId",column="accountuser_id",javaType=Long.class)
	})
	public List<DMS> findAccountByDate(@Param("dates")List<Date> dates) throws Exception;
}
