package com.cg.wallet.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.wallet.bean.Customer;
import com.cg.wallet.bean.Wallet;
import com.cg.wallet.exception.WalletException;
import com.cg.wallet.service.WalletService;

@Controller
public class WalletController {

	@Autowired
	private WalletService service;

	@RequestMapping(value = "/fromcreateaccountpage", method = RequestMethod.POST)
	public ModelAndView createAccount(@ModelAttribute("create") Customer cust) throws WalletException {
		System.out.println(cust);
		Customer c = new Customer();
		c = service.createaccount(cust);
		Wallet wallet = new Wallet(new BigDecimal("500"));
		ModelAndView mav = new ModelAndView("createaccountsuccess", "success", c);
		return mav;
	}

	@RequestMapping(value = "/fromshowbalancepage")
	public ModelAndView getShowBalance(@RequestParam("mobileNo") String mobileNo) throws WalletException {
		Customer customer = service.showBalance(mobileNo);
		ModelAndView mav = new ModelAndView("showbalancesuccesspage", "customer", customer);
		return mav;
	}

	@RequestMapping(value = "/fromdepositpage")
	public ModelAndView depositAmount(@RequestParam("mobileNo") String mobileNo,
			@RequestParam("amount") BigDecimal amount) throws WalletException {
		Customer customer = service.deposit(mobileNo, amount);
		ModelAndView mav = new ModelAndView("depositsuccesspage", "customer", customer);
		return mav;
	}
	
	@RequestMapping(value = "/fromwithdrawpage")
	public ModelAndView withdrawAmount(@RequestParam("mobileNo") String mobileNo,
			@RequestParam("amount") BigDecimal amount) throws WalletException {
		Customer customer = service.withdraw(mobileNo, amount);
		ModelAndView mav = new ModelAndView("withdrawsuccesspage", "customer", customer);
		return mav;
	}
	
	@RequestMapping(value = "/fromfundtransferpage")
	public ModelAndView fundtransferAmount(@RequestParam("mobsen") String mobsen,
			@RequestParam("mobrec") String mobrec,
			@RequestParam("amount") BigDecimal amount) throws WalletException {
		Customer customer = service.fundtransfer(mobsen, mobrec,amount);
		ModelAndView mav = new ModelAndView("fundtransfersuccesspage", "customer", customer);
		return mav;
	}
	

}
