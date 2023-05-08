package com.example.EducationalLoanPortal3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationalLoanPortal3.model.LoanApplicationModel;


public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel, Integer> {

}
