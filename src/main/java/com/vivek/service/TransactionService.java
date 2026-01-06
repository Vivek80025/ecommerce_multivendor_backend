package com.vivek.service;

import com.vivek.model.Order;
import com.vivek.model.Seller;
import com.vivek.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}
