package com.skcc.sot.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skcc.sot.service.UserService;
import com.skcc.sot.vo.UserVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Resource(name="userService")
	private UserService userService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String test(Locale locale, Model model) throws Exception{
		logger.info("#####Test#####");
		List<UserVO> userList = userService.selectUser();
		model.addAttribute("userList", userList);
		logger.info("#####UserList#####: "+userList);
		return "test";
	}
	
	@RequestMapping(value = "/index.do", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		return "index";
	}
	
	@RequestMapping(value = "/mytrip.do", method = RequestMethod.GET)
	public String mytrip(Locale locale, Model model) {
		return "mytrip";
	}
	
	@RequestMapping(value = "/flighlist.do", method = RequestMethod.GET)
	public String flighlist(Locale locale, Model model) {
		return "flighlist";
	}
	
	@RequestMapping(value = "/option.do", method = RequestMethod.GET)
	public String option(Locale locale, Model model) {
		return "option";
	}
	
	@RequestMapping(value = "/detail.do", method = RequestMethod.GET)
	public String detail(Locale locale, Model model) {
		return "detail";
	}
	
	@RequestMapping(value = "/packages.do", method = RequestMethod.GET)
	public String packages(Locale locale, Model model) {
		return "packages";
	}
	
	@RequestMapping(value = "/prodrule.do", method = RequestMethod.GET)
	public String prodrule(Locale locale, Model model) {
		return "prodrule";
	}
	
	@RequestMapping(value = "/dcrule.do", method = RequestMethod.GET)
	public String dcrule(Locale locale, Model model) {
		return "dcrule";
	}
	
	@RequestMapping(value = "/index_backup.do", method = RequestMethod.GET)
	public String index_backup(Locale locale, Model model) {
		return "index_backup";
	}
	
}
