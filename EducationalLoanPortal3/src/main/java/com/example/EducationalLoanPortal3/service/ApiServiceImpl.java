package com.example.EducationalLoanPortal3.service;

import java.util.List;

import com.example.EducationalLoanPortal3.model.LoanApplicationModel;
import com.example.EducationalLoanPortal3.model.UserModel;

public interface ApiServiceImpl {
	public String login(String email, String password);
	public UserModel signup(UserModel u);
	public List<LoanApplicationModel> getAllLoans();
	public List<UserModel> getAllUsers();
	public LoanApplicationModel viewLoan(int user);
	public String delete(int id);
	public LoanApplicationModel saveLoan(LoanApplicationModel l);
	public LoanApplicationModel updateLoan(LoanApplicationModel l, int id);
	public void deleteLoan(int id);
}
