package com.test.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.domain.MemberVO;
import com.test.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {

	@Inject
	private MemberDAO dao;
	
	@Test
	public void testGetTime() {
		System.out.println("testGetTime...");
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testInsertMember() {
		MemberVO vo = new MemberVO();
		vo.setUserid("user00");
		vo.setUserpw("user00");
		vo.setUsername("노아람");
		vo.setEmail("user00@naver.com");
		
		dao.insertMember(vo);
		
	}
	
	@Test
	public void testReadMember() throws Exception {
		dao.readMember("user00");
	}
	
	@Test
	public void testReadWithPW() throws Exception {
		dao.readWithPW("user00", "user00");
	}
}
