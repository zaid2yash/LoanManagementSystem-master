package com.loanmanagementsystem.Repository;

import com.loanmanagementsystem.Entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan,Long> {
}
