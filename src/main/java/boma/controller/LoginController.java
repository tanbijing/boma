package boma.controller;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author acer
 * ��¼
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	/**
	 * ��¼
	 */
	@RequestMapping("")
	public ModelAndView index(HttpSession session){
		//TODO
		return new ModelAndView("login/login");
	}
	@RequestMapping(value="/in",method=RequestMethod.POST)
	public String login(HttpSession session,@RequestParam(value="name",required=false) String name,@RequestParam(value="pwd",required=false) String pwd){
		//TODO
		session.setAttribute("user", "tom");
		//�ض���  
        return "redirect:/company";
	}
	
	/**
	 * ע��
	 */
	@RequestMapping(value="/out",method=RequestMethod.GET)
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:/login";
	}
}
