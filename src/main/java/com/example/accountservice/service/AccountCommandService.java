package com.example.accountservice.service;

import com.example.accountservice.model.AccountCreateDTO;
import com.example.accountservice.model.MoneyCreditDTO;
import com.example.accountservice.model.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {

  CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
  CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
  CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
