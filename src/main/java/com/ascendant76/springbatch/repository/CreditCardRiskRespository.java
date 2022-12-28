package com.ascendant76.springbatch.repository;

import com.ascendant76.springbatch.domain.CreditCardRisk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRiskRespository extends JpaRepository<CreditCardRisk, Long> {
}
