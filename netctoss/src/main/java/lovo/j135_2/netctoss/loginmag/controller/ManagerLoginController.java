package lovo.j135_2.netctoss.loginmag.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lovo.j135_2.netctoss.loginmag.service.IManagerLoginService;
//@RestController === @ResponseBody +  @Controller
@RequestMapping("/managersLogin")
@RestController
//将所有方法的执行结果放入到响应体中，并且将该组件交给spring容器
public class ManagerLoginController {
	@Resource 
	private IManagerLoginService ManagerLoginServiceImpl;


}
