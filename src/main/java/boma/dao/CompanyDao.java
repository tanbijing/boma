package boma.dao;

import java.util.List;
import java.util.Map;

import boma.model.Company;
public interface CompanyDao {
	public Company selectOneCompany(Integer id);
	public List<Company> getList(Map<String,String> where);
	public int create(Company company);
	public int delete(Integer id);
}
