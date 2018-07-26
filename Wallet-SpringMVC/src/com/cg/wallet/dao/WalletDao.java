package com.cg.wallet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.wallet.bean.Customer;

public interface WalletDao extends JpaRepository<Customer, String>{

}
