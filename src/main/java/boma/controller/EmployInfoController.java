package boma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employ_info")
public class EmployInfoController {
	@RequestMapping("/list")
	public ModelAndView list(){
		return new ModelAndView("employ_info/list");
	}
}
