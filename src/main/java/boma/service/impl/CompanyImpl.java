package boma.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boma.dao.CompanyDao;
import boma.model.Company;
import boma.model.CompanyLeader;
import boma.service.CompanyLeaderService;
import boma.service.CompanyService;
@Service
public class CompanyImpl implements CompanyService {
	@Autowired
	private CompanyDao dao;
	@Autowired
	private CompanyLeaderService companyLeaderService;
	
	@Override
	public Company createCompany(Map<String, String> companyMap) {
		// TODO Auto-generated method stub
		CompanyLeader leader = companyLeaderService.createCompanyLeader(companyMap);
		Company com = new Company();
		com.setName(companyMap.get("name"));
		com.setDesc(companyMap.get("desc"));
		com.setCompany_leaders_id(leader.getId());
		dao.create(com);
		return com;
	}

	@Override
	public boolean deleteCompany(Integer index) {
		// TODO Auto-generated method stub
		dao.delete(index);
		return false;
	}

	@Override
	public Integer updateCompany(Integer index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Company> searchCompany(Map<String, String> searchKey) {
		// TODO Auto-generated method stub
		List<Company> companies = dao.getList(searchKey);
		Logger log = Logger.getLogger(this.getClass());
		log.debug(companies);
		return companies;
	}

	@Override
	public Company searchOneCompany(Integer index) {
		// TODO Auto-generated method stub
		return dao.selectOneCompany(index);
	}

}
