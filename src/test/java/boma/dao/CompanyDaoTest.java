package boma.dao;

import javax.annotation.Resource;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class CompanyDaoTest {
	@Resource
	private CompanyDao dao;
	@Test
	public void testSelectOneCompany() {
		System.out.println(dao.selectOneCompany(23));
	}

}
