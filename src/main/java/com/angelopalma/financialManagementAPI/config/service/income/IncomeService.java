    package com.angelopalma.financialManagementAPI.config.service.income;

    import com.angelopalma.financialManagementAPI.config.model.Income;
    import com.angelopalma.financialManagementAPI.config.model.User;

    import java.util.List;

    public interface IncomeService {

        List<Income> findAll();
        Income findById(String id);
        Income save(Income income);
        Income update(String id, Income income);
        void deleteById(String id);
        List<Income> findByUser(User user);
        List<Income> findIncomesForAuthenticatedUser();
    }
