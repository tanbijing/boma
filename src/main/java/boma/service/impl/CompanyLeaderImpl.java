package boma.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boma.dao.CompanyLeaderDao;
import boma.model.CompanyLeader;
import boma.service.CompanyLeaderService;
@Service
public class CompanyLeaderImpl implements CompanyLeaderService {
	@Autowired
	private CompanyLeaderDao dao;
	
	@Override
	public CompanyLeader createCompanyLeader(Map<String, String> companyLeaderMap) {
		// TODO Auto-generated method stub
		CompanyLeader leader = new CompanyLeader();
		leader.setName(companyLeaderMap.get("leader_name"));
		dao.create(leader);
		return leader;
	}

	@Override
	public boolean deleteCompanyLeader(Integer index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer updateCompanyLeader(Integer index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CompanyLeader> searchCompanyLeader(Map<String, String> searchKey) {
		// TODO Auto-generated method stub
		return null;
	}

	public CompanyLeaderDao getDao() {
		return dao;
	}

	public void setDao(CompanyLeaderDao dao) {
		this.dao = dao;
	}

}
