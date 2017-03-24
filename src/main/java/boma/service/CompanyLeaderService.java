package boma.service;

import java.util.List;
import java.util.Map;

import boma.model.CompanyLeader;

public interface CompanyLeaderService {
	public CompanyLeader createCompanyLeader(Map<String, String> companyLeaderMap);
	public boolean deleteCompanyLeader(Integer index);
	public Integer updateCompanyLeader(Integer index);
	public List<CompanyLeader> searchCompanyLeader(Map<String,String> searchKey);
}
