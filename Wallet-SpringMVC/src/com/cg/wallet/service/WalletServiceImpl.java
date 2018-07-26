package com.cg.wallet.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.wallet.bean.Customer;
import com.cg.wallet.bean.Wallet;
import com.cg.wallet.dao.WalletDao;
import com.cg.wallet.exception.WalletException;

@Component(value="service")
public class WalletServiceImpl implements WalletService{

	@Autowired
	private WalletDao dao;
	
	@Override
	public Customer createaccount(Customer cust)throws WalletException {
		return dao.save(cust);
	}

	@Override
	public Customer showBalance(String string)throws WalletException {
		return dao.findOne(string);
	}

	@Override
	public Customer deposit(String mobileNo, BigDecimal amount)throws WalletException  {
		
		    Customer c=dao.findOne(mobileNo);
			BigDecimal balance=c.getWallet().getBalance().add(amount);
			Wallet wallet=new Wallet(balance);
			c.setWallet(wallet);
			if(dao.save(c)!=null) {
				return c;
			}
			else return null;
		
	}

	@Override
	public Customer withdraw(String mobileNo, BigDecimal amount)throws WalletException {
		
		Customer c=dao.findOne(mobileNo);
		BigDecimal balance=c.getWallet().getBalance().subtract(amount);
		Wallet wallet=new Wallet(balance);
		c.setWallet(wallet);
		if(dao.save(c)!=null) {
			
			return c;
		}
		return null;
	}

	@Override
	public Customer fundtransfer(String mobsen, String mobrec, BigDecimal amount2)throws WalletException {
		
		Customer csen=dao.findOne(mobsen);
		Customer crec=dao.findOne(mobsen);
		BigDecimal balsen=csen.getWallet().getBalance().subtract(amount2);
		BigDecimal balrec=crec.getWallet().getBalance().add(amount2);
		Wallet wsen=new Wallet(balsen);
		Wallet wrec=new Wallet(balrec);
		csen.setWallet(wsen);
		crec.setWallet(wrec);
		if(dao.save(csen)!= null && dao.save(crec)!=null) {
			return csen;
		}
		return null;
	}



}
