package com.cg.wallet.service;

import java.math.BigDecimal;

import com.cg.wallet.bean.Customer;
import com.cg.wallet.exception.WalletException;

public interface WalletService {

	Customer createaccount(Customer cust) throws WalletException;

	Customer showBalance(String string)throws WalletException;

	Customer deposit(String mobileNo, BigDecimal amount)throws WalletException;

	Customer withdraw(String mobileNo, BigDecimal amount)throws WalletException;

	Customer fundtransfer(String mobsen, String mobrec, BigDecimal amount2)throws WalletException;

}
