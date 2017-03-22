package boma.dao;

import java.util.List;
import java.util.Map;

import boma.model.CompanyLeader;

public interface CompanyLeaderDao {
	public CompanyLeader getLeaderById(Integer id);
	public List<CompanyLeader> getList(Map<String, String> where);
	public int create(CompanyLeader leader);
}
