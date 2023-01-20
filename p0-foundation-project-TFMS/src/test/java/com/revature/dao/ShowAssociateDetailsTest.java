package com.revature.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.revature.dao.impl.AssociateDaoMethodImpl;
import com.revature.model.Associate;

public class ShowAssociateDetailsTest {

		@Test
		public void test()
		{
			Associate a= new Associate("45","swaraj","mainframe","mtech","123");
			AssociateDaoMethodImpl b=new AssociateDaoMethodImpl();
			try {
				b.showDetails();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			int x=AssociateDaoMethodImpl.v;
			assertEquals(x,AssociateDaoMethodImpl.v);
		}

}
