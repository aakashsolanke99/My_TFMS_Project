package com.revature.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.revature.model.Associate;
import com.revature.model.User;
import com.revature.service.impl.LoginImpl;

public class AssociateLoginTest {
	

	Login l=new LoginImpl();
	User res=new User();
	@Test
	public void test() {
		User uu=new User("aakash","aakash@123","");
		res=l.getUser(uu);
		assertEquals(res.getUsername(),uu.getUsername());

}
}