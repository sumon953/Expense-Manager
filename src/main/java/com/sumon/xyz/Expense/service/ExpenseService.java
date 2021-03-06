package com.sumon.xyz.Expense.service;

import com.sumon.xyz.Expense.model.Expense;


import java.util.List;

public interface ExpenseService {

    List<Expense> findAll();

    void save(Expense expense);

    Expense findById(Long id);

    void delete(Long id);
}
