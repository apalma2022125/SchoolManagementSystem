package com.angelopalma.financialManagementAPI.config.service.financial;

import com.angelopalma.financialManagementAPI.config.model.FinancialSummary;
import com.angelopalma.financialManagementAPI.config.model.User;

import java.time.LocalDate;

public interface FinanceService {
    /*
        List<FinancialSummary> findAll();
        FinancialSummary findById(String id);*/
    FinancialSummary generateSummary(User user, LocalDate from, LocalDate to);

}