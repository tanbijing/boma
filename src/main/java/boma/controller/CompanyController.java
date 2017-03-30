package boma.controller;


import java.util.HashMap;
import java.util.Map;

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

import boma.model.Company;
import boma.service.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping("")
	public ModelAndView companyIndex(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("companies", companyService.searchCompany(null));
		map.put("position","��ҵ�б�");
		return new ModelAndView("company/index",map);
	}
	@RequestMapping(value="/{id}", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String getCompanyById(@PathVariable("id") Integer id){
		Company com = companyService.searchOneCompany(id);
		Map<String,Company> map = new HashMap<String,Company>();
		map.put("company", com);
		JSONObject j = new JSONObject();
		j.put("json", map);
		return j.toString();
	}
	@RequestMapping("/new")
	public ModelAndView newCompany(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("position","�����ҵ");
		return new ModelAndView("company/new",map);
	}
	/**
	 * ��ҵ����
	 * @param name
	 * 
	 * ��ҵ��������
	 * @param leader_name
	 * 
	 * ��ҵ���
	 * @param desc
	 * 
	 * ��ҵlogoͼƬ
	 * @param multipartFile
	 * 
	 */
	@RequestMapping("/create")
	public String create(@RequestParam(value="id") String id,
						 @RequestParam(value="name") String name,
						 @RequestParam(value="leader") String leader_name,
						 @RequestParam(value="desc") String desc,
						 @RequestParam(value="logo") MultipartFile multipartFile){
		//������ҵ����
		HashMap<String, String> map = new HashMap<>();
		map.put("leader_name", leader_name);
		map.put("name", name);
		map.put("desc", desc);
		map.put("id", id);
		//������ҵ
		companyService.createCompany(map);
		//�ض����б�ҳ
		return "redirect:/company";
	}
	@RequestMapping(path="/{id}",method=RequestMethod.POST)
	@ResponseBody
	public String delete(@PathVariable("id") Integer id){
		companyService.deleteCompany(id);
		return id.toString();
	}
	@RequestMapping("/{id}/edit")
	public ModelAndView editCompany(@PathVariable("id") Integer id){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("position","�޸���ҵ");
		Company com = companyService.searchOneCompany(id);
		map.put("company", com);
		return new ModelAndView("company/edit",map);
	}
	@RequestMapping("/{id}/create")
	public String update(@RequestParam(value="id") String id,
						 @RequestParam(value="name") String name,
						 @RequestParam(value="leader") String leader_name,
						 @RequestParam(value="desc") String desc,
						 @RequestParam(value="logo") MultipartFile multipartFile){
		//������ҵ����
		HashMap<String, String> map = new HashMap<>();
		map.put("leader_name", leader_name);
		map.put("name", name);
		map.put("desc", desc);
		map.put("id", id);
		//������ҵ
		Company company = companyService.updateCompany(map);
		System.out.println("===================������ɣ�"+company);
		//�ض����б�ҳ
		return "redirect:/company";
	}
}
