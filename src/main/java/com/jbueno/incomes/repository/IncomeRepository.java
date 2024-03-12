package com.jbueno.incomes.repository;

import com.jbueno.incomes.entities.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {

}
