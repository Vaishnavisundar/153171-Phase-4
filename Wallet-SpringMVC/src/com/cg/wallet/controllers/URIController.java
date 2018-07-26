package com.cg.wallet.controllers;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.wallet.bean.Customer;
import com.cg.wallet.bean.Wallet;

@Controller
public class URIController {
	
	@RequestMapping("/")
	public String getIndexPage() {
		return "indexpage";
	}
	
	@RequestMapping("/createaccount")
	public String createNewAccount() {
		return "createaccountpage";	
	}
	
	@RequestMapping("/index")
	public String getHome() {
		return "indexpage";
	}
	
	@RequestMapping("/showbalance")
	public String showBalance() {
		return "showbalancepage";
	}
	
	@RequestMapping("/deposit")
	public String depositAmount() {
		return "depositpage";
	}
	
	
	@RequestMapping("/withdraw")
	public String withdrawAmount() {
		return "withdrawpage";
	}
	
	@RequestMapping("/transferfund")
	public String transferfundAmount() {
		return "transferfundpage";
	}
	
	
	@ModelAttribute("create")
	public Customer modelCreate() {
		return new Customer();	
	}
	

	
	
/*	@ModelAttribute("show")
	public Customer show() {
		return new Customer();
	}*/
	

}
