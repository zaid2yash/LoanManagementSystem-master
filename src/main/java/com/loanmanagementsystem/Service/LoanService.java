package com.loanmanagementsystem.Service;

import com.loanmanagementsystem.Entity.Loan;

import java.util.List;

public interface LoanService {
    List<Loan> getAllLoan();
    Loan saveLoan(Loan loan);

    Loan getLoanById(Long id);

    Loan updateLoan(Loan loan);

    void deleteLoantById(Long id);
}
