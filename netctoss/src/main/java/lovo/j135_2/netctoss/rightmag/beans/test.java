package lovo.j135_2.netctoss.rightmag.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lovo.j135_2.netctoss.rightmag.service.RoleService;
import lovo.j135_2.netctoss.rightmag.service.impl.RoleServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:spring-context.xml"})

public class test {
	@Resource
	private RoleService roleServiceImpl;
	
	@Test
	public void testSaveRole(){
		
		Role role=new Role("科学家","admin");
		roleServiceImpl.saveRole(role);
	}
	
	@Test
	public void testDeleteRole(){
		roleServiceImpl.deleteRole(1);
	}
	
	@Test
	public void testUpdateRole(){
		Role role=new Role(3, "god", "user");
		roleServiceImpl.updateRole(role);
	}
	
	@Test
	public void testGetRole(){
		List<Role>roleList=roleServiceImpl.getRole("g", "user");
		for(Role role:roleList){
			System.out.println("rolename=:"+role.getName());
			System.out.println("roleType=:"+role.getRoleType());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
