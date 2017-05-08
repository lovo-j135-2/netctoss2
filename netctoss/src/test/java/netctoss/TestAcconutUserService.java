package netctoss;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lovo.j135_2.netctoss.usermag.beans.AcconutUser;
import lovo.j135_2.netctoss.usermag.service.AcconutUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-context.xml")
public class TestAcconutUserService {
	@Resource
	private AcconutUserService acconutUserServiceImpl;
	@Ignore
	public void testSaveAcconutUser(){
		AcconutUser user = new AcconutUser("test4", "test4", "1234", 1, "tes", "13982669852", "李兰", "638400", "24412573", 1);
		int num=0;
		try {
			num = acconutUserServiceImpl.saveAcconutUser(user);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(num);
	}
	@Test
	public void testDelAcconutUserById(){
		int num=0;
		try {
			num=acconutUserServiceImpl.deleteAcconutUser(2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(num);
	}
	@Ignore
	public void testUpdateAcconutUserById(){
		int num = 0;
		AcconutUser user=null;
		try {
			user = acconutUserServiceImpl.queryAcconutUserById(1);
			user.setStatus(1);
			acconutUserServiceImpl.updateAcconutUser(user);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(num);
	}
	@Ignore
	public void testQueryAcconutUserById(){
		AcconutUser user = null;
		try {
			user = acconutUserServiceImpl.queryAcconutUserById(1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(user);
	}
}
