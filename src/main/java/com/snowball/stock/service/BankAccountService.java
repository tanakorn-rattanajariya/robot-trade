package com.snowball.stock.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.snowball.stock.model.BankAccount;
import com.snowball.stock.repository.BankAccountRepository;

@Service
public class BankAccountService extends BaseService<BankAccount,UUID,BankAccountRepository> {

}
