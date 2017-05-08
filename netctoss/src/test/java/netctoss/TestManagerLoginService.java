package netctoss;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lovo.j135_2.netctoss.loginmag.service.IManagerLoginService;
import lovo.j135_2.netctoss.managermag.beans.Manager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring-context.xml")
public class TestManagerLoginService {
	@Resource
	private IManagerLoginService managerLoginServiceImpl;

	public void testLogin() {
		Manager ma = new Manager();
		ma.setAccounts("2222222");
		ma.setPassword("1111111");
		try {
			managerLoginServiceImpl.queryManagerByaccountsAndPassword(ma);
			Assert.assertNotNull(ma);
			System.out.println(ma);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
