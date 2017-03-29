package boma.dao;

import javax.annotation.Resource;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import boma.service.CompanyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-dao.xml","classpath:spring-service.xml"})
public class CompanyDaoTest {
	@Resource
	private CompanyService service;
	@Test
	public void testSelectOneCompany() {
		System.out.println(service.searchOneCompany(23));
	}

}
