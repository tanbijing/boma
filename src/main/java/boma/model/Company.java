package boma.model;

public class Company {
	private Integer id;
	private String name;
	private String desc;
	private Integer company_leaders_id;
	private CompanyLeader leader;
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public CompanyLeader getLeader() {
		return leader;
	}
	public void setLeader(CompanyLeader leader) {
		this.leader = leader;
	}
	public Integer getCompany_leaders_id() {
		return company_leaders_id;
	}
	public void setCompany_leaders_id(Integer company_leaders_id) {
		this.company_leaders_id = company_leaders_id;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", desc=" + desc+ ", leader=" + leader+ ", company_leaders_id=" + company_leaders_id + "]";
	}
}
