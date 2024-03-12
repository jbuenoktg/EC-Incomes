package com.jbueno.incomes.controller;

import com.jbueno.incomes.entities.Income;
import com.jbueno.incomes.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/incomes")
public class IncomeController {

    @Autowired
    IncomeRepository incomeRepository;


    @GetMapping("/")
    public ResponseEntity<List<Income>> getAllIncomes() {
        return ResponseEntity.ok(incomeRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Income> getIncomeById(Long id) {
        return ResponseEntity.ok(incomeRepository.findById(id).get());
    }

    @PostMapping(value = "/")
    public ResponseEntity<Income> createIncome(Income income) {
        return ResponseEntity.ok(incomeRepository.save(income));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Income> updateIncome(Long id, Income income) {
        return ResponseEntity.ok(incomeRepository.save(income));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteIncome(Long id) {
        incomeRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    
}
