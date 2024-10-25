package com.angelopalma.financialManagementAPI.config.repository.expense;

import com.angelopalma.financialManagementAPI.config.model.Expense;

import com.angelopalma.financialManagementAPI.config.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {
    List<Expense> findByUser(User user);
    List<Expense> findByUserAndDateBetween(User user, LocalDate startDate, LocalDate endDate);

}
