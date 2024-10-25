package com.angelopalma.financialManagementAPI.config.repository.category;

import com.angelopalma.financialManagementAPI.config.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
}
