package com.angelopalma.financialManagementAPI.config.repository.financial;

import com.angelopalma.financialManagementAPI.config.model.FinancialSummary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinanceRepository extends MongoRepository<FinancialSummary, String> {


}