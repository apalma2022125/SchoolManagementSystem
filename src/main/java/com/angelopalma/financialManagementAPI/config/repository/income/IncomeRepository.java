package com.angelopalma.financialManagementAPI.config.repository.income;

import com.angelopalma.financialManagementAPI.config.model.Income;
import com.angelopalma.financialManagementAPI.config.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IncomeRepository extends MongoRepository <Income, String> {
    List<Income> findByUser(User user);

    List<Income> findByUserAndDateBetween(User user, LocalDate startDate, LocalDate endDate);
}
