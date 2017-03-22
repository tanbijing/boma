package boma.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import boma.dao.CompanyDao;
import boma.dao.CompanyLeaderDao;
import boma.model.Company;
import boma.model.CompanyLeader;

@Controller
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private CompanyDao dao;
	@Autowired
	private CompanyLeaderDao leaderDao;
	
	@RequestMapping("")
	public ModelAndView companyIndex(){
		Map<String,String> condition = new HashMap<String, String>();
		condition.put("id", "0");
		List<Company> companies = dao.getList(condition);
		Logger log = Logger.getLogger(this.getClass());
		log.debug(companies);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("companies", companies);
		map.put("position","企业列表");
		return new ModelAndView("company/index",map);
	}
	@RequestMapping(value="/{id}", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String getCompanyById(@PathVariable("id") Integer id){
		Company com = dao.selectOneCompany(id);
		Map<String,Company> map = new HashMap<String,Company>();
		map.put("company", com);
		JSONObject j = new JSONObject();
		j.put("json", map);
		return j.toString();
	}
	@RequestMapping("/new")
	public ModelAndView newCompany(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("position","添加企业");
		return new ModelAndView("company/new",map);
	}
	@RequestMapping("/create")
	public String create(@RequestParam(value="name") String name,
						 @RequestParam(value="leader") String leader_name,
						 @RequestParam(value="desc") String desc,
						 @RequestParam(value="logo") MultipartFile multipartFile){
		CompanyLeader leader = new CompanyLeader();
		leader.setName(leader_name);
		leaderDao.create(leader);
		Company com = new Company();
		com.setName(name);
		com.setDesc(desc);
		com.setCompany_leaders_id(leader.getId());
		dao.create(com);
		return "redirect:/company";
	}
	@RequestMapping(path="/{id}",method=RequestMethod.POST)
	@ResponseBody
	public String delete(@PathVariable("id") Integer id){
		dao.delete(id);
		return id.toString();
	}
}
