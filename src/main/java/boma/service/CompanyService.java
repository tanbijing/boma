package boma.service;

import java.util.List;
import java.util.Map;

import boma.model.Company;

public interface CompanyService {
	public Company createCompany(Map<String, String> companyMap);
	public boolean deleteCompany(Integer index);
	public Integer updateCompany(Integer index);
	public List<Company> searchCompany(Map<String,String> searchKey);
	public Company searchOneCompany(Integer index);
}
