package com.snowball.stock.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.snowball.stock.model.BankAccount;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount,UUID> {

}
